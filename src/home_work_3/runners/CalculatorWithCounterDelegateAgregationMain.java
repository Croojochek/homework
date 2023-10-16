package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoAgregation calc = new CalculatorWithCounterAutoAgregation(calculatorWithMathCopy);

        double result = calc.plus(calc.plus(4.1, calc.multi(15, 7)), calc.pow(calc.div(28, 5), 2));

        System.out.println(result);
        System.out.println(calc.getCountOperation());
    }
}
