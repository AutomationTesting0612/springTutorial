package org.spring.springpractice.com.configurationannotation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Samosa {

    @Value("Triangle")
    private String size;

    @Value("0.5")
    private double wight;

}
