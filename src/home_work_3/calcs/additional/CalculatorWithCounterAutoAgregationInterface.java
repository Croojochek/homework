package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface {
    /**
     * Создать класс CalculatorWithCounterAutoAgregationInterface.
     * 	11.1 Внутри класса нельзя создавать объекты (использовать new), можно пользоваться только тем что передал вам пользователь вашего класса.
     * 	11.2 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
     * 	11.3 В данном классе должен быть только конструктор принимающий объект типа ICalculator
     * 	11.4 Данный класс напрямую не умеет считать математику, он умеет делегировать расчёт математики калькулятору который передали в конструктор
     * 	11.5 В классе должны присутствовать все методы объявленные в интерфейсе.
     * 	11.6 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного калькулятора.
     * 	При вызове данного метода счётчик учёта не увеличивается.
     * 	11.7 Создать класс CalculatorWithCounterAutoCompositeInterfaceMain в котором будет точка входа (main метод).
     * 	В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1.
     * 	Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
     */
    private ICalculator calc;
    public CalculatorWithCounterAutoAgregationInterface(ICalculator calculator) {
        this.calc = calculator;
    }

    private long count;
    public void incrementCountOperation() {
        count++;
    }
    public long getCountOperation() {
        return count;
    }

    public double div(double a, double b) {
        incrementCountOperation();
        return calc.div(a, b);
    }
    public double plus(double a, double b) {
        incrementCountOperation();
        return calc.plus(a, b);
    }
    public double minus(double a, double b) {
        incrementCountOperation();
        return calc.minus(a, b);
    }
    public double multi(double a, double b) {
        incrementCountOperation();
        return calc.multi(a, b);
    }
    public double pow(double a, int b) {
        incrementCountOperation();
        return calc.pow(a, b);
    }
    public double modul(double a) {
        incrementCountOperation();
        return calc.modul(a);
    }
    public double sqrt(double a) {
        incrementCountOperation();
        return calc.sqrt(a);
    }
}
