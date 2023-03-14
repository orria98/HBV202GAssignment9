package is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod;

public class NumberLeaf extends Observable implements MathExpressions {
    private int number;

    public NumberLeaf(int number) {
        this.number = number;
    }

    
    public int getResult() {
        return number;
    }

    public void setValue(int number){
        this.number = number;
        notifyObservers();
    }

}
