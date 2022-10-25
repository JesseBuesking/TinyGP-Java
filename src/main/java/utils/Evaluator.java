package utils;

import lombok.NoArgsConstructor;
import org.matheclipse.core.eval.ExprEvaluator;
import org.matheclipse.core.interfaces.IExpr;

@NoArgsConstructor
public class Evaluator {

    public String optimize(String function) {

        var functionWithArg = function.replace("X1", "x").replace("X2", "y");
        ExprEvaluator evaluator = new ExprEvaluator();
        IExpr result = evaluator.eval(functionWithArg);

        return result.toString();
    }
}
