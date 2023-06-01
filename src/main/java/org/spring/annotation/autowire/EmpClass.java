package org.spring.annotation.autowire;

import org.spring.autowire.xml.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmpClass {

    @Autowired
    @Qualifier("address1")
    private AddressClass address;

    public EmpClass() {
        super();
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }

    public EmpClass(AddressClass address) {
        this.address = address;
    }

    public AddressClass getAddress() {
        return address;
    }

    public void setAddress(AddressClass address) {
        this.address = address;
    }



}
