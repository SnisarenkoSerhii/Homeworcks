package fourth;

import java.util.Scanner;

/**
 * Created by Sergey on 12.10.2015.
 * 4.	Написать программу, которая  предлагает пользователю ввести радиус окружности,
 * а затем считает площадь и длину этой окружности. Число Pi задать в программе как вещественную константу.
 */
public class Circle {
    public static final double PI = Math.PI;

    public static double enterRadius(String message) {
        double radius = 0;
        boolean finished = false;
        do {
            System.out.println(message);
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextDouble()) {
                radius = sc.nextDouble();
                finished = true;
            } else System.out.println("That what you entered is not a number, try again please!");
        } while (finished != true);
        return radius;
    }

    public void getSquare(double number) {
        double square = number * number * PI;
        System.out.println(String.format("The square of circle with radius %.0f is %f", number, square));
    }

    public void getLength(double number){
        double length = 2 * number * PI;
        System.out.println(String.format("The length of circle with radius %.0f is %f", number, length));
    }

}
