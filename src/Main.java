import java.awt.*;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }
    public static void calculationYear (int year ) {

        if ((year % 4 == 0) || (year % 400 == 0) && (year % 100 != 0)) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }

    }
    public static void yearOs (int clientDeviceYear) {
        if (clientDeviceYear < 2015  ) {
            System.out.println("Установите облегчённую версию приложения");
        } else if (clientDeviceYear >= 2015 ) {
            System.out.println("Установите приложение ");
        }
        }
    public static int sum () {
        return 95;
    }



    public static void task1() {
        System.out.println("Задача 1");
        int year = 1980;
        calculationYear(year);
    }
    public static void task2() {
        System.out.println("Задача 2");
        int clientDeviceYear = 2015;
        int clientOS = 1;
        if (clientOS == 0 ) {
            yearOs(clientDeviceYear);
            System.out.println( " для IOS");
        } else if (clientOS == 1) {
            yearOs(clientDeviceYear);
            System.out.println(" для Android");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = sum();
        if (sum() <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (sum() > 20 && sum() < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (sum() > 60 && sum() < 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }

    }

}