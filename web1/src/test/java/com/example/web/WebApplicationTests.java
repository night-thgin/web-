package com.example.web;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class WebApplicationTests {

    @Test
    public void testUuid(){
        for (int i=0;i<1000;i++){
            String uuid = UUID.randomUUID().toString();
            System.out.println(uuid);
        }
    }

}
