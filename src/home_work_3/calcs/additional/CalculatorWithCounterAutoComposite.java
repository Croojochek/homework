package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoComposite {
    /** Создать класс CalculatorWithCounterAutoComposite.
     7.1 Все методы и поля объявленные в данном классе НЕ статические (не имеют модификатор static).
     7.2 Внутри класса мы должны создавать поле хранящее объект класса калькулятор.
     Для примера можно использовать любой тип калькулятора. Я возьму для примера CalculatorWithMathCopy
     7.3 Инициализировать данное поле созданным (использовать new) внутри данного класса объектом калькулятора.
     7.4 Данный класс напрямую не умеют считать математику, он умеют делегировать расчёт математики калькулятору который сохранён в его поле.
     7.5 В классах должны присутствовать математические методы:
     7.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
     7.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
     7.6 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного калькулятора.
     При вызове данного метода счётчик учёта не увеличивается.
     7.7 Создать класс CalculatorWithCounterDelegateCompositeMain в котором будет точка входа (main метод).
     В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1.
     Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
     */

    private CalculatorWithMathCopy calc;
    public CalculatorWithCounterAutoComposite() {
        this.calc = new CalculatorWithMathCopy();
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
