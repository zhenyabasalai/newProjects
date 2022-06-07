package javadz.lesson02062022;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args)  {
        Scanner input=new Scanner(System.in);
        int a,b,c;
        System.out.print("Введите a: ");
        a=input.nextInt();
        System.out.print("Введите b: ");
        b=input.nextInt();
        System.out.print("Введите c: ");
        c=input.nextInt();

        double D=Math.pow(b,2) - 4*a*c;
        System.out.println("D= "+D);

        if (D>0){
            double x1,x2;
            x1= (-b+Math.sqrt(D))/2*a;
            x2= (-b-Math.sqrt(D))/2*a;
            System.out.println("Уравнение имеет два корня: " + "x1="+x1+" x2="+x2 );
        }

        else if (D==0){
            double x = -b/(2*a) ;
            System.out.println("Уравнение имеет один корень: x = " +x );
        }
        else {
            System.out.println("Корней нет");
        }

    }

}

