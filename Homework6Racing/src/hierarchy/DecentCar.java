package hierarchy;

/**
 * Created by Sergey on 25.10.2015.
 */
public class DecentCar extends RacingCar {
    private String color;

    public String getColor() {
        return color;
    }

    DecentCar(DecentCar ob){
        super(ob);
        color = ob.color;
    }

    DecentCar(String n, int a, int i, int s, String c){
        super(n, a, i, s);
        color = c;
    }

    DecentCar(){
        this("NoName", -1, -1, -1, "NoColor");
    }

    @Override
    void getParameters(){
        System.out.println(this.getName());
        System.out.println(this.getAge());
        System.out.println(this.getId());
        System.out.println(this.getSpeed());
        System.out.println(this.getColor());
    }
}
