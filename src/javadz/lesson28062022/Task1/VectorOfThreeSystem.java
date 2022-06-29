package javadz.lesson28062022.Task1;

import java.util.Arrays;

public class VectorOfThreeSystem {
    public static final String DESCRIPTION = "This is vector of three dimensional coordinate system";
    private int x;
    private int y;
    private int z;


    public VectorOfThreeSystem() {
    }

    public VectorOfThreeSystem(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void VectorLength(double lengh) {
        lengh = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    void ScalarProduct(double vector1, double vector2, double cosRad) {
        double ScalProd = vector1 * vector2 * Math.cos(cosRad);
    }

    void AdditionVector(double x1, double x2, double x3, double y1, double y2, double y3) {
        double addition1 = (x1 + y1);
        double addition2 = (x2 + y2);
        double addition3 = (x3 + y3);
        System.out.println((addition1 + ";" + addition2 + ";" + addition3));
    }

    void subtractionVector(double x1, double x2, double x3, double y1, double y2, double y3) {
        double addition1 = (x1 - y1);
        double addition2 = (x2 - y2);
        double addition3 = (x3 - y3);
        System.out.println((addition1 + ";" + addition2 + ";" + addition3));
    }

    public void fillArraysVectors(int size) {
        int[][] array = new int[size][3];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 3; j++)
                array[i][j] = ((int) (Math.random() * 20));
            System.out.println(Arrays.deepToString(array));

        }
    }

    @Override
    public boolean equals(Object obj) {
        return equals(obj);
    }

    @Override
    public String toString() {
        return DESCRIPTION + "VectorOfThree{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}



