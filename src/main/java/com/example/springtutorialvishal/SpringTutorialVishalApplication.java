package com.example.springtutorialvishal;

import com.example.springtutorialvishal.datasource.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringTutorialVishalApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringTutorialVishalApplication.class, args);

//        FakeDataSource fakeDataSource = context.getBean(FakeDataSource.class) ;
        FakeDataSource fakeDataSource = (FakeDataSource) context.getBean("fakeDataSource") ;
        System.out.println(fakeDataSource.getUsername());
        System.out.println(fakeDataSource.getPassword());
        System.out.println(fakeDataSource.getJdbcUrl());
    }

}
