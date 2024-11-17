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
            try { //  Убеждаемся что в пользовательском вводе введен int а не что-то другое
                String s = in.nextLine();
                String sYears; //итоговая строка
                int midterm = Integer.parseInt(s) ;
                if (midterm % 100 >= 11 && midterm % 100 <= 14) {
                    sYears = "вам " + (midterm) + " лет";

                }
                else {
                    int ageLastNumber = midterm % 10;
                    if (ageLastNumber == 1) {
                            sYears = "вам " + (midterm) + " год";
                        }
                        else if(ageLastNumber == 0 || ageLastNumber >= 5 && ageLastNumber <= 9) {
                                sYears = "вам " + (midterm) + " лет";
                            }
                        else if(ageLastNumber >= 2 && ageLastNumber <= 4) {
                                sYears = "вам " + (midterm) + " года";
                            }

                        else sYears = "вам " + (midterm) + " лет";


                }
                System.out.println(sYears);

            }
            catch (Exception e)
                {
                    System.out.println("Некорректный ввод");
                }
        }
        while (true); // итоговое поведение не формализовано - так что бесконечно опрашиваем возраст



    }
}
