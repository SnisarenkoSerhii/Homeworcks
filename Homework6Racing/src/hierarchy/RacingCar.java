package hierarchy;

/**
 * Created by Sergey on 25.10.2015.
 */
public class RacingCar  extends Car {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    RacingCar(RacingCar ob){
        super(ob);
        speed = ob.speed;
    }

    RacingCar(String n, int a, int i, int s){
        super(n, a, i);
        speed = s;
    }

    RacingCar(){
        this("NoName", -1, -1, -1);
    }

    @Override
    void getParameters(){
        System.out.println(this.getName());
        System.out.println(this.getAge());
        System.out.println(this.getId());
        System.out.println(this.getSpeed());
    }
}
