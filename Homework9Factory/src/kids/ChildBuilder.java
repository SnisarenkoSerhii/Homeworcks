package kids;

import enums.*;
import iceCream.IceCream;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Random;

/**
 * Created by Sergey on 25.11.2015.
 */
@XmlRootElement
public class ChildBuilder {
    private String childName = "Sergey";
    private IceCreamShape preferredShape = null;
    private IceCreamTaste preferredTaste = null;
    private IceCreamColor preferredColor = null;
    private int preferredWeight = 0;
    private int preferredSize = 0;
    private IceCreamName preferredName = null;

    public ChildBuilder buildChildName(String childName) {
        this.childName = childName;
        return this;
    }

    public ChildBuilder buildPreferredShape(IceCreamShape preferredShape) {
        this.preferredShape = preferredShape;
        return this;
    }

    public ChildBuilder buildPreferredTaste(IceCreamTaste preferredTaste) {
        this.preferredTaste = preferredTaste;
        return this;
    }

    public ChildBuilder buildPreferredColor(IceCreamColor preferredColor) {
        this.preferredColor = preferredColor;
        return this;
    }

    public ChildBuilder buildPreferredWeight(int preferredWeight) {
        this.preferredWeight = preferredWeight;
        return this;
    }

    public ChildBuilder buildPreferredSize(int preferredSize) {
        this.preferredSize = preferredSize;
        return this;
    }

    public ChildBuilder buildPreferredName(IceCreamName preferredName) {
        this.preferredName = preferredName;
        return this;
    }

    public int getPreferredWeight() {
        return preferredWeight;
    }

    public int getPreferredSize() {
        return preferredSize;
    }



    public int randomWeight(){
            int[] a = {40, 60, 100, 500, 1000};
            Random r = new Random();
            int x = a[r.nextInt(5)];
            this.preferredWeight = x;
            return this.preferredWeight = x;

    }

    public int randomSize(){
        int[] a = {40, 60, 100, 500, 1000};
        Random r = new Random();
        int x = a[r.nextInt(5)];
        this.preferredSize = x;
        return this.preferredSize = x;
    }

    public void takeIceCream(IceCream ice){
        if(ice.getColor() == preferredColor &&
                ice.getShape() == preferredShape &&
                ice.getSize() == preferredSize &&
                ice.getWeight() == preferredWeight &&
                ice.getName() == preferredName &&
                ice.getTaste() == preferredTaste){
            System.out.println(childName + "take's this.");
        }
        else {
            System.out.println("No.");
        }
    }

    public Child build() {
        Child child = new Child();
        child.setChildName(childName);
        if (preferredName != null) {
            child.setPreferredName(preferredName);
        } else {
            child.setPreferredName(IceCreamName.CHOCOLATE.randomName());
        }
        if (preferredColor != null) {
            child.setPreferredColor(preferredColor);;
        } else {
            child.setPreferredColor(IceCreamColor.RED.randomColor());
        }
        if(preferredShape != null){
        child.setPreferredShape(preferredShape);
        } else {
            child.setPreferredShape(IceCreamShape.CYLINDRICAL.randomShape());
        }
        if(preferredSize != 0){
        child.setPreferredSize(preferredSize);
        }else {
            child.setPreferredSize(randomSize());
        }
        if(preferredTaste != null) {
            child.setPreferredTaste(preferredTaste);
        }else {
            child.setPreferredTaste(IceCreamTaste.APPLE.randomTaste());
        }
        if(preferredWeight != 0) {
            child.setPreferredWeight(preferredWeight);
        }else {
            child.setPreferredWeight(randomWeight());
        }
        return child;
    }
}
