package com.walking.intensive.chapter1.task2;

/**
 * Реализуйте метод getFlatLocation(), который будет принимать параметрами следующие данные:
 * <ul>
 * <li> Количество этажей в доме;
 * <li> Количество подъездов;
 * <li> Номер нужной квартиры.
 * </ul>
 *
 * <p>Необходимо определить подъезд, этаж и расположение нужной квартиры относительно лифта,
 * руководствуясь следующими правилами:
 * <ul>
 * <li> На этаже 4 квартиры;
 * <li> Нумерация квартир возрастает по часовой стрелке.
 * </ul>
 *
 * <p>Примеры строки, возвращаемой из метода:
 * <ul>
 * <li> 1 кв – 1 подъезд, 1 этаж, слева от лифта, влево
 * <li> 2 кв – 1 подъезд, 1 этаж, слева от лифта, вправо
 * <li> 3 кв – 1 подъезд, 1 этаж, справа от лифта, влево
 * <li> 4 кв – 1 подъезд, 1 этаж, справа от лифта, вправо
 * </ul>
 *
 * <p>Если для дома с указанной этажностью и количеством подъездов квартиры с заданным номером не существует,
 * метод должен вернуть строку "Такой квартиры не существует".
 *
 * <p>Если хотя бы один из указанных параметров некорректный - например, отрицательное число или 0,
 * метод должен вернуть строку "Некорректные входные данные".
 *
 * <p><a href="https://github.com/KFalcon2022/intensive-tasks-2024/blob/master/README.md">Требования к оформлению</a>
 */
public class Task2 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        getFlatLocation(10,3,121);
    }
    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        String flatCalcResult = "empty"; // итоговая строка
        String[] flatOptions = {"слева от лифта, влево", "слева от лифта, вправо", "справа от лифта, влево", "справа от лифта, вправо"};

        int entranceCapacity = (floorAmount * 4)  ; // емкость подьезда
        int wholeHouseCapacity = (entranceCapacity * entranceAmount); // емкость всего дома
        int javaFlatNumber = flatNumber - 1; //нулевая квартира существует
        int exactEntranceCalc = javaFlatNumber / entranceCapacity + 1; //считаем подъезд
        int exactFloorCount = javaFlatNumber % entranceCapacity / 4 + 1 ; // считаем этаж
        int flatLocation = flatNumber % 4; // считаем направление квартиры

        if (flatNumber > wholeHouseCapacity) {
            flatCalcResult = "Такой квартиры не существует";

        }
        else if (flatNumber <= 0 ) {
            flatCalcResult = "Некорректные входные данные";

        }
        else
            switch(flatLocation){
                case (0): flatCalcResult = flatNumber + " кв - " + exactEntranceCalc + " подъезд, " + exactFloorCount + " этаж, " + flatOptions[3]; break;
                case (1): flatCalcResult = flatNumber + " кв - " + exactEntranceCalc + " подъезд, " + exactFloorCount + " этаж, " + flatOptions[0]; break;
                case (2): flatCalcResult = flatNumber + " кв - " + exactEntranceCalc + " подъезд, " + exactFloorCount + " этаж, " + flatOptions[1]; break;
                case (3): flatCalcResult = flatNumber + " кв - " + exactEntranceCalc + " подъезд, " + exactFloorCount + " этаж, " + flatOptions[2]; break;
            }

        return flatCalcResult;
    }
}
