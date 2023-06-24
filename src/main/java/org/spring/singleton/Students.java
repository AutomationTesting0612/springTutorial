package org.spring.singleton;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Students {

    @Value("Akhil")
    private String studentsName;

    @Value("Indora")
    private String city;


    public String getstudentsName() {
        return studentsName;
    }

    public void setstudentsName(String studentsName) {
        this.studentsName = studentsName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentsName='" + studentsName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
