package methodoverloadingoverriding;

public class Test {
    public static void main(String[] args) {
        Payment p = new Payment();
        CardPayment c = new CardPayment();
        UpiPayment u = new UpiPayment();

        p.pay(500);
        p.pay(1000,"mobile");

        c.pay(200,"card");


        System.out.println();

        p.process();
        c.process();
        u.process();

        System.out.println();

        Payment ref;

        ref = new CardPayment();
        ref.process();     // CardPayment version

        ref = new UpiPayment();
        ref.process();     // UPIPayment version
    }
}
