package chain.chains;

import chain.Chain;
import chain.Customs;
import chain.Passenger;

public class CanEnterQueue extends Chain {

    private Customs customs;

    public CanEnterQueue(Customs customs) {
        this.customs = customs;
    }

    @Override
    public boolean check(Passenger passenger) {
        if (customs.getCapacity() > customs.getBusy()) {
            return checkNext(passenger);
        } else {
            return false;
        }

    }
}
