package Second;

import java.util.Scanner;

/**
 * Created by Sergey on 09.10.2015.
 * 2.	Написать программу, которая находит корень линейного уравнения ax + b = 0.
 * x=-b/a
 */
public class Equation {
    private double x;
    private double a;
    private double b;

    public double getX() {
        return x;
    }

    public Equation setX(int x) {
        this.x = x;
        return this;
    }

    public double getA() {
        return a;
    }

    public Equation setA(int a) {
        this.a = a;
        return this;
    }

    public double getB() {
        return b;
    }

    public Equation setB(int b) {
        this.b = b;
        return this;
    }

    public void calculateX(){
        boolean finished1 = false;
        boolean finished2 = false;
        do{
            Scanner scA = new Scanner(System.in);
            System.out.println("Enter a from the equation ax + b = 0, please:");
            if(scA.hasNextInt()) {
                a = scA.nextInt();
                finished1 = true;
            } else {
                System.out.println("The number must be int, sorry!");
            }


            Scanner scB = new Scanner(System.in);
            System.out.println("Enter b from the equation ax + b = 0, please:");
            if(scB.hasNextInt()) {
                b = scB.nextInt();
                finished2 = true;
            }else System.out.println("The number must be int, sorry!");
            x = -a/b;
            System.out.println(String.format("Your equation is %.0fx + %.0f = 0. Calculated x is %f", a, b, x));
        }while (finished1 != finished2);
    }
}
