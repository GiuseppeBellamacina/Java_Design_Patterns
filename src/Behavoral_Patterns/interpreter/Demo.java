package interpreter;

import interpreter.expressions.AndExpression;
import interpreter.expressions.Context;
import interpreter.expressions.OrExpression;
import interpreter.expressions.VariableExpression;

public class Demo {
    private static void example1() throws Exception {
        var context = new Context();

        var a = new VariableExpression("A");
        var b = new VariableExpression("B");
        var c = new VariableExpression("C");

        var example1 = new AndExpression(
                a,
                new OrExpression(b, c)
        );

        context.assign(a, true);
        context.assign(b, true);
        context.assign(c, false);

        var result = example1.interpret(context) ? "true" : "false";

        System.out.println("boolean expression A ∧ (B ∨ C) = " + result + ", with variables A=true, B=true, C=false");
    }

    private static void example2() throws Exception {
        var context = new Context();

        var a = new VariableExpression("A");
        var b = new VariableExpression("B");
        var c = new VariableExpression("C");

        var example2 = new OrExpression(
                b,
                new AndExpression(
                        a,
                        new OrExpression(b, c)
                )
        );

        context.assign(a, false);
        context.assign(b, false);
        context.assign(c, true);

        var result2 = example2.interpret(context) ? "true" : "false";

        System.out.println("boolean expression B ∨ (A ∧ (B ∨ C)) = " + result2 + ", with variables A=false, B=false, C=true");
    }

    public static void main(String[] args) throws Exception {
        example1();
        example2();
    }
}
