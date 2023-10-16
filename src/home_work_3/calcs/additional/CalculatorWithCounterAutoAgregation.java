package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAgregation {
    /**
     * Создать класс CalculatorWithCounterAutoAgregation.
     * 	8.1 Все методы и поля объявленные в данном классе НЕ статические (не имеют модификатор static).
     * 	8.2 Внутри класса мы должны создавать поле хранящее объект класса калькулятор.
     * 	Для примера можно использовать любой тип калькулятора. Я возьму для примера CalculatorWithMathCopy
     * 	8.3 Для инициализации данного поля требуется использовать конструктор в который будут передавать CalculatorWithMathCopy.
     * 	8.4 Данный класс напрямую не умеют считать математику, он умеют делегировать расчёт математики калькулятору который сохранён в его поле.
     * 	8.5 В классах должны присутствовать математические методы:
     * 		8.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
     * 		8.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
     * 	8.6 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного калькулятора.
     * 	При вызове данного метода счётчик учёта не увеличивается.
     * 	8.7 Создать класс CalculatorWithCounterDelegateAgregationMain в котором будет точка входа (main метод).
     * 	В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1.
     * 	Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
     */

    private CalculatorWithMathCopy calc;

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calculator) {
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
