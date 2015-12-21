package punkt2;

/**
 * Created by Sergey on 17.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        int counter = 0;
        StringBuilder hours = new StringBuilder();
        StringBuilder minutes = new StringBuilder();
        for (int i = 0; i < 24; i++) {
            hours.append(String.format("%02d", i)); // http://developer.alexanderklimov.ru/android/java/stringbuffer.php
            for (int j = 0; j < 60; j++) {
                minutes.append(String.format("%02d", j)).reverse(); // http://examples.javacodegeeks.com/core-java/lang/string/java-string-reverse-example/
                if (hours.toString().equals(minutes.toString())) {
                    System.out.printf("%02d - %s:%s\n", ++counter, hours, minutes.reverse());
                }
                minutes.delete(0, minutes.length());
            }
            hours.delete(0, hours.length());
        }
    }
}
