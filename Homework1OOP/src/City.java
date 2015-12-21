/**
 * Created by Sergey on 29.09.2015.
 */

public class City extends Village {
    private int citizens;
    private int amountOfSmallBuildings;
    private int amountOfBigBuildings;
    private int amountOfSquareMetres;

    public City(int amountOfHumans, int amountOfSmallBuildings, int amountOfSquareMetres, int plantations,
                int citizens, int amountOfSmallBuildings1, int amountOfBigBuildings, int amountOfSquareMetres1) {
        super(amountOfHumans, amountOfSmallBuildings, amountOfSquareMetres, plantations);
        this.citizens = citizens;
        amountOfSmallBuildings = amountOfSmallBuildings1;
        this.amountOfBigBuildings = amountOfBigBuildings;
        amountOfSquareMetres = amountOfSquareMetres1;
    }

    public int getAmountOfBigBuildings() {
        return amountOfBigBuildings;
    }

    public City setAmountOfBigBuildings(int amountOfBigBuildings) {
        this.amountOfBigBuildings = amountOfBigBuildings;
        return this;
    }

    public int getCitizens() {
        return citizens;
    }

    public City setCitizens(int citizens) {
        this.citizens = citizens;
        return this;
    }
    public void printCity(){
        System.out.println("The city has been created with: " +
                getCitizens() +  " cityzens, " + getAmountOfSmallBuildings() + " small buildings " +
                getAmountOfBigBuildings() + " big buildings " + " with square of " + getAmountOfSquareMetres()
                + " meters and.");
    }
    public void printCity(int citizens, int amountOfBigBuildings, int amountOfSmallBuildings,
                           int amountOfSquareMetres){
        System.out.println("The city has been created with: " +
                citizens +  " cityzens, " + amountOfSmallBuildings + " small buildings " +
                amountOfBigBuildings + " big buildings" + " with square of " + amountOfSquareMetres
                + " meters and.");
    }


}
