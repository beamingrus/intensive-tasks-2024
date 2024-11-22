package com.walking.intensive.chapter1.task1;

/**
 * Реализуйте метод getAgeString(), который будет принимать параметром целое число (возраст) и возвращать строку
 * вида: "Вам N лет". Программа должна учитывать правила русского языка.
 *
 * <p>Пример верного исполнения кода: "Вам 5 лет", "Вам 4 года".
 * Пример неверной работы программы: "Вам 14 года".
 *
 * <p>Также необходимо учесть негативные сценарии. Например, попытку передать в метод невалидное значение - например,
 * отрицательное число. В таких случаях ожидается, что метод вернет строку "Некорректный ввод".
 *
 * <p><a href="https://github.com/KFalcon2022/intensive-tasks-2024/blob/master/README.md">Требования к оформлению</a>
 */

public class Task1 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе



    }

    static String getAgeString(int age) {
        String sYears; //итоговая строка
        int ageLastNumber = age % 10;


        if (age < 0) {
            sYears = "Некорректный ввод";
        } else if (age % 100 >= 11 && age % 100 <= 14) {
            sYears = "Вам " + (age) + " лет";

        } else if (ageLastNumber == 1) {
            sYears = "Вам " + (age) + " год";

        } else if (ageLastNumber == 0) {
            sYears = "Вам " + (age) + " лет";

        } else if (ageLastNumber >= 5 && ageLastNumber <= 9) {
            sYears = "Вам " + (age) + " лет";

        } else if (ageLastNumber >= 2 && ageLastNumber <= 4) {
            sYears = "Вам " + (age) + " года";

        } else {
            sYears = "Вам " + (age) + " лет";
        }
        return sYears;
    }

}