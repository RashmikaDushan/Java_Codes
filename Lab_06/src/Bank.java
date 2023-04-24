import java.util.HashMap;
import java.util.ArrayList;
public class Bank {
    public String bank_name;

    private HashMap< Integer,Client> client_map = new HashMap< Integer,Client>();
    private HashMap< Integer,Account> account_map = new HashMap< Integer,Account>();
    private ArrayList<Loan> loan_list = new ArrayList<>();
    public ArrayList<ATM> atm_list = new ArrayList<>();
    private HashMap< Integer,Transactions> transaction_map = new HashMap< Integer,Transactions>();


    Bank(String bankName) {
        this.bank_name = bankName;
    } //bank constructor

    //register client
    public Client register_client(String id,String name,String nationality,String occupation,String address,int age,String gender,int pin,Bank bank){
        Client client = new Client(id,name,nationality,occupation,address,age,gender,pin,bank);
        client_map.put(pin,client);
        return client;
    }
    public void add_to_account_list(int account_number,Account account){ //add the newly created account to the account list in the bank
        account_map.put(account_number,account);
    }

    public void add_to_loan_list(Loan loan){
        loan_list.add(loan);
    } //add the loan to the loan list in the bank

    public ATM create_atm(String branch,Bank bank){ //create atm
        ATM atm = new ATM(branch,bank);
        atm_list.add(atm);
        return atm;
    }

    public void show_account(int pin){ //show account of a user using the pin
        if(client_map.containsKey(pin)){
            ArrayList<Account> accounts = client_map.get(pin).return_accounts();
            for (int i = 0; i < accounts.size(); i++) {
                System.out.println(accounts.get(i).account_number);
            }
        }
        else{
            System.out.println("Wrong pin\n");
        }
    }

    public void print_balance(int account_number){ //see the balance
        System.out.println("\nYour current balance is "+account_map.get(account_number).balance_inquiry()+" rupees");
        Transactions t_bal_in = new Balance_Inquiry(transaction_map.size(),account_number,"Successful",account_map.get(account_number).balance_inquiry());
        transaction_map.put(transaction_map.size(),t_bal_in);
    }

    public void withdraw(int account_number,int amount){ //withdraw money
        Account account = account_map.get(account_number);
        if(account_map.get(account_number).balance_inquiry()-amount>=0){
            account.withdraw_acc(amount);
            System.out.println("Your withdraw of "+amount+" rupees is successful");
            System.out.println("Your current balance is "+account_map.get(account_number).balance_inquiry()+" rupees");
            Transactions t_withdraw = new Withdrawal(transaction_map.size(),account_number,"Successful",amount);
            transaction_map.put(transaction_map.size(),t_withdraw);
        }
        else{
            System.out.println("Your current balance is low than the amount you entered");
            System.out.println("Your withdraw of "+amount+" rupees is unsuccessful");
            System.out.println("Your current balance is "+account_map.get(account_number).balance_inquiry()+" rupees");
            Transactions t_withdraw = new Withdrawal(transaction_map.size(),account_number,"unsuccessful",amount);
            transaction_map.put(transaction_map.size(),t_withdraw);
        }
    }

    public void deposit(int account_number,int amount){ //deposit money
        Account account = account_map.get(account_number);
        account.deposit_acc(amount);
        System.out.println("Your deposit of "+amount+" rupees is successful");
        System.out.println("Your current balance is "+account_map.get(account_number).balance_inquiry()+" rupees");
        Transactions t_deposit = new Deposit(transaction_map.size(),account_number,"Successful",amount);
        transaction_map.put(transaction_map.size(),t_deposit);
    }

}
