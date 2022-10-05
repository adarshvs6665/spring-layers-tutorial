package com.alag.layerstutorial.enterpriseflow.business;

import com.alag.layerstutorial.enterpriseflow.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

//Business logic
@Component
public class BusinessService {

    @Autowired
    private DataService dataService;
    public long calculateSum() {
        List<Integer> data = dataService.retrieveData();
        return data.stream().reduce(Integer::sum).get();
    }
}
