package com.logistic.impl2.model.person;

import com.logistic.api.model.person.Address;
import com.logistic.api.model.person.FullName;

/**
 *
 */
public class Person implements com.logistic.api.model.person.Person, FullName {
    private Address address;
    private String firstName;
    private String lastName;
    private String middleName;


    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String getMiddleName() {
        return this.middleName;
    }

    @Override
    public Address getAddress() {
        return this.address;
    }

    @Override
    public FullName getFullName() {
        return this;
    }

    @Override
    public String toString() {
        return "Person [" + firstName + " " + lastName + " " + middleName + "] " + address;
    }

    public static final class PersonBuilder {
        private String street;
        private String city;
        private String country;
        private int code;
        private String firstName;
        private String lastName;
        private String middleName;
        private Address address;

        public PersonBuilder address(Address address) {
            this.address = address;
            if(this.address == null){
                throw new RuntimeException("Address can't be null!");
            }
            return this;
        }
        public PersonBuilder street(String val) {
            this.street = val;
            if(this.street == null){
                throw new RuntimeException("Street can't be null!");
            }
            return this;
        }
        public PersonBuilder city(String val) {
            this.city = val;
            if(this.city == null){
                throw new RuntimeException("City can't be null!");
            }
            return this;
        }
        public PersonBuilder country(String val) {
            this.country = val;
            if(this.country == null){
                throw new RuntimeException("Country can't be null!");
            }
            return this;
        }
        public PersonBuilder code(int val) {
            this.code = val;
            if(this.code == 0){
                throw new RuntimeException("Code can't be null!");
            }
            return this;
        }
        public PersonBuilder firstName(String val) {
            this.firstName = val;
            if(this.firstName == null){
                throw new RuntimeException("FirstName can't be null!");
            }
            return this;
        }
        public PersonBuilder lastName(String val) {
            this.lastName = val;
            if(this.lastName == null){
                throw new RuntimeException("LastName can't be null!");
            }
            return this;
        }
        public PersonBuilder middleName(String val) {
            this.middleName = val;
            if(this.middleName == null){
                throw new RuntimeException("MiddleName can't be null!");
            }
            return this;
        }
        public Person build() {
            Address address = null;
            if(this.address != null) {
                address = this.address;
            } else {
                address = new com.logistic.impl2.model.person.Address(street, city, country, code);
            }
            Person person = new Person();
            person.address = address;
            if(this.address == null){
                throw new RuntimeException("Address can't be null!");
            }
            person.firstName = firstName;
            if(this.firstName == null){
                throw new RuntimeException("FirstName can't be null!");
            }
            person.lastName = lastName;
            if(this.lastName == null){
                throw new RuntimeException("LastName can't be null!");
            }
            person.middleName = middleName;
            if(this.middleName == null){
                throw new RuntimeException("MiddleName can't be null!");
            }
            return person;
        }
    }
}
