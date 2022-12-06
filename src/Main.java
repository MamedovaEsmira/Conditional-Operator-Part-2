public class Main {
    public static void main(String[] args) {
        System.out.println("Задача1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Задача2");
        int clientDeviceYear = 2019;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите  версию приложения для Android по ссылке");
            }
            //Задача3
            System.out.println("Задача3");
            int year = 1904;
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("Год является високосным");
            } else {
                System.out.println("Год не является високосным");
            }
            // Задача4
            System.out.println("Задача4");
            int deliveryDistance = 95;
            int DeliveryDays = 1;

            if (deliveryDistance > 20) {
                DeliveryDays++;
            }
            if (deliveryDistance > 60) {
                DeliveryDays++;
            }
            System.out.println("Потребуется дней:" + DeliveryDays);
        }
        //Задача5
        System.out.println("Задача5");
        int monthNumber = 3;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
        int MonthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("Такого времени года не существует");
        }
        System.out.println("Задача № 6: повышенной сложности");
        int age = 28;
        double salary = 88000;
        if (age >= 23) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 3) + " рублей");
        }
        if (age < 23) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 2) + " рублей");
        } else if (salary >= 50000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 1.2) + " рублей");
        } else {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 1.5) + " рублей");
        }
        task7();}
    public static void task7() {
        System.out.println("Задача № 7: повышенной сложности");
        int age = 25;
        double salary = 60000;
        double wantedSum = 250000;
        double rate = salary > 80000 ? (10 - 0.7) : 10;
        if (age < 23)
            rate += 1;
        else if (age < 30)
            rate += 0.5;
        double maxPayment = salary / 2;
        double regularPayment = wantedSum * (1 + rate / 100) / 12;
        System.out.printf("Максимальный платеж при ЗП  %.2f равен %.2f рублей. Платеж по кредиту %.2f  рублей.",salary, maxPayment, regularPayment);
        System.out.println();
   if(maxPayment<regularPayment)
       System.out.println("Отказано");
    else
       System.out.println("Одобрено");

    }
}



