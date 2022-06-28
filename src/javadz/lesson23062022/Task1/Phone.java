package javadz.lesson23062022.Task1;

public class Phone {

    private String namber;
    private String model;
    private String weight;

    void showParam() {
        System.out.println(namber + " " + model + " " + weight);
    }

    void receiveCall(String name) {
        System.out.println("Call " + name);
    }

    public String getNamber() {
        return namber;
    }

    public Phone(String namber, String model) {
        this.namber = namber;
        this.model = model;
    }

    public Phone() {
    }

    public Phone(String namber, String model, String weight) {
        this(namber, model);
        this.weight = weight;
    }

    void receiveCall(String namber, String name) {
        System.out.println("Call " + namber + " " + name);
    }

    void sendMessage(String... namber) {
        System.out.println(namber.length);
        for (String a : namber) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
