package com.logistic.impl2;

import com.logistic.api.model.transport.Transit;
import com.logistic.api.service.SenderService;
import com.logistic.impl.model.exception.PackageNotFound;
import com.logistic.impl.model.exception.TransitNotFound;
import com.logistic.impl2.model.person.Person;
import com.logistic.impl2.service.SenderServiceImpl;
import com.logistic.impl2.service.StorageHelper;

import java.util.List;
import java.util.Random;

/**
 * Created by Sergey on 06.11.2015.
 */
//try to realize Point and costs
public class Main {
    public static void main(String[] args) {
        StorageHelper.initializeData();
        SenderService service = new SenderServiceImpl();
        for (int i = 0; i < 10; i++) {

            com.logistic.api.model.post.Package parcel = generateRandomPackage();

            List<Transit> transitList = service.calculatePossibleTransits(parcel);
            Transit transit = generateRandomTransit(transitList);
            if (transit != null) {
                System.out.println("----------Iteration " + i + "----------");
                System.out.println("Package to send " + parcel);
                System.out.println("Has been chosen " + transit);
                service.sendPackage(parcel, transit);
                System.out.println("Package is here " + service.getPackageCurrentPosition(parcel.getPackageId()));
                System.out.println("Miles to destination " + service.getMilesToDestination(parcel.getPackageId()));
            } else {
                i--;
                //System.out.println("Wrong package....retrying");
            }
        }
    }

    public static com.logistic.api.model.post.Package generateRandomPackage() {
        Random random = new Random();
        com.logistic.api.model.post.Package result = new com.logistic.impl2.model.post.Package(
                random.nextInt(100) + 1,//weight
                com.logistic.api.model.post.Package.Type.getRandomType(),//type
                new Person.PersonBuilder()//peron 1
                        .address(StorageHelper.getRandomAddress())
                        .firstName("receiver f name 1")
                        .lastName("receiver l name 1")
                        .middleName("receiver m name 1")
                        .build(),
                new Person.PersonBuilder()//person2
                        .address(StorageHelper.getRandomAddress())
                        .firstName("sender f name 1")
                        .lastName("sender l name 1")
                        .middleName("sender m name 1")
                        .build()
        );
        return result;
    }

    public static Transit generateRandomTransit(List<Transit> transits) {
        if (transits.size() == 0) return null;
        Random random = new Random();
        return transits.get(random.nextInt(transits.size()));
    }
}
