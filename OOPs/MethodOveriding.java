class PaytmV1{
    void payMoney(){
        System.out.println("Paying using Paytm");
    }
}
class PaytmV2 extends PaytmV1{
    void payMoney(){
        System.out.println("Paying using Paytm1 and book a movie ticket");
    }    
}
public class MethodOveriding {
     
    public static void main(String[] args) {
        PaytmV2 p2 = new PaytmV2();
        p2.payMoney();
    }
}