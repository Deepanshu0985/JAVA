
import oopscalss.Bankaccount;

public class Main {
    
    public static void main(String[] args) {
        Bankaccount account = new Bankaccount("123456", "John Doe", 1000.0);
        account.deposit(500.0);
        account.withdraw(200.0);
        System.out.println(account.getAccountDetails());
    }
}
