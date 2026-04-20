package com.example;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class TimeCheckingTest {

    TimeChecking t;

    @BeforeEach
    void init(){
          t = new TimeChecking();
    }

    @Test
    void testChecktime() {
        int [] a = {1,2,3,4,5};
       
        
        assertTimeout(Duration.ofMillis(100), ()-> t.checktime(a));
    }
} // this cheks if the function runs in the expected amount of time 
