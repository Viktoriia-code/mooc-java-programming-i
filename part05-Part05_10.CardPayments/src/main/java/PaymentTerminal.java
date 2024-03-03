
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        if (payment >= 2.5) {
            this.money += 2.5;
            this.affordableMeals += 1;
            return payment - 2.5;
        }
        return payment;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        if (payment >= 4.3) {
            this.money += 4.3;
            this.heartyMeals += 1;
            return payment - 4.3;
        }
        return payment;
    }
    
    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        if (card.balance() >= 2.5) {
            card.takeMoney(2.5);
            this.affordableMeals += 1;
            return true;
        }
        // otherwise false is returned
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        if (card.balance() >= 4.3) {
            card.takeMoney(4.3);
            this.heartyMeals += 1;
            return true;
        }
        // otherwise false is returned
        return false;
    }
    
    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            this.money += sum;
        }
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
