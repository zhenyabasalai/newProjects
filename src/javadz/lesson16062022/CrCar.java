package javadz.lesson16062022;

public class CrCar {
    public static void main(String[] args) {

        CreditCard card1 = new CreditCard();
        card1.NambCh = 4511781554112533l;
        card1.SumOfCh = 9800;
        card1.pSum(1500);
        card1.aCard();

        CreditCard card2 = new CreditCard();
        card2.NambCh = 8877996525413278l;
        card2.SumOfCh = 4700;
        card2.pSum(2700);
        card2.aCard();

        CreditCard card3 = new CreditCard();
        card3.NambCh = 3564859721356574l;
        card3.SumOfCh = 8500;
        card3.nSum(4000);
        card3.aCard();
    }
}
