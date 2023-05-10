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
    public static void yearOs (int clientDeviceYear, int clientOS) {
        if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите приложение для Android по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегчённую версию приложения для IOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите приложение для IOS по ссылке");
        }
        }

    public static int calculateTimeForDelivery(int distance){
        if(distance < 20) return 1;
        else if(distance < 60) return 2;
        else if(distance <= 100) return 3;
        else return -1;
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
        yearOs(clientDeviceYear,clientOS);
    }
    public static void task3() {
        System.out.println("Задача3");
        int deliveryDistance = 95;
        int daysForDelivery = calculateTimeForDelivery(deliveryDistance);
        if(daysForDelivery > 0)
            System.out.println("Потребуется дней: " + daysForDelivery);
        else System.out.println("Доставки нет");
    }

    }

