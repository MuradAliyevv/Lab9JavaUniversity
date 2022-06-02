import java.util.UUID;
public class Main {
    static UUID rawID = UUID.randomUUID();
    static String ID = rawID.toString();

    public static void main(String[] args) throws NotEnoughMoney {
        int withdraw = 20001, balance = 20000;
        Account acc = new Account(balance, "Murad", ID);
        try {
            if (balance >= withdraw)
                acc.Cal(withdraw);
            else
                throw new NotEnoughMoney();
        } catch (NotEnoughMoney e) {
            System.out.println(e.getMessage());
        } finally {
            acc.Cal(withdraw);
        }
    }
}
