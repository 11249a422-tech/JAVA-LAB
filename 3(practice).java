interface Payment {
    void calculateCharge();
}

class CreditCard implements Payment {
    public void calculateCharge() {
        System.out.println("Credit Card charge: Rs. 20");
    }
}

class DebitCard implements Payment {
    public void calculateCharge() {
        System.out.println("Debit Card charge: Rs. 15");
    }
}

class NetBanking implements Payment {
    public void calculateCharge() {
        System.out.println("NetBanking charge: Rs. 12");
    }
}

public class Main {
    public static void main(String[] args) {
        Payment p = new NetBanking();
        p.calculateCharge();
    }
}
