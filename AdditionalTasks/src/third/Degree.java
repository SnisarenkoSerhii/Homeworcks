package third;

/**
 * Created by Sergey on 10.10.2015.
 * 3.	Пользователь вводит число и степень. Программа вычисляет указанную степень этого числа.
 */
public class Degree {
    public static void main(String[] args) {
        System.out.println("Hello, here are you can get the degree of your number!");
        double number = Calculatoins.enterNumber("Please enter number");
        double degree = Calculatoins.enterNumber("Please enter degree");
        System.out.print("The answer is: ");
        System.out.println(Math.pow(number, degree));
    }
}
