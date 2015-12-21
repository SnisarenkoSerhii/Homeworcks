package iceCream;

import enums.*;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

/**
 * Created by Sergey on 25.11.2015.
 */
@XmlRootElement
public class IceCream implements Serializable {
    private IceCreamShape shape ;
    private IceCreamTaste taste;
    private IceCreamColor color;
    private int weight;
    private int size;
    private IceCreamName name;

    public IceCreamShape getShape() {
        return shape;
    }

    @XmlElement
    public IceCream setShape(IceCreamShape shape) {
        this.shape = shape;
        return this;
    }

    public IceCreamTaste getTaste() {
        return taste;
    }

    @XmlElement
    public IceCream setTaste(IceCreamTaste taste) {
        this.taste = taste;
        return this;
    }

    public IceCreamColor getColor() {
        return color;
    }

    @XmlElement
    public IceCream setColor(IceCreamColor color) {
        this.color = color;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    @XmlElement
    public IceCream setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public int getSize() {
        return size;
    }

    @XmlElement
    public IceCream setSize(int size) {
        this.size = size;
        return this;
    }

    public IceCreamName getName() {
        return name;
    }

    @XmlAttribute
    public IceCream setName(IceCreamName name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("IceCream{");
        sb.append("shape='").append(shape).append('\'');
        sb.append(", taste='").append(taste).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", weight=").append(weight);
        sb.append(", size=").append(size);
        sb.append(", name=").append(name);
        sb.append('}');
        return sb.toString();
    }
}

