package CreditCard;

import java.util.Scanner;


public class BankMachine {

    private int balance;
    private int previousTransaction;
    private String customerName;
    private String customerId;

    public BankMachine(String customerName, String customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
            previousTransaction = amount;
            System.out.println("Your current balance: " + balance);
        } else {
            System.out.println("Neigiama suma negalima!");
        }
    }

    public void showPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Buvo ivesta " + previousTransaction + " euru.");
        } else if (previousTransaction < 0) {
            System.out.println("Buvo isimta " + previousTransaction + " euru.");
        } else {
            System.out.println("Jokiu operaciju nerasta.");
        }
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance = balance - amount;
            previousTransaction = -amount;
            System.out.println("Your current balance is:" + balance);
        } else {
            System.out.println("Account balance too low");
            System.out.println("Your current balance is: " + balance);
        }

    }

    public void showMenu(CreditCard creditCard) {

        boolean isAuthenticated = authenticate(creditCard);

        if (isAuthenticated) {
            char selection;
            Scanner scanner = new Scanner(System.in);

            printGreeting();


            do {                     // daryk sita veiksma
                printMenuSelection();

                System.out.println("____________________________");
                System.out.println("Pasirinkite norima operacija");
                System.out.println("____________________________");
                selection = scanner.next().charAt(0);
                System.out.println();

                switch (selection) {
                    case 'A':
                        System.out.println("Saskaitos likutis = " + balance);
                        System.out.println();
                        break;
                    case 'B':
                        System.out.println("Iveskite sumaa, kuria norite prideti: ");
                        int amountToAdd = scanner.nextInt();
                        deposit(amountToAdd);
                        System.out.println();
                        break;

                    case 'C':
                        System.out.println("Iveskite suma, kuria norite issimti: ");
                        int amountToWithdraw = scanner.nextInt();
                        withdraw(amountToWithdraw);
                        System.out.println();
                        break;

                    case 'D':
                        System.out.println("Paskutinis atliktas veiksmas: ");
                        showPreviousTransaction();
                        System.out.println();
                        break;

                    case 'E':
                        System.out.println("Thank you, have a good day!");
                        break;

                    default:
                        System.out.println("Your choice is invalid");
                        System.out.println("Choose from available option");
                        break;


                }


            } while (selection != 'E');             // kol sita salyga teisinga

        }
    }

    private void printMenuSelection() {
        System.out.println("A. Saskaitos likutis: ");
        System.out.println("B. Prideti pinigu: ");
        System.out.println("C. Issimti pinigu: ");
        System.out.println("D. Paskutinis veiksmas: ");
        System.out.println("E. Exit");
    }

    private void printGreeting() {
        System.out.println("Sveikiname prisijungus!");
        System.out.println("Jusu vartotoji ID yra " + customerId);
        System.out.println("Jusu vartoto vardas yra " + customerName);
        System.out.println();
    }

    private boolean authenticate(CreditCard creditCard) {
        System.out.println("Iveskite PIN:");
        Scanner scanner = new Scanner(System.in);
        int pinCode = scanner.nextInt();
        return pinCode == creditCard.getCardPin();
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPreviousTransaction() {
        return previousTransaction;
    }

    public void setPreviousTransaction(int previousTransaction) {
        this.previousTransaction = previousTransaction;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}