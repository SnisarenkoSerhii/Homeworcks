package com.logistic.impl2.model.post;

import com.logistic.api.model.person.Address;
import com.logistic.api.model.person.FullName;
import com.logistic.api.model.person.Person;
import com.logistic.api.model.post.Stamp;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Sergey on 03.11.2015.
 */
public class Package implements com.logistic.api.model.post.Package {

    private String id;
    private int weight;
    private Type type;
    private Person receiver;
    private Person sender;
    private List<Stamp> stamps;
    private double milesToDestination;

    public Package(int weight, Type type, Person receiver, Person sender) {

        setId(id);      //"встроенный"генератор id
        setType(type);
        setReceiver(receiver);
        setSender(sender);
        setWeight(weight);
        setStamps(stamps);
    }


    private Package setId(String id) {
        this.id = UUID.randomUUID().toString();
        if (this.id == null) {
            throw new RuntimeException("Id cannot be null");
        }

        return this;
    }

    private Package setWeight(int weight) {
        if (weight == 0) {
            throw new RuntimeException("Weight cannot be null");
        }
        this.weight = weight;
        return this;
    }

    private Package setType(Type type) {
        if (type == null) {
            throw new RuntimeException("Type cannot be null");
        }
        this.type = type;
        return this;
    }

    private Package setReceiver(Person receiver) {
        if (receiver == null) {
            throw new RuntimeException("Receiver cannot be null");
        }
        this.receiver = receiver;
        return this;
    }

    private Package setSender(Person sender) {
        if (sender == null) {
            throw new RuntimeException("Sender cannot be null");
        }
        this.sender = sender;
        return this;
    }

    private Package setStamps(List<Stamp> stamps) {
        this.stamps = new ArrayList<>();
        if (this.stamps == null) {
            throw new RuntimeException("Stamps cannot be null");
        }
        return this;
    }

    @Override
    public String getPackageId() {
        return this.id;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public Type getType() {
        return this.type;
    }

    @Override
    public Address getReceiverAddress() {
        return this.receiver.getAddress();
    }

    @Override
    public Address getSenderAddress() {
        return this.sender.getAddress();
    }

    @Override
    public FullName getSenderFullName() {
        return this.sender.getFullName();
    }

    @Override
    public FullName getReceiverFullName() {
        return this.receiver.getFullName();
    }

    @Override
    public List<Stamp> getStamps() {
        return this.stamps;
    }

    @Override
    public void setMilesToDestination(double val) {
        milesToDestination = val;
    }

    @Override
    public double getMilesToSestination() {
        return milesToDestination;
    }

    @Override
    public String toString() {
        return "Package " + type + " id" + " {" + id + "} \nweight {" + weight + "} \nfrom {" + sender + "} \nto {" + receiver + "}";
    }
}
