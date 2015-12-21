package iceCream;

import enums.*;

import java.util.Random;

/**
 * Created by Sergey on 25.11.2015.
 */
public class IceCreamBuilder {

    private IceCreamShape shape = null;
    private IceCreamTaste taste = null;
    private IceCreamColor color = null;
    private int weight = 0;
    private int size = 0;
    private IceCreamName name = null;


    public IceCreamBuilder buildShape(IceCreamShape shape) {
        this.shape = shape;
        return this;
    }

    public IceCreamBuilder buildTaste(IceCreamTaste taste) {
        this.taste = taste;
        return this;
    }

    public IceCreamBuilder buildColor(IceCreamColor color) {
        this.color = color;
        return this;
    }

    public IceCreamBuilder buildWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public IceCreamBuilder buildSize(int size) {
        this.size = size;
        return this;
    }

    public IceCreamBuilder buildName(IceCreamName name) {
        this.name = name;
        return this;
    }
    public int randomWeight(){
        int[] a = {40, 60, 100, 500, 1000};
        Random r = new Random();
        int x = a[r.nextInt(5)];
        this.weight = x;
        return this.weight = x;
    }

    public int randomSize(){
        int[] a = {40, 60, 100, 500, 1000};
        Random r = new Random();
        int x = a[r.nextInt(5)];
        this.size = x;
        return this.size = x;
    }

    public IceCream build() {
        IceCream iceCream = new IceCream();
        if (color != null) {
            iceCream.setColor(color);
        } else {
            iceCream.setColor(IceCreamColor.BROWN.randomColor());
        }

        //iceCream.setColor(color != null ? color : IceCreamColor.BROWN.randomColor());

        if (name != null) {
            iceCream.setName(name);
        } else {
            iceCream.setName(IceCreamName.CHOCOLATE.randomName());
        }
        if (shape != null) {
            iceCream.setShape(shape);
        } else {
            iceCream.setShape(IceCreamShape.CYLINDRICAL.randomShape());
        }
        if (size != 0) {
            iceCream.setSize(size);
        } else {
            iceCream.setSize(randomSize());
        }
        if (taste != null) {
            iceCream.setTaste(taste);
        } else {
            iceCream.setTaste(IceCreamTaste.APPLE.randomTaste());
        }
        if(weight != 0) {
            iceCream.setWeight(weight);
        } else {
            iceCream.setWeight(randomWeight());
        }
        return iceCream;
    }
}
