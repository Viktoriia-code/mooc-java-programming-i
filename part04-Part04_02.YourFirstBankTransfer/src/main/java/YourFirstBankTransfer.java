
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account MatthewsAccount = new Account("Matthews account", 1000.00);
        Account myAccount = new Account("My account", 0);
        MatthewsAccount.withdrawal(100);
        myAccount.deposit(100);
        System.out.println(MatthewsAccount);
        System.out.println(myAccount);
    }
}
