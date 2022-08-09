public class main {
    public static void main(String[] args) {

        int initialBalance = 100;
        int payment = 1000;
        int bonusPerPayment = 100;
        int bonus;

        if (payment >= 1000) {
            bonus = payment / bonusPerPayment;
        } else {
            bonus = 0;
        }
        int total = initialBalance + payment + bonus;

        System.out.println("Баланс Вашего лицевого счета составляет " + initialBalance + " руб.");
        System.out.println("Вы пополнили баланс на " + payment + " руб.");
        System.out.println("Вам начисленно " + bonus + " боннусов и Ваш итоговый баланс составляет " + total + " руб.");


    }
}