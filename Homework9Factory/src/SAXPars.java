import iceCream.IceCream;
import kids.Children;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.*;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 * Created by Sergey on 14.12.2015.
 */


public class SAXPars extends DefaultHandler {

    public static void main(String[] args) {
        doSomething();

    }

    private static void doSomething() {
        try {

            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            DefaultHandler handler = new DefaultHandler() {
                boolean q = false;
                boolean w = false;
                boolean e = false;
                boolean r = false;
                boolean t = false;
                boolean y = false;
                boolean u = false;
                boolean i = false;
                boolean a = false;
                boolean s = false;
                boolean d = false;
                boolean f = false;
                boolean g = false;
                boolean h = false;

                public void startElement(String uri, String localName, String qName,
                                         Attributes attributes) throws SAXException {
                    System.out.println("Start Element :" + qName);
                    if (qName.equalsIgnoreCase("children")) {
                        u = true;
                    }
                    if (qName.equalsIgnoreCase("preferredColor")) {
                        i = true;
                    }
                    if (qName.equalsIgnoreCase("preferredName")) {
                        q = true;
                    }
                    if (qName.equalsIgnoreCase("preferredShape")) {
                        w = true;
                    }
                    if (qName.equalsIgnoreCase("preferredSize")) {
                        e = true;
                    }
                    if (qName.equalsIgnoreCase("preferredTaste")) {
                        r = true;
                    }
                    if (qName.equalsIgnoreCase("preferredWeight")) {
                        y = true;
                    }
                    if (qName.equalsIgnoreCase("iceCreams")) {
                        h = true;
                    }
                    if (qName.equalsIgnoreCase("color")) {
                        a = true;
                    }
                    if (qName.equalsIgnoreCase("shape")) {
                        s = true;
                    }
                    if (qName.equalsIgnoreCase("size")) {
                        d = true;
                    }
                    if (qName.equalsIgnoreCase("taste")) {
                        f = true;
                    }
                    if (qName.equalsIgnoreCase("weight")) {
                        g = true;
                    }

                }

                public void endElement(String uri, String localName,
                                       String qName) throws SAXException {

                    System.out.println("End Element :" + qName);

                }

                public void characters(char ch[], int start, int length) throws SAXException {
                    if (u) {
                        System.out.println("children : " + new String(ch, start, length));
                        u = false;
                    }
                    if (i) {
                        System.out.println("preferredColor : " + new String(ch, start, length));
                        i = false;
                    }
                    if (q) {
                        System.out.println("preferredName : " + new String(ch, start, length));
                        q = false;
                    }
                    if (w) {
                        System.out.println("preferredShape: " + new String(ch, start, length));
                        w = false;
                    }
                    if (e) {
                        System.out.println("preferredSize: " + new String(ch, start, length));
                        e = false;
                    }
                    if (r) {
                        System.out.println("preferredTaste : " + new String(ch, start, length));
                        r = false;
                    }
                    if (t) {
                        System.out.println("preferredTaste : " + new String(ch, start, length));
                        t = false;
                    }
                    if (y) {
                        System.out.println("preferredWeight : " + new String(ch, start, length));
                        y = false;
                    }
                    if (h) {
                        System.out.println("iceCreams : " + new String(ch, start, length));
                        h = false;
                    }
                    if (a) {
                        System.out.println("color : " + new String(ch, start, length));
                        a = false;
                    }
                    if (s) {
                        System.out.println("shape : " + new String(ch, start, length));
                        s = false;
                    }
                    if (d) {
                        System.out.println("size : " + new String(ch, start, length));
                        d = false;
                    }
                    if (f) {
                        System.out.println("taste : " + new String(ch, start, length));
                        f = false;
                    }
                    if (g) {
                        System.out.println("weight : " + new String(ch, start, length));
                        g = false;
                    }
                }
            };

            saxParser.parse("D:\\file.xml", handler);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
