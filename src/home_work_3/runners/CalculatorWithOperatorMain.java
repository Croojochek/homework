package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    /** Создать класс CalculatorWithOperatorMain в котором будет точка входа (main метод).
     * В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1.
     * Вывести в консоль результат.
     */
    public static void main(String[] args) {
        CalculatorWithOperator calc = new CalculatorWithOperator();

        double result = calc.plus(calc.plus(4.1, calc.multi(15, 7)), calc.pow(calc.div(28, 5), 2));
        System.out.println(result);
    }
}
