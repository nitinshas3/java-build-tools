package com.example;

import java.util.Arrays;

public class TimeChecking {
    public int [] checktime(int [] a){
        for(int i = 0;i<100000;i++){
            Arrays.sort(a);
        }
        return a;
    }
}
