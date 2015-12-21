package com.logistic.impl2.model.post;

import com.logistic.api.model.person.Address;
import com.logistic.api.model.post.Package;
import com.logistic.api.model.post.Stamp;

import java.awt.*;
import java.util.Date;

/**
 * Created by Sergey on 03.11.2015.
 */
public class PostOffice implements com.logistic.api.model.post.PostOffice {


    private Address address;
    private Package.Type acceptableType;
    private int maxWeight;
    private Point coordinates;
    private boolean stamp;



    public PostOffice(Address address, Package.Type acceptableType, int maxWeight, Point coordinates) {
        setAddress(address);
        setAcceptableType(acceptableType);
        setMaxWeight(maxWeight);
        setCoordinates(coordinates);
    }

    private PostOffice setAddress(Address address) {
        if(address == null){
            throw new RuntimeException("Address cannot be null");
        }
        this.address = address;
        return this;
    }

    private PostOffice setAcceptableType(Package.Type acceptableType) {
        if(acceptableType == null){
            throw new RuntimeException("Type not found");
        }
        this.acceptableType = acceptableType;
        return this;
    }

    private PostOffice setMaxWeight(int maxWeight) {
        if(maxWeight < 0){
            throw new RuntimeException("Weight must be greater then 0");
        }
        this.maxWeight = maxWeight;
        return this;
    }

    private PostOffice setCoordinates(Point coordinates) {
        if(coordinates == null){
            throw new RuntimeException("Coordinates cannot be null");
        }
        this.coordinates = coordinates;
        return this;
    }

    @Override
    public Stamp getStamp() {
        return new com.logistic.impl2.model.post.Stamp(this.address, new Date());
    }

    @Override
    public Address getAddress() {
        return this.address;
    }

    @Override
    public Package.Type getAcceptableTypes() {
        return this.acceptableType;
    }

    @Override
    public int getMaxWeight() {
        return this.maxWeight;
    }

    @Override
    public boolean sendPackage(Package parcel) {
        return !parcel.getReceiverAddress().equals(address);
    }

    @Override
    public boolean receivePackage(Package parcel) {
        //не самый лучший вариант, поскольку getStamps может возвращать немодифицируемую коллекция
        //лучше добавить в интерфейс метод для добавления штампа
        parcel.getStamps().add(getStamp());
        return true;
    }

    @Override
    public int getCode() {
        return this.address.getCode();
    }

    @Override
    public Point getGeolocation() {
        return this.coordinates;
    }

    @Override
    public String toString() {
        return "Office " + this.address.getCode() + " ["+ this.address + "] on {" +"x = " + this.coordinates.x +  ",y = "+ this.coordinates.y + "}";
    }


}
