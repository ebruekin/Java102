package InterfacesS;

public class Bank implements IBank {
    private String bankName;
    private String terminalId;
    private String password;

    public Bank(String bankName, String terminalId,String password ){
        this.bankName = bankName;
        this.terminalId = terminalId;
        this.password = password;
    }

    // getter setter

    public String getBankName(){
        return this.bankName;
    }

    public void setBankName(String bankN){
        this.bankName = bankN;
    }

    public String getTerminalID(){
        return this.terminalId;
    }

    public void setTerminalID(String termID){
        this.terminalId = termID;
    }

    public String getPasword(){
        return this.password;
    }

    public void setPassword(String psw){
        this.password = psw;
    }

    @Override
    public boolean connect(String ipAddr) {
        
        System.out.println("connected to " + this.bankName);
        return true;
       
    }

    @Override
    public boolean payment(double price, String carNum, String expiryDate, String cvc) {
        System.out.println("Waiting for response from bank");
        System.out.println("transaction successful");
        return true;       
    }
}
