package com.thoughtworks.tdd;

public class FizzBuzz {
    public String say(int student) {
        if(student == 3){
            return "fizz";
        }
        else  if(student == 5){
            return "buzz";
        }
        return String.valueOf(student);
    }
}
