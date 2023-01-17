package com.example.springtutorialvishal.config;

import com.example.springtutorialvishal.datasource.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
    @Bean
    FakeDataSource fakeDataSource(@Value("${vsk.username}") String username ,
                                  @Value("${vsk.password}") String password ,
                                  @Value("${vsk.jdbcUrl}") String jdbcUrl ){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setJdbcUrl(jdbcUrl);
        return fakeDataSource ;
    }
}
