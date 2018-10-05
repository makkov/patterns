package chain.chains;

import chain.Chain;
import chain.Passenger;

public class CheckCash extends Chain {

    private static final double maxCash = 2000;

    @Override
    public boolean check(Passenger passenger) {
        if (passenger.getCash() > maxCash) {
            return false;
        } else {
            return checkNext(passenger);
        }
    }
}
