package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;
import java.util.ArrayList;
import java.util.List;


public class PlusComposite implements MathExpressions, Observer
{
    private List<MathExpressions> children = new ArrayList<MathExpressions>();

    private int lastObservedResult;

    public PlusComposite(){

    }

    public void add(MathExpressions m){
        children.add(m);
    }

    public void remove(MathExpressions m ){
        children.remove(m);
    }

    public int getLastObservedResult(){
        return lastObservedResult;
    }

    public int getResult(){
        int sum = 0;
        for(MathExpressions child : children){
            sum += child.getResult();
        }
        return sum;
    }

    public void update(){
        lastObservedResult = getResult();
        System.out.println(lastObservedResult);

    }
}