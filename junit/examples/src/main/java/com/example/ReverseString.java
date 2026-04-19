package com.example;

public class ReverseString {
   
     public String reverse(String str){
          String n = "";
          
          int right = str.length()-1;
          while(right>=0){
               n+=str.charAt(right);
               right--;
          }
        return n;
        
     }
}
