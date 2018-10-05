package chain;

public abstract class Chain {

    private Chain next;

    public Chain linkWith(Chain next) {
        this.next = next;
        return this;
    }

    public abstract boolean check(Passenger passenger);

    public boolean checkNext(Passenger passenger) {
        if (next == null) {
            return true;
        }
        return next.check(passenger);
    }
}
