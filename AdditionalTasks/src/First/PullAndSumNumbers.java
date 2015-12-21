package First;

/**
 * Created by Sergey on 09.10.2015.
 */
public class PullAndSumNumbers {
    private double numberOne;
    private double numberTwo;
    private double numberThree;


    public double getNumberOne() {
        return numberOne;
    }

    public PullAndSumNumbers setNumberOne(int numberOne) {
        this.numberOne = numberOne;
        return this;
    }

    public double getNumberTwo() {
        return numberTwo;
    }

    public PullAndSumNumbers setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
        return this;
    }

    public double getNumberThree() {
        return numberThree;
    }

    public PullAndSumNumbers setNumberThree(int numberThree) {
        this.numberThree = numberThree;
        return this;
    }

    public void doMath(){

        double go = (numberOne + numberTwo + numberThree)/3;
        System.out.println(String.format("The arithmetic mean of %.0f, %.0f and %.0f is %.3f .", numberOne, numberTwo,
                numberThree, go));
    }
}
