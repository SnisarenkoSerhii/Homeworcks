
import iceCream.IceCream;
import iceCream.IceCreamBuilder;
import kids.Child;
import kids.ChildBuilder;
import kids.Children;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 * Created by Sergey on 25.11.2015.
 */
public class main {
    public static void main(String[] args) {
        Children children = new Children();
        boolean done = false;
        IceCream ice1 = new IceCreamBuilder().buildSize(200).buildWeight(500).build();
        IceCream ice2 = new IceCreamBuilder().buildSize(200).buildWeight(500).build();
        children.add(ice1);
        children.add(ice2);
        iceCreamLogic(children, done, ice1, ice2);
        serializeChildren(children);

    }

    private static void serializeChildren(Children children) {
        try {
            File file = new File("D:\\file.xml");

            JAXBContext jaxbContext = JAXBContext.newInstance(Children.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(children, file);
            jaxbMarshaller.marshal(children, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    private static void iceCreamLogic(Children children, boolean done, IceCream ice1, IceCream ice2) {
        do {
            Child child1 = new ChildBuilder().buildPreferredSize(200).buildPreferredWeight(500).build();
            children.add(child1);
            Child child2 = new ChildBuilder().buildPreferredSize(200).buildPreferredWeight(500).buildChildName("Ivan").build();
            children.add(child2);

            boolean y3 = child1.takeIceCream(ice1);
            boolean y4 = child2.takeIceCream(ice2);

            //дети бурт мороженное, им не нравится
            if (y3 == false && y4 == false) {
                // System.out.println("Children dont like ice creams.");
                boolean i1 = child1.takeIceCream(ice2);
                boolean i2 = child2.takeIceCream(ice1);
                //они меняются
                if ((i1 == true && i2 == false) || (i1 == false && i2 == true)) {
                    System.out.println("One of the children likes his ice cream and the other don't after change.");
                }
                //одному нравится второму нет
                if (i1 == true && i2 == true) {
                    System.out.println("Children like ice creams after change.");
                    done = true;
                }
                //понравилось после того как поменялись
            }
            if (y3 == false && y4 == true) {
                System.out.println(child2.getChildName() + " likes ice cream and the other kid don't.");
                //детям дают мороженное одному понравилось полученой второму нет, пишет кому
            }

            if (y3 == true && y4 == false) {
                //детям дают мороженное одному понравилось полученое, второму нет, пишет кому
                System.out.println(child1.getChildName() + " likes ice cream and the other kid don't.");
            }
            if (y3 == true && y4 == true) {
                System.out.println("Children excepted ice creams immediately.");
                //понравилось мороженное сразу
                done = true;
            }
        } while (done != true);
    }
}

