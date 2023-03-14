package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;
import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements MathExpressions, Observer
{
    private int lastObservedResult;
    private List<MathExpressions> children = new ArrayList<MathExpressions>();
    

    public MultiplyComposite()
    {
        
    }

    public int getLastObservedResult(){
        return lastObservedResult;
    }

    public void add(MathExpressions m){
        children.add(m);
    }

    public void remove(MathExpressions m){
        children.remove(m);
    }
    
    public int getResult(){
        int product = 1;
        for(MathExpressions child: children){
            product *= child.getResult();
        }
        return product;
    }
    public void update(){
        lastObservedResult = getResult();

    }
}
