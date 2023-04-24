import java.util.ArrayList;
public class Client {

    private String id;
    private String name;
    private String nationality;
    private String occupation;
    private String address;
    private int age;
    private String gender;
    private int pin;
    private Bank bank;
    private ArrayList<Account> accounts= new ArrayList<>();
    private ArrayList<Loan> loans= new ArrayList<>();

    private String currency;

    //Client constructor
    Client(String id,String name,String nationality,String occupation,String address,int age,String gender,int pin,Bank bank){
        this.name=name;
        this.id=id;
        this.nationality=nationality;
        this.occupation=occupation;
        this.address=address;
        this.age=age;
        this.gender=gender;
        this.pin=pin;
        this.bank=bank;
    }

    public void create_saving_account(String account_number,String currency,String branch){ //create saving acoount
        if((this.currency==null) || (this.currency==currency)){
            SavingAccount account = new SavingAccount(account_number,currency,branch);
            accounts.add(account);
            this.currency=currency;
            this.bank.add_to_account_list(Integer.parseInt(account_number),account);
        }
        else{
            System.out.println("You can't use "+currency+". Only "+this.currency);
        }
    }

    public void create_current_account(String account_number,String currency,String branch){ //create current account
        if((this.currency==null) || (this.currency==currency)){
            CurrentAccount account = new CurrentAccount(account_number,currency,branch);
            accounts.add(account);
            this.currency=currency;
            this.bank.add_to_account_list(Integer.parseInt(account_number),account);
        }
        else{
            System.out.println("You can't use "+currency+". Only "+this.currency);
        }
    }

    public void get_loan(String accountNumber, String currency, int amount,double interest,int duration){ //get loan
        if(!accounts.isEmpty()){
            Loan loan = new Loan(accountNumber, currency, amount,interest,duration);
            loans.add(loan);
            this.bank.add_to_loan_list(loan);
            System.out.println("You are eligible for the loan");
        }
        else{
            System.out.println("You must create an account first");
        }
    }

    public ArrayList<Account> return_accounts() { //return accounts of a client
        return this.accounts;
    }
}
