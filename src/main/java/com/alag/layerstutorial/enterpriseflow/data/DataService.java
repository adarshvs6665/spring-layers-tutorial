package com.alag.layerstutorial.enterpriseflow.data;

import org.springframework.stereotype.Component;

import java.util.List;

//Getting data
@Component
public class DataService {
    public List<Integer> retrieveData() {
        return List.of(12,34,56,78,90);
    }
}
