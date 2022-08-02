public class main {
    public static void main(String[] args) {

        int initial_balance = 100;
        int payment = 1891;
        int bonus_per_payment = 100;
        int bonus;

        if (payment >= 1000) {
            bonus = payment / bonus_per_payment;
        } else {
            bonus = 0;
        }
        int total = initial_balance + payment + bonus;

        System.out.println("Баланс Вашего лицевого счета составляет " + initial_balance + " руб.");
        System.out.println("Вы пополнили баланс на " + payment + " руб.");
        System.out.println("Вам начисленно " + bonus + " боннусов и Ваш итоговый баланс составляет " + total + " руб.");


    }
}