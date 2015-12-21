package com.logistic.impl2.service;

import com.logistic.api.model.post.*;
import com.logistic.api.model.post.Package;
import com.logistic.api.model.transport.DeliveryTransport;
import com.logistic.api.model.transport.Transit;
import com.logistic.api.service.Storage;
import com.logistic.impl2.model.person.Address;

import java.awt.*;
import java.util.*;

/**
 * Created by Sergey on 06.11.2015.
 */
public class StorageHelper {
    public static final String TRANSIT_PREFIX = "_transit";
    public static final String POST_OFFICES_KEY = "postOffices";
    public static final String ADDRESSES_KEY = "addresses";
    public static final String DELIVERY_TRANSPORTS_KEY = "deliveryTransports";
    public static final String AVAILABLE_TRANSITS_KEY = "transits";
    public static final String POST_GEOLOCATION = "geolocation";

    public static void initializeData() {
        Random random = new Random();
        int x = random.nextInt() * 100;
        int y = random.nextInt() * 100;

        Storage.getInstance().putToStorage(ADDRESSES_KEY, Arrays.asList(
                new Address("Street 1", "City 1", "Country 1", 0),
                new Address("Street 2", "City 2", "Country 1", 1),
                new Address("Street 3", "City 3", "Country 2", 2),
                new Address("Invalid Street", "Invalid City", "Invalid Country", 3)
        ));
        //coordinates
        Storage.getInstance().putToStorage(POST_OFFICES_KEY, Arrays.asList(
                new com.logistic.impl2.model.post.PostOffice(new Address("Street 1", "City 1", "Country 1", 0),
                        com.logistic.api.model.post.Package.Type.T_30, 30, new Point(1, 1)),
                new com.logistic.impl2.model.post.PostOffice(new Address("Street 2", "City 2", "Country 1", 1),
                        Package.Type.T_30, 60, new Point(9, 2)),
                new com.logistic.impl2.model.post.PostOffice(new Address("Street 3", "City 3", "Country 2", 2),
                        Package.Type.T_30, 45, new Point(5, 7))
        ));

        Storage.getInstance().putToStorage(POST_GEOLOCATION, Arrays.asList(
                new Point(x, y)
        ));
        //what difference between same points
        Storage.getInstance().putToStorage(DELIVERY_TRANSPORTS_KEY, Arrays.asList(
                new com.logistic.impl2.model.transport.DeliveryTransport(DeliveryTransport.Type.LAND, getByPostCode(0), getByPostCode(1)),
                new com.logistic.impl2.model.transport.DeliveryTransport(DeliveryTransport.Type.AIR, getByPostCode(0), getByPostCode(2)),
                new com.logistic.impl2.model.transport.DeliveryTransport(DeliveryTransport.Type.SEA, getByPostCode(1), getByPostCode(2)),
                new com.logistic.impl2.model.transport.DeliveryTransport(DeliveryTransport.Type.LAND, getByPostCode(1), getByPostCode(0)),
                new com.logistic.impl2.model.transport.DeliveryTransport(DeliveryTransport.Type.AIR, getByPostCode(2), getByPostCode(0)),
                new com.logistic.impl2.model.transport.DeliveryTransport(DeliveryTransport.Type.AIR, getByPostCode(0), getByPostCode(1)),
                new com.logistic.impl2.model.transport.DeliveryTransport(DeliveryTransport.Type.SEA, getByPostCode(2), getByPostCode(1))

        ));
        //Point.distance(Point)
        Storage.getInstance().putToStorage(AVAILABLE_TRANSITS_KEY, Arrays.asList(
                //from 0 to 1
                new com.logistic.impl2.model.transport.Transit(Arrays.asList(
                        getByPostCode(0), getByPostCode(1)), random.nextInt(100) + 20),
                new com.logistic.impl2.model.transport.Transit(Arrays.asList(
                        getByPostCode(0), getByPostCode(1)), random.nextInt(100) + 150),
                //from 0 to 2
                new com.logistic.impl2.model.transport.Transit(Arrays.asList(
                        getByPostCode(0), getByPostCode(2)), random.nextInt(100) + 150),
                //from 1 to 0
                new com.logistic.impl2.model.transport.Transit(Arrays.asList(
                        getByPostCode(1), getByPostCode(0)), random.nextInt(100) + 20),
                new com.logistic.impl2.model.transport.Transit(Arrays.asList(
                        getByPostCode(1), getByPostCode(0)), random.nextInt(100) + 20),
                //from 1 to 2
                new com.logistic.impl2.model.transport.Transit(Arrays.asList(
                        getByPostCode(1), getByPostCode(2)), random.nextInt(100) + 20),

                //from 2 to 0
                new com.logistic.impl2.model.transport.Transit(Arrays.asList(
                        getByPostCode(2), getByPostCode(0)), random.nextInt(100) + 20),
                //from 2 to 1
                new com.logistic.impl2.model.transport.Transit(Arrays.asList(
                        getByPostCode(2), getByPostCode(1)), random.nextInt(100) + 20)
        ));
    }

    public static java.util.List<PostOffice> getAllOffices() {
        return Storage.getInstance().<java.util.List>getById(POST_OFFICES_KEY);
    }

    public static java.util.List<DeliveryTransport> getDeliveryTransports() {
        return Storage.getInstance().<java.util.List>getById(DELIVERY_TRANSPORTS_KEY);
    }

    public static java.util.List<Transit> getTransits() {
        return Storage.getInstance().<java.util.List>getById(AVAILABLE_TRANSITS_KEY);
    }

    public static void saveParcelTransit(Package parcel, Transit transit) {
        Storage.getInstance().putToStorage(parcel.getPackageId(), parcel);
        Storage.getInstance().putToStorage(parcel.getPackageId() + TRANSIT_PREFIX, transit);
    }

    public static PostOffice getByPostCode(int code) {
        java.util.List<PostOffice> offices = Storage.getInstance().<java.util.List>getById(POST_OFFICES_KEY);
        for (PostOffice postOffice : offices) {
            if (postOffice.getAddress().getCode() == code) {
                return postOffice;
            }
        }
        return null;
    }

    public static Package getPackage(String id) {
        return Storage.getInstance().<Package>getById(id);
    }

    public static Transit getTransit(String id) {
        return Storage.getInstance().<Transit>getById(id + TRANSIT_PREFIX);
    }

    public static com.logistic.api.model.person.Address getRandomAddress() {
        Random random = new Random();
        java.util.List<Address> addresses = Storage.getInstance().<java.util.List>getById(ADDRESSES_KEY);
        return addresses.get(random.nextInt(addresses.size()));
    }
}
