package kids;


import iceCream.IceCream;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * Created by Sergey on 10.12.2015.
 */


@XmlRootElement
public class Children {

        @XmlElement
    List<Child> children;

    @XmlElement
    List<IceCream> iceCreams;

    public Children setIceCreams(List<IceCream> iceCreams) {
        this.iceCreams = iceCreams;
        return this;
    }

    public Children setChildren(List<Child> children) {
        this.children = children;
        return this;
    }

    public void add(Child child){
        if( this.children == null )
        {
            this.children = new ArrayList<Child>();
        }
        this.children.add( child );
    }

    public void add(IceCream iceCream){
        if( this.iceCreams == null )
        {
            this.iceCreams = new ArrayList<IceCream>();
        }
        this.iceCreams.add( iceCream );
    }

    @Override
    public String toString() {
        return "Children{" +
                "children=" + children +
                '}';
    }
}
