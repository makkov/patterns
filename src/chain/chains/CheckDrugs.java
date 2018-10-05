package chain.chains;

import chain.Chain;
import chain.Passenger;

public class CheckDrugs extends Chain {

    @Override
    public boolean check(Passenger passenger) {
        if (passenger.isHasDrugs()) {
            return false;
        } else {
            return checkNext(passenger);
        }
    }
}
