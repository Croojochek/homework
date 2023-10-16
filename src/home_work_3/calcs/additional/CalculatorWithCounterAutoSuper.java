package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    /** Создать класс CalculatorWithCounterAutoSuper.
     6.1 Все методы и поля объявленные в данном классе НЕ статические (не имеют модификатор static).
     6.2 Данный класс наследует класс CalculatorWithMathExtends.
     6.3 Данный класс переопределяет все методы полученные в результате наследования и
     в этих методах должен быть реализован механизм учёта их использования (учёт общий для всех методов класса),
     а вместо реализации математики при помощи ключевого слова super вызывает данный метод у родителя.
     Например вызвали метод plus(7, 3) который должен сложить два числа и вернуть результат сложения.
     Внутри метода plus() пишем реализацию учета, а после делаем вызов super.plus(7, 3).
     Использование super позволит вызвать реализацию из родительского класса.
     6.4 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного калькулятора.
     При вызове данного метода счётчик учёта не увеличивается.
     6.5 Создать класс CalculatorWithCounterAutoSuperMain в котором будет точка входа (main метод).
     В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1.
     Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
    */

    private long count;
    public void incrementCountOperation() {
        count++;
    }
    public long getCountOperation() {
        return count;
    }
    @Override
    public double div(double a, double b) {
        incrementCountOperation();
        return super.div(a, b);
    }
    @Override
    public double plus(double a, double b) {
        incrementCountOperation();
        return super.plus(a, b);
    }

    @Override
    public double minus(double a, double b) {
        incrementCountOperation();
        return super.minus(a, b);
    }

    @Override
    public double multi(double a, double b) {
        incrementCountOperation();
        return super.multi(a, b);
    }

    @Override
    public double pow(double a, int b) {
        incrementCountOperation();
        return super.pow(a, b);
    }

    @Override
    public double modul(double a) {
        incrementCountOperation();
        return super.modul(a);
    }

    @Override
    public double sqrt(double a) {
        incrementCountOperation();
        return super.sqrt(a);
    }
}
