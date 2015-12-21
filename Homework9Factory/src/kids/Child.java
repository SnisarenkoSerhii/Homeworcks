package kids;

import enums.*;
import iceCream.IceCream;

import javax.xml.bind.annotation.*;


/**
 * Created by Sergey on 25.11.2015.
 */

@XmlRootElement
public class Child {
    private String childName;
    private IceCreamShape preferredShape;
    private IceCreamTaste preferredTaste;
    private IceCreamColor preferredColor;
    private int preferredWeight;
    private int preferredSize;
    private IceCreamName preferredName;

    @XmlAttribute
    public void setChildName(String childName) {
        this.childName = childName;
    }

    @XmlElement
    public void setPreferredShape(IceCreamShape preferredShape) {
        this.preferredShape = preferredShape;
    }

    @XmlElement
    public void setPreferredTaste(IceCreamTaste preferredTaste) {
        this.preferredTaste = preferredTaste;
    }

    @XmlElement
    public void setPreferredColor(IceCreamColor preferredColor) {
        this.preferredColor = preferredColor;
    }

    @XmlElement
    public void setPreferredWeight(int preferredWeight) {
        this.preferredWeight = preferredWeight;
    }

    @XmlElement
    public void setPreferredSize(int preferredSize) {
        this.preferredSize = preferredSize;
    }

    @XmlElement
    public void setPreferredName(IceCreamName preferredName) {
        this.preferredName = preferredName;
    }

    public String getChildName() {
        return childName;
    }

    public IceCreamShape getPreferredShape() {
        return preferredShape;
    }

    public IceCreamTaste getPreferredTaste() {
        return preferredTaste;
    }

    public IceCreamColor getPreferredColor() {
        return preferredColor;
    }

    public int getPreferredWeight() {
        return preferredWeight;
    }

    public int getPreferredSize() {
        return preferredSize;
    }

    public IceCreamName getPreferredName() {
        return preferredName;
    }

    public boolean takeIceCream(IceCream ice){
            if (ice.getColor() == preferredColor &&
                    ice.getShape() == preferredShape &&
                    ice.getTaste() == preferredTaste) {
                return true;
            } else {
                return false;
    }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Child{");
        sb.append("childName='").append(childName).append('\'');
        sb.append(", preferredShape='").append(preferredShape).append('\'');
        sb.append(", preferredTaste='").append(preferredTaste).append('\'');
        sb.append(", preferredColor='").append(preferredColor).append('\'');
        sb.append(", preferredWeight=").append(preferredWeight);
        sb.append(", preferredSize='").append(preferredSize).append('\'');
        sb.append(", preferredName=").append(preferredName);
        sb.append('}');
        return sb.toString();
    }
}
