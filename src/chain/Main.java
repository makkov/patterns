package chain;

import chain.chains.CanEnterQueue;
import chain.chains.CheckCash;
import chain.chains.CheckDrugs;
import chain.chains.CheckHasDocuments;

public class Main {

    public static void main(String[] args) {
        Passenger passenger = new Passenger(true, 10, false);
        Customs customs = new Customs(99, 9);
        Chain passengerCanFly = new CanEnterQueue(customs);
        passengerCanFly.linkWith(
                new CheckCash().linkWith(
                        new CheckDrugs().linkWith(
                                new CheckHasDocuments()
                        )
                )
        );
        System.out.println(passengerCanFly.check(passenger));
    }
}
