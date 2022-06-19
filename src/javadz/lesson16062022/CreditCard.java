package javadz.lesson16062022;

public class CreditCard {
    long NambCh;
    double SumOfCh;
    void pSum(double Sum) {

        this.SumOfCh = SumOfCh + Sum;
    }
    void nSum(double Sum1) {

        this.SumOfCh = SumOfCh - Sum1;
    }
    void aCard() {
        System.out.println("Card account number: " + NambCh + " ;  Balance in checking account: " + SumOfCh);
    }
}
