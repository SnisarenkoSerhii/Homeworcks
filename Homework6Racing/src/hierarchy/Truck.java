package hierarchy;

/**
 * Created by Sergey on 25.10.2015.
 */
public class Truck extends DecentCar {
    private int weight;

    public int getWeight() {
        return weight;
    }

    Truck(Truck ob){
        super(ob);
        weight = ob.weight;
    }

    Truck(String n, int a, int i, int s, String c, int w){
        super(n, a, i, s, c);
        weight = w;
    }

    Truck(){
        this("NoName", -1, -1, -1, "NoColor", -1);
    }

    @Override
    void getParameters(){
        System.out.println(this.getName());
        System.out.println(this.getAge());
        System.out.println(this.getId());
        System.out.println(this.getSpeed());
        System.out.println(this.getColor());
        System.out.println(this.getWeight());
    }
}
