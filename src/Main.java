public class Main {
    public static void main(String[] args) {

        int currentBalance = 100; // начальный баланс
        int refillAmount = 1100; // сумма пополнения
        int bonusRubles = 0; // количество бонусных рублей

        if (refillAmount > 1000) {
            bonusRubles = (refillAmount / 100) ;
        }

        currentBalance += refillAmount + bonusRubles;

        System.out.println("Итоговый счёт: " + currentBalance + " рублей");
        System.out.println("Количество бонусных рублей: " + bonusRubles);
    }


}
