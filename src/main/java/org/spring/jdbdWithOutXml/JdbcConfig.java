package org.spring.jdbdWithOutXml;


import org.spring.jdbdWithOutXml.dao.StudentDao;
import org.spring.jdbdWithOutXml.dao.StudentDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class JdbcConfig {
@Bean
    public DataSource getDataSource() {
        DriverManagerDataSource ds= new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/springjdbc?useSSL=false");
        ds.setUsername("root");
        ds.setPassword("root");
        return ds;
    }

    @Bean
    public JdbcTemplate template() {
    JdbcTemplate template=new JdbcTemplate();
    template.setDataSource(getDataSource());
    return template;

    }

    @Bean(name = "studentDao")
    public StudentDao dao() {
       StudentDaoImpl dao= new StudentDaoImpl();
       dao.setJdbcTemplate(template());
       return dao;
    }



}
