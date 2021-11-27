package creditCard;

public class BankMachineMain {
    public static void main(String[] args) {
        CreditCard masterCard = new CreditCard(1234,"Edvinas Pro");
        BankMachine snoras = new BankMachine("Edvinas","1");
        snoras.showMenu(masterCard);

    }
}
