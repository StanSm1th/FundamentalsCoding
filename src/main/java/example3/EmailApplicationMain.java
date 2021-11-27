package example3;

import java.io.FileNotFoundException;
import java.util.List;

public class EmailApplicationMain {

    public static void main(String[] args) throws FileNotFoundException {
        List<Account> accountList = AccountService.getAccountsFromDatabase();

//        Account newEmployeeAccount = new Account("John", "Smith");
//        System.out.println(newEmployeeAccount);
        System.out.println(accountList + "\n");

    }
}