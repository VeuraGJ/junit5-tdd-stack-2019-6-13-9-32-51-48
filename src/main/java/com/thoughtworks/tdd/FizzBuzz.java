package com.thoughtworks.tdd;

public class FizzBuzz {
    public String say(int student) {
        if(student % 3 ==0){
            return "fizz";
        }
        else  if(student % 5 == 0){
            return "buzz";
        }
        else  if(student == 7){
            return "whizz";
        }
        return String.valueOf(student);
    }
}
