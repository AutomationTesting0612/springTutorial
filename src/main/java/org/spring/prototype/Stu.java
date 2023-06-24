package org.spring.prototype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Stu {

    @Value("Akhil")
    private String stu;

    @Value("Indora")
    private String city;


    public String getstu() {
        return stu;
    }

    public void setstu(String stu) {
        this.stu = stu;
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
                "stu='" + stu + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
