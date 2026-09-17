package com.example.Student_management_system.services;

import org.springframework.stereotype.Service;
import com.example.Student_management_system.model.info;

@Service 
public class getinfo {
    public info getInfo() {
        return new info(
            1L,
            "John Doe",
            "john.doe@example.com",
            "123-456-7890"
        );
    }
    public info addinfo(info info) {

        return info;    }
}


