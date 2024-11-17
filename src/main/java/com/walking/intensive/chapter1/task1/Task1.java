package com.walking.intensive.chapter1.task1;
import java.util.Scanner;
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
        int age = 0;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введи возраст");
        do
        {
            try {
                String s = in.nextLine();

                int midterm = Integer.parseInt(s) ; //  Убеждаемся что в пользовательском вводе введен int а не что-то другое
                String sYears = "";
                if (midterm > 0 & midterm < 101) { //проверяем что возраст - положительное число и в рамках реальности
                    if (midterm == 1) {
                        sYears = "вам " + (midterm) + " год";
                    }
                    else if(midterm == 0 || midterm >= 5 && midterm <= 9) {
                        sYears = "вам " + (midterm) + " лет";
                    }
                    else if(midterm >= 2 && midterm <= 4) {
                        sYears = "вам " + (midterm) + " года";
                    }
                    else
                        sYears = "вам " + (midterm) + " лет";




                    System.out.println(sYears );

                    // break;


                }
                else {
                    System.out.println("Столько не живут, бро");

                }
            }


            catch (Exception e)
            {
                System.out.println("Чет тут не то");
            }
        }
        while (true);



    }
}
