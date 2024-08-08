package generic.test.ex2;

public class Pair<I,S> {
    private I first;
    private S second;

    public I getFirst() {
        return first;
    }

    public void setFirst(I first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    @Override
    public String toString(){
        return "Pair:"+
                "first= "+first+
                ", second= "+second;
    }
}
