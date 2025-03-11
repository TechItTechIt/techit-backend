package com.techit.common.testservice;

import org.springframework.stereotype.Service;

@Service
public class CommonTestService {

    public void testPrint() {
        System.out.println( "in common");
    }
}
