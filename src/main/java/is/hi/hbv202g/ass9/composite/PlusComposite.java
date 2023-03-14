package is.hi.hbv202g.ass9.composite;
import java.util.ArrayList;
import java.util.List;


public class PlusComposite implements MathExpressions
{

    

    private List<MathExpressions> children = new ArrayList<MathExpressions>();

    public PlusComposite(){

    }

    public void add(MathExpressions m){
        children.add(m);
    }

    public void remove(MathExpressions m ){
        children.remove(m);
    }

    public int getResult(){
        int sum = 0;
        for(MathExpressions child : children){
            sum += child.getResult();
        }
    
        return sum;
    }
}