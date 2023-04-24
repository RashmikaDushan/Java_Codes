import java.util.ArrayList;
import java.util.Scanner;
public class ATM {
    public String branch_name;
    public Bank bank;
    ATM(String branch,Bank bank){ //ATM constructor
        this.branch_name=branch;
        this.bank=bank;
    }

    public void visit_atm(){ //visit atm
        System.out.println("Welcome!\n"); //print welcome
        Scanner scanner = new Scanner(System.in); // get the pin
        System.out.println("Please enter your pin");
        String pin = scanner.nextLine();
        while(true){
            System.out.println("\nChoose the account"); //choose the user and show his accounts and get his account
            bank.show_account(Integer.parseInt(pin));
            String account_number  = scanner.nextLine();
            if(Integer.parseInt(account_number)==-1){
                System.out.println("Good day\n");
                System.exit(0);
            }
            else{
                System.out.println("\n1.View balance\n2.Withdraw money\n3.Deposit money\n4.Exit"); //print options
                int choice = Integer.parseInt(scanner.nextLine());
                switch(choice){ //match-case according to the selected option
                    case 1: //view balance
                        bank.print_balance(Integer.parseInt(account_number));
                        break;
                    case 2: // withdraw money
                        System.out.println("\nEnter amount:");
                        int withdraw_amount = Integer.parseInt(scanner.nextLine());
                        bank.withdraw(Integer.parseInt(account_number),withdraw_amount);
                        break;
                    case 3: //deposit money
                        System.out.println("\nEnter amount:");
                        int deposit_amount = Integer.parseInt(scanner.nextLine());
                        bank.deposit(Integer.parseInt(account_number),deposit_amount);
                        break;
                    case 4: //exit
                        System.out.println("\nGood day\n");
                        System.exit(0);
                }
            }
        }
    }
}

