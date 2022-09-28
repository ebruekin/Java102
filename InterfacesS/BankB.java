package InterfacesS;

public class BankB extends Bank  {
    

    public BankB(String bankName, String terminalId,String password){
        super(bankName, terminalId, password);
    }

    @Override
    public boolean payment(double price, String carNum, String expiryDate, String cvc){
        if(price > 100.0){
            System.out.println("it cannot be performed");
        }else{
            System.out.println("transaction successful");
        }
        return true;
    }
}
