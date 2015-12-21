/**
 * Created by Sergey on 03.10.2015.
 */

public class Entry {
        public static void main(String [] args){
            SumNumbers i = new SumNumbers();
            i.setNumber(8.56);
            i.sumNumerals();

            System.out.println();

            MaxMinNumeral m = new MaxMinNumeral();
            m.setNumber(5.08);
            m.getMinMaxNumerals();
        }
    }

