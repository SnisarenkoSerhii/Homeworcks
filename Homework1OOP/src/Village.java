/**
 * Created by Sergey on 29.09.2015.
 */
public class Village {
    public int amountOfHumans;
    private int amountOfSmallBuildings;
    private int amountOfSquareMetres;
    private int plantations;   /* Огороды? */

    public Village(int amountOfHumans, int amountOfSmallBuildings, int amountOfSquareMetres, int plantations) {
        this.amountOfHumans = amountOfHumans;
        this.amountOfSmallBuildings = amountOfSmallBuildings;
        this.amountOfSquareMetres = amountOfSquareMetres;
        this.plantations = plantations;
    }

    public int getAmountOfHumans() {
        return amountOfHumans;
    }

    public Village setAmountOfHumans(int amountOfHumans) {
        this.amountOfHumans = amountOfHumans;
        return this;
    }

    public int getAmountOfSquareMetres() {
        return amountOfSquareMetres;
    }

    public Village setAmountOfSquareMetres(int amountOfSquareMetres) {
        this.amountOfSquareMetres = amountOfSquareMetres;
        return this;
    }

    public int getAmountOfSmallBuildings() {
        return amountOfSmallBuildings;
    }

    public Village setAmountOfSmallBuildings(int amountOfSmallBuildings) {
        this.amountOfSmallBuildings = amountOfSmallBuildings;
        return this;
    }

    public int getPlantations() {
        return plantations;
    }

    public Village setPlantations(int plantations) {
        this.plantations = plantations;
        return this;
    }

    public void printVillage(int amountOfHumans, int amountOfSmallBuildings,
             int amountOfSquareMetres, int plantations){
        System.out.println("The village had been created with: " +
        amountOfHumans +  " humans, " + amountOfSmallBuildings + " small buildings" +
        " with square of " + amountOfSquareMetres + " meters and " + plantations +
        " plantations.");
    }
    public void printVillage(){
        System.out.println("The village has been created with: " +
                getAmountOfHumans() +  " humans, " + getAmountOfSmallBuildings() + " small buildings" +
                " with square of " + getAmountOfSquareMetres() + " meters and " + getPlantations() +
                " plantations.");
    }


}
