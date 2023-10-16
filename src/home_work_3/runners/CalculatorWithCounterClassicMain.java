package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic();

        double exp1 = calc.multi(15, 7);
        calc.incrementCountOperation();

        double exp2 = calc.plus(4.1, exp1);
        calc.incrementCountOperation();

        double exp3 = calc.div(28, 5);
        calc.incrementCountOperation();

        double exp4 = calc.pow(exp3, 2);
        calc.incrementCountOperation();

        double result = calc.plus(exp2, exp4);
        calc.incrementCountOperation();

        System.out.println(result);
    }
}
