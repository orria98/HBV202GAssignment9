package is.hi.hbv202g.ass9.composite;
import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements MathExpressions
{
    private List<MathExpressions> children = new ArrayList<MathExpressions>();
    

    public MultiplyComposite()
    {
        
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
}
