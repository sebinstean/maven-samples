package Calculator.Operations;

import java.util.List;

/**
 * Created by sebi on 10/10/2017.
 */
public class Minim implements IOperation {
    @Override
    public double compute(List<Double> elements) throws CalcException {
        if(elements.size()==2){
            return elements.get(0) < elements.get(1) ? elements.get(0) : elements.get(1);
        }else{
            throw new CalcException("invalid no arguments at minimum");
        }
    }
}
