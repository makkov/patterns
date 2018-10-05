package chain.chains;

import chain.Chain;
import chain.Passenger;

public class CheckHasDocuments extends Chain {


    @Override
    public boolean check(Passenger passenger) {
        if (passenger.isHasDocuments()) {
            return checkNext(passenger);
        } else {
            return false;
        }
    }
}
