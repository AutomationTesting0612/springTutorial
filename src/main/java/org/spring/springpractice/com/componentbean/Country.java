package org.spring.springpractice.com.componentbean;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class Country {

    @Autowired
    private States states;

}
