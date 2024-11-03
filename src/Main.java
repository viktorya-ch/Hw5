public class Main {
     public static void main(String[] args) {

         //Task#1
         int clientOS = 0;
         if (clientOS == 1) {
             System.out.println("Установите версию приложения для Android по ссылке");
         } else {
             System.out.println("Установите версию приложения для iOS по ссылке");
         }

         //Task#2
         int clientDeviceYear = 2015;
         int clientOS1 = 0;
         if (clientDeviceYear < 2015) {
             if (clientOS1 == 1)
                 System.out.println("Установите версию приложения для Android по ссылке");
             else System.out.println(" Установите версию приложения для iOS по ссылке");
         } else if (clientDeviceYear >= 2015) {
             if (clientOS1 == 1)
                 System.out.println(" Установите облегченную версию приложения для Android по ссылке");
             else
                 System.out.println(" Установите облегченную версию приложения для iOS по ссылке");

         }

         //Task#3

         int year = 2021;
         if (year % 400 == 0) {
             System.out.println(year + " год является високосным");}
         if (year % 4 == 0) {
             if (year % 100 != 0)
                 System.out.println(year + " год является високосным");}
         else System.out.println(year + " год не является високосным");


         //Task#4
         int deliveryDistance = 95;
         int day = 1;
         if (deliveryDistance <= 20)
             System.out.println(" Потребуется дней " + day );
         if (deliveryDistance >= 20 && deliveryDistance <= 60)
             System.out.println(" Потребуется дней " + (day+1) );
         if (deliveryDistance >=60 && deliveryDistance <= 100)
             System.out.println(" Потребуется дней " + (day+2) );
         else if (deliveryDistance > 100)
             System.out.println("Доставки нет");

         //Task#5
         char monthNumber = 12;
         switch (monthNumber) {
             case 1:
                 System.out.println("Принадлежит к сезону зима");
                 break;
             case 2:
                 System.out.println("Принадлежит к сезону зима");
                 break;
             case 3:
                 System.out.println("Принадлежит к сезону весна");
                 break;
             case 4:
                 System.out.println("Принадлежит к сезону весна");
                 break;
             case 5:
                 System.out.println("Принадлежит к сезону весна");
                 break;
             case 6:
                 System.out.println("Принадлежит к сезону лето");
                 break;
             case 7:
                 System.out.println("Принадлежит к сезону лето");
                 break;
             case 8:
                 System.out.println("Принадлежит к сезону лето");
                 break;
             case 9:
                 System.out.println("Принадлежит к сезону осень");
                 break;
             case 10:
                 System.out.println("Принадлежит к сезону осень");
                 break;
             case 11:
                 System.out.println("Принадлежит к сезону осень");
                 break;
             case 12:
                 System.out.println("Принадлежит к сезону зима");
                 break;
             default:
                 System.out.println("Нет такого месяца!");}


     }}
