package javadz.lesson23062022.Task1;

public class mainn {
    public static void main(String[] args) {
        Phone phone1 = new Phone("80294457898", "Nokia 6310", "0.3 kg");
        phone1.showParam();
        phone1.receiveCall("Tom");
        phone1.receiveCall("80257894561", "Tom");
        phone1.sendMessage("80336543214", "80457894523", "80333216549");
        phone1.getNamber();
        Phone phone2 = new Phone("80334562352", "iPhone 10", "0.6 kg");
        phone2.receiveCall("Harry");
        phone2.receiveCall("80257894561", "Harry");
        phone2.sendMessage("80336543214", "80457894523", "80333216549");
        phone2.showParam();
        phone2.getNamber();
        Phone phone3 = new Phone("80257896541", "Samsung 10a", " 0.55");
        phone3.receiveCall("Bob");
        phone3.receiveCall("80257894561", "Harry");
        phone3.sendMessage("80336543214", "80457894523", "80333216549");
        phone3.showParam();
        phone3.getNamber();

    }
}
