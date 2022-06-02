import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class Main {
    public static void main(String[] args) throws LoginFailed, CapchaFailed,
            PaymentFailed, NumberFormatException, IOException {

        String username = "Murad", password = "321", capcha = "dog",
                userInput, passInput, capInput;
        int payment, goods = 350;
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Username: ");
            userInput = BR.readLine();
            System.out.print("Password: ");
            passInput = BR.readLine();
            System.out.print("Capcha: ");
            capInput = BR.readLine();

            if (!userInput.equals(username) || !passInput.equals(password)) {
                throw new LoginFailed();
            }
            if (!capInput.equals(capcha)) {
                throw new CapchaFailed();
            } else {
                System.out.print("Payment: ");
                payment = Integer.parseInt(BR.readLine());
                if (payment < goods) {
                    throw new PaymentFailed();
                }
            }

            Success.loginMessage(username);
            Success.paymentMessage(payment, goods);
        } catch (LoginFailed | CapchaFailed | PaymentFailed e) {
            System.out.println(e.getMessage());
        }
    }
}
