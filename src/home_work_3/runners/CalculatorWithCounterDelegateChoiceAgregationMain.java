package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();
        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();
        CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();

        CalculatorWithCounterAutoChoiceAgregation calc1 = new CalculatorWithCounterAutoChoiceAgregation(calculatorWithOperator);

        double result1 = calc1.plus(calc1.plus(4.1, calc1.multi(15, 7)), calc1.pow(calc1.div(28, 5), 2));

        System.out.println(result1);
        System.out.println(calc1.getCountOperation());


        CalculatorWithCounterAutoChoiceAgregation calc2 = new CalculatorWithCounterAutoChoiceAgregation(calculatorWithMathCopy);

        double result2 = calc2.plus(calc2.plus(4.1, calc2.multi(15, 7)), calc2.pow(calc2.div(28, 5), 2));

        System.out.println(result2);
        System.out.println(calc2.getCountOperation());

        CalculatorWithCounterAutoChoiceAgregation calc3 = new CalculatorWithCounterAutoChoiceAgregation(calculatorWithMathExtends);

        double result3 = calc3.plus(calc3.plus(4.1, calc3.multi(15, 7)), calc3.pow(calc3.div(28, 5), 2));

        System.out.println(result3);
        System.out.println(calc3.getCountOperation());


    }
}
