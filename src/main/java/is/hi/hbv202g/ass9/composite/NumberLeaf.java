package is.hi.hbv202g.ass9.composite;

public class NumberLeaf implements MathExpressions {
    private int number;

    public NumberLeaf(int number) {
        this.number = number;
    }

    
    public int getResult() {
        return number;
    }
}
