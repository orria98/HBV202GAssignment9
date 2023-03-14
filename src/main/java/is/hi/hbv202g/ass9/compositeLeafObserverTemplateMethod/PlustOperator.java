package is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod;

public class PlustOperator extends AbstractSuper implements MathExpressions, Observer {

    public int getResult(){
        int sum = 0;
        for(MathExpressions child : children){
            sum += child.getResult();
        }
        return sum;
    }
}
