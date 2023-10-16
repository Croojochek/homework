package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        ICalculator calculator = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoAgregationInterface calc = new CalculatorWithCounterAutoAgregationInterface(calculator);

        double result = calc.plus(calc.plus(4.1, calc.multi(15, 7)), calc.pow(calc.div(28, 5), 2));

        System.out.println(result);
        System.out.println(calc.getCountOperation());
    }
}
