/* Method Override, To String, This Keyword, Inheritance */
public class CCData {

/* properties */
    public String annualFee;
    public int cashback;
    public double interestRate;

/* constructors */
    public CCData(String annualFee, int cashback, double interestRate) {
        this.annualFee = annualFee;
        this.cashback = cashback;
        this.interestRate = interestRate;
    }

/* toString() & Method Override */
    @Override
    public String toString() {
        return ("Annual Fee= " + annualFee + "\n" + "Cash Back= " + cashback + "%" + "\n" + "Interest Rate= " + interestRate + "%" + "\n");
    }

/* Inheritance */
static class Bronze extends CCData {
        public Bronze(String annualFee, int cashback, double interestRate) {
            super(annualFee, cashback, interestRate);
        }
    }

    static class Silver extends CCData {
        public Silver(String annualFee, int cashback, double interestRate) {
            super(annualFee, cashback, interestRate);
        }
    }

    static class Gold extends CCData {
        public Gold(String annualFee, int cashback, double interestRate) {
            super(annualFee, cashback, interestRate);
        }
    }

    static class Diamond extends CCData {
        public Diamond(String annualFee, int cashback, double interestRate) {
            super(annualFee, cashback, interestRate);
        }
    }

    public static void main(String[] args) {
        CCData BronzeCard = new CCData("None", 1, 29.80);
        CCData SilverCard = new CCData("None", 2, 24.61);
        CCData GoldCard = new CCData("$95", 5, 18.30);
        CCData DiamondCard = new CCData("None", 10, 13.00);
        System.out.println(BronzeCard);
        System.out.println(SilverCard);
        System.out.println(GoldCard);
        System.out.println(DiamondCard);
    }
}
