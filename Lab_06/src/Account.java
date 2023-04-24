abstract public class Account { //account parent class
    protected String type;
    public String account_number;
    private String currency;
    private String branch;
    protected int balance;

    protected Account( String accountNumber, String currency, String branch) {
        account_number = accountNumber;
        this.currency = currency;
        this.branch = branch;
        this.balance = 0;
    }

    public void deposit_acc(int amount){
        this.balance+=amount;
    } //update balance according to the deposit

    public void withdraw_acc(int amount){ //update balance according to the withdrawal
        this.balance-=amount;
    }

    public int balance_inquiry(){
        return this.balance;
    } // view balance

}


class SavingAccount extends Account{ //saving account child class

    protected SavingAccount(String accountNumber, String currency, String branch) {
        super(accountNumber, currency, branch);
        this.type="Saving Account";
    }

    public void pay_interest(int interest){
        this.balance*=(1+(interest/100));
    }
}

class CurrentAccount extends Account{//current account child class

    protected CurrentAccount(String accountNumber, String currency, String branch) {
        super(accountNumber, currency, branch);
        this.type="Current Account";
    }

}

class Loan{ //loan class
    private int amount;
    private double interest;
    private int duration;
    private String payment_method;
    private String account_number;
    private String currency;

    Loan(String accountNumber, String currency, int amount,double interest,int duration) {
        account_number = accountNumber;
        this.currency = currency;
        this.amount = amount;
        this.interest = interest;
        this.duration=duration;
    }
}

