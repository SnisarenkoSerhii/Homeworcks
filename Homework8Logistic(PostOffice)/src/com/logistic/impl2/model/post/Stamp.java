package com.logistic.impl2.model.post;

import com.logistic.api.model.person.Address;

import java.util.Date;

/**
 * Created by Sergey on 03.11.2015.
 */
public class Stamp implements com.logistic.api.model.post.Stamp {

    private Address postOfficeAddress;
    private Date stampDate;

    public Stamp(Address postOfficeAddress, Date stampDate) {
        setPostOfficeAddress(postOfficeAddress);
        setStampDate(stampDate);
        this.stampDate = stampDate;
    }

    private Stamp setPostOfficeAddress(Address postOfficeAddress) {
        if(postOfficeAddress == null){
            throw new RuntimeException("PostOfficeAddress cannot be null");
        }
        this.postOfficeAddress = postOfficeAddress;
        return this;
    }

    private Stamp setStampDate(Date stampDate) {
        if(postOfficeAddress == null){
            throw new RuntimeException("StampDate cannot be null");
        }
        this.stampDate = stampDate;
        return this;
    }

    @Override
    public Address getPostOfficeAddress() {
        return this.postOfficeAddress;
    }

    @Override
    public Date getStampDate() {
        return this.stampDate;
    }
}
