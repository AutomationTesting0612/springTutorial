package org.spring.valueannotation.collections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Student {

    @Value("Akhil")
    private String studentName;

    @Value("Indora")
    private String city;

    @Value("#{temp}")
    private List<String> mobileNo;


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(List<String> mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
