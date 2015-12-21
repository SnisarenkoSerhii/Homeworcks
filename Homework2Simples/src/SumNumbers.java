/**
 * Created by Sergey on 03.10.2015.
 *
 * В переменной n хранится вещественное трёхзначное число с 2-мя знаками после запятой. Создайте программу,
 * вычисляющую и выводящую на экран сумму всех цифр числа n.
 *Например есть число 69. Цифры его составляющие - 6 и 9. А их сумма будет 6+9 = 15.
 */
public class SumNumbers {
    private int nextNumber;
    private int sumAllNumbers;
    private double number;

    public double getNumber() {
        return number;
    }

    public SumNumbers setNumber(double number) {
        this.number = number;
        return this;
    }

    public void sumNumerals(){
        number *= 100;
        nextNumber = (int) number;
        System.out.println("Getting numerals " + nextNumber + " from our : " + number/100);
        /**
         * тут мы пополучаем наш дабл, который к сожелению должен быть с двумя знаками после комы, иначе ничего не
         * сработает, и приводим его к инт. На нашем примере получаем 8.56 * 100 = 856.0, и приводим к инт => 856
         */
        while(nextNumber != 0){
            sumAllNumbers = sumAllNumbers + (nextNumber % 10);
            /**
             * тут мы сумируем "остатки от деления"
             */
            nextNumber = nextNumber / 10;
            /**
             * тут буквально переходим на следующюю цифру тоесть 856\10 = 85.6, остаток от деления 6, так как
             * у нас nextNumber int, то после комы цифра "удаляется" и получатя 85,потом
             * 85\10 = 8.5, получаем остаток от деления 5 и доходти до цифры 8
             * потом 8\10 = 0.8 , остаток от деления 8 и наш nextNumber стал равнятся 0. После этого выходим с цикла.
              */
        }
        System.out.println("Getting sum of numerals which is : " + sumAllNumbers);
    }


}
