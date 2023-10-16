package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {
    /**
     * Создать класс CalculatorWithCounterAutoChoiceAgregation.
     * 	9.1 Все методы объявленные в данных классах НЕ статические (не имеют модификатор static).
     * 	9.2 В данном классе должны быть следующие варианты конструктора:
     * 		9.2.1 Принимающий объект типа CalculatorWithOperator
     * 		9.2.2 Принимающий объект типа CalculatorWithMathCopy
     * 		9.2.3 Принимающий объект типа CalculatorWithMathExtends
     * 	9.4 Данные класс также не умеет напрямую считать математику, они умеют делегировать расчёт математики калькулятору который передали в конструктор.
     * 	9.5 В классах должны присутствовать математические методы:
     * 		9.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
     * 		9.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
     * 	9.6 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного калькулятора.
     * 	При вызове данного метода счётчик учёта не увеличивается.
     * 	9.7 Создать класс CalculatorWithCounterDelegateChoiceAgregationMain в котором будет точка входа (main метод). В main методе требуется:
     * 		9.7.1 Создать экземпляр калькулятора используя конструктор принимающий CalculatorWithOperator и
     * 		используя методы из данного экземпляра посчитать выражения из задания 1.
     * 		Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
     * 		9.7.2 Создать экземпляр калькулятора используя конструктор принимающий CalculatorWithMathCopy и
     * 		используя методы из данного экземпляра посчитать выражения из задания 1.
     * 		Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
     * 		9.7.3 Создать экземпляр калькулятора используя конструктор принимающий CalculatorWithMathExtends и
     * 		используя методы из данного экземпляра посчитать выражения из задания 1.
     * 		Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
     */

    private CalculatorWithOperator calculatorWithOperator;
    private CalculatorWithMathCopy calculatorWithMathCopy;
    private CalculatorWithMathExtends calculatorWithMathExtends;

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calculatorWithOperator) {
        this.calculatorWithOperator = calculatorWithOperator;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calculatorWithMathCopy) {
        this.calculatorWithMathCopy = calculatorWithMathCopy;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calculatorWithMathExtends) {
        this.calculatorWithMathExtends = calculatorWithMathExtends;
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
        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.div(a, b);

        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.div(a, b);
        }
        return calculatorWithOperator.div(a, b);
    }
    public double plus(double a, double b) {
        incrementCountOperation();
        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.plus(a, b);

        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.plus(a, b);
        }
        return calculatorWithOperator.plus(a, b);
    }
    public double minus(double a, double b) {
        incrementCountOperation();
        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.minus(a, b);

        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.minus(a, b);
        }
        return calculatorWithOperator.minus(a, b);
    }
    public double multi(double a, double b) {
        incrementCountOperation();
        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.multi(a, b);

        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.multi(a, b);
        }
        return calculatorWithOperator.multi(a, b);
    }
    public double pow(double a, int b) {
        incrementCountOperation();
        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.pow(a, b);

        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.pow(a, b);
        }
        return calculatorWithOperator.pow(a, b);
    }
    public double modul(double a) {
        incrementCountOperation();
        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.modul(a);

        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.modul(a);
        }
        return calculatorWithOperator.modul(a);
    }
    public double sqrt(double a) {
        incrementCountOperation();
        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.sqrt(a);

        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.sqrt(a);
        }
        return calculatorWithOperator.sqrt(a);
    }

}
