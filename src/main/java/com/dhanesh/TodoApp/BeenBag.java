package com.dhanesh.TodoApp;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeenBag {

    @Bean
    public List<Todo> getDataSource()
    {
        return new ArrayList<>();
    }
}
