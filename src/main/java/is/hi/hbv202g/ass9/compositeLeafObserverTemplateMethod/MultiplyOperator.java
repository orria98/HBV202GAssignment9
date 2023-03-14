package is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod;

public class MultiplyOperator extends AbstractSuper implements MathExpressions, Observer {
    public int getResult(){
        int product = 1;
        for(MathExpressions child: children){
            product *= child.getResult();
        }
        return product;
    }
}
