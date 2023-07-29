package org.spring.springpractice.autowireannotation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Data
public class Car {

    private String color;

    @Autowired() //It is used to create the dependency Injection if one class is dependent on another class
    @Qualifier("maruti1") //If we have multiple beans of a class, then @Qualifier annotation is used to take the created bean and give the result
    private MarutiCar marutiCar;
}
