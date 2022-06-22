package javadz.lesson21062022;

public class Сircle implements Figure {
    double R = 10;
    double pi = 3.14;
    double S;
    double P;

    @Override
    public double areaFigure() {
        S = pi * Math.pow(R, 2);

        return S;
    }

    @Override
    public double perimeterFigure() {
        P = 2 * pi * R;
        return P;
    }

    void showCirclePar() {
        System.out.println("S=" + S + " ; P=" + P);
    }
}



