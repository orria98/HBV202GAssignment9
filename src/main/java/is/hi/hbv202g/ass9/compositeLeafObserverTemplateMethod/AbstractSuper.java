package is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod;
import java.util.ArrayList;
import java.util.List;
public abstract class AbstractSuper {
    private int lastObservedResult;

    protected List<MathExpressions> children = new ArrayList<MathExpressions>();
    

    public AbstractSuper()
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

    public abstract int getResult();
    
    public void update(){
        lastObservedResult = getResult();

    }
}
