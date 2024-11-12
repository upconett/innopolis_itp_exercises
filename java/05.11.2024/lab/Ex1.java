package lab;

public class Ex1 {

    public static class NotEnoughMoney extends Exception {}
    public static class NegativeMoney extends Exception {}

    public enum Drink {
        COKE ("Coke Cola Black", 25),
        SPRITE("Sprite Refreshing", 20),
        FANTA ("Fanta Ginger", 40);

        public final String name;
        public final int price;

        private Drink(String name, int price) {
            this.name = name; this.price = price;
        }
    }

    public enum Money {
        D1 (1),
        D2 (2),
        D5 (5),
        D10 (10),
        D25 (25),
        D50 (50),
        D100 (100);

        public final int denomination;

        private Money(int denomination) {
            this.denomination = denomination;
        }
    }

    public static class VendingMachine {
        public static int buy(Drink drink, double money) throws NotEnoughMoney, NegativeMoney {
            if (drink.price > money) throw new NotEnoughMoney();
            if (money < 0) throw new NegativeMoney();

            double left = money - drink.price;
            if (left < 1) return 0;

            Money[] money_types = Money.values();
            for (int i = 1; i < money_types.length; i++) {
                if (money_types[i].denomination > left)
                    return money_types[i-1].denomination;
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        try {
            int spare = VendingMachine.buy(Drink.COKE, 36);
            System.out.println("Success!\nHere is your spare: " + spare);
        }
        catch (NotEnoughMoney e) {
            System.out.println("You have not enough money to buy that :("); }
        catch (NegativeMoney e) {
            System.out.println("You cannot insert negative amount of money :("); }
    }
}