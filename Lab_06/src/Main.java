public class Main {
    public static void main(String[] args){
        Bank ABC = new Bank("ABC"); //create a bank
        ATM atm_katubedda = ABC.create_atm("katubedda",ABC); //create an atm
        Client C_198898576456 = ABC.register_client("198898576456","Zaharan","Sri Lankan","Terrorist","Wellawatte",39,"male",1234,ABC); //create a client
        C_198898576456.create_current_account("1001","Rupees","Katubedda"); //create a current account
        C_198898576456.create_saving_account("1002","Rupees","Katubedda"); //create a saving account
        C_198898576456.get_loan("1001","Rupees",500000,3.0,2); // get a loan
        atm_katubedda.visit_atm(); //visit atm
    }
}
