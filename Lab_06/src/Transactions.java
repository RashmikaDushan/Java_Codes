import java.util.Date;

abstract public class Transactions { //Transaction parent class
    private int transaction_id;
    private int account_number;
    private Date date;
    private String status;

    protected Transactions(int transaction_id, int account_number, String status,int amount) {
        this.transaction_id = transaction_id;
        this.account_number = account_number;
        this.date = new Date();
        this.status = status;
    }
}

class Deposit extends Transactions{ //deposit child class
    protected Deposit(int transactionId, int account_number, String status,int amount){
        super(transactionId,account_number,status,amount);
    }
}

class Withdrawal extends Transactions{ //withdrawal child class
    protected Withdrawal(int transactionId, int account_number, String status,int amount){
        super(transactionId,account_number,status,amount);
    }
}

class Balance_Inquiry extends Transactions{ //balance inquiry child class
    protected Balance_Inquiry(int transactionId, int account_number, String status,int amount){
        super(transactionId,account_number,status,amount);
    }
}