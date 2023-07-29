package org.spring.springpractice.com.componentbean;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Data
@PropertySource("classpath:springpractice/application.properties")
public class States {

    @Value("${usernamteste:}")
    private String name;

}
