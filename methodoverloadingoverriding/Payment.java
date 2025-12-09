package methodoverloadingoverriding;

public class Payment {
    public void pay(int amount){
        System.out.println(amount+"rs. paid by cash");
    }
    public void pay(int amount, String payfor){
        System.out.println(amount+"paid by cash for "+payfor);
    }
    public void process(){
        System.out.println("payment class");
    }
}

class CardPayment extends Payment{
    public void process(){
        System.out.println("cardPayment class");
    }
}

class UpiPayment extends Payment{
    public void process(){
        System.out.println("Upi class");
    }
}
