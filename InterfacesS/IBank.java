package InterfacesS;

public interface IBank {
    final String hostIpAdress = "127.0.0.1";

    boolean connect(String ipAddr);
    boolean payment(double price,String carNum,String expiryDate,String cvc);
}
