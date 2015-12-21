package punkt2game;

import java.util.Scanner;

/**
 * Created by Sergey on 14.10.2015.
 * Загадуем число от 0 до 100. У вас есть семь попыток на угадывание.
 * При каждой попытке будет выводиться сообщение - "Мало" или "Много". Если угадаете,
 * уложившись в семь попыток, то выиграли. Если нет, Выводим сообщение и снова загадываем и повторяем все снова
 */
public class Methods {
    public void startGame(int secretNumber) {
        int count = 0;
        int number;
        do {
            number = enterNumber("Try to guess the secret number(1-100), please enter your number here: ");
            checkNumber(number, secretNumber);
            count++;
            if (count == 7){
                System.out.println("You were defeated! The secret number was : " + secretNumber);
            }
        } while(number != secretNumber && count < 7);
    }

    private void checkNumber(int number, int secretNumber) {
        if(number == secretNumber) {
            System.out.println("Victory!!! The secret number is really " + secretNumber);
        } else if (number > secretNumber){
            System.out.println("The secret number is smaller, try again!");
        } else {
            System.out.println("The secret number is bigger, try again!");
        }
    }

    private int enterNumber(String message) {
        int number = 0;
        boolean finished = false;
        do {
            System.out.println(message);
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextBigInteger()) {
                number = sc.nextInt();
                finished = true;
            } else System.out.println("That what you entered is not a number, try again please!");
        } while (finished != true);
        return number;
    }
}

