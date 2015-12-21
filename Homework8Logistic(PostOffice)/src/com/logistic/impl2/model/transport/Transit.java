package com.logistic.impl2.model.transport;

/**
 * Created by Sergey on 06.11.2015.
 */
import com.logistic.api.model.post.*;
import com.logistic.api.model.post.Package;
import com.logistic.api.model.transport.*;
import com.logistic.api.model.transport.DeliveryTransport;
import com.sun.org.apache.bcel.internal.generic.LAND;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 */
public class Transit implements com.logistic.api.model.transport.Transit  {
    private final List<PostOffice> offices;
    private final double price;


    public Transit(List<PostOffice> offices, double price) {
        this.price = price;
        this.offices = Collections.unmodifiableList(new ArrayList(offices));
    }

    @Override
    public List<PostOffice> getTransitOffices() {
        return this.offices;
    }

    @Override
    public double getPrice() {
        return price;
    }

    //как-то получить тут гет¬ейти и гетћайлс, чтобы добавить вариативность по весу цене и типу доставки
    @Override
    public String toString() {
        String transport;
        if (price > 40 && price < 80) {
            transport = "LAND";
        }else
        if (price > 80 && price < 120){
            transport = "SEA";
        }else {
            transport = "AIR";
        }
        return "Transit by " + transport +" {" + price + "}" + this.offices;
    }
}
