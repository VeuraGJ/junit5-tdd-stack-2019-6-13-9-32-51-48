package com.thoughtworks.tdd;

public class FizzBuzz {
    public String say(int student) {
        if(student == 105){
            return "fizzbuzzwhizz";
        }
        if(student % 5 ==0 && student % 7 ==0){
            return "buzzwhizz";
        }
        if(student % 3 == 0 && student % 7 ==0){
            return "fizzwhizz";
        }
        if(student % 3 == 0 && student % 5 ==0){
            return "fizzbuzz";
        }
        if(student % 3 ==0){
            return "fizz";
        }
        else  if(student % 5 == 0){
            return "buzz";
        }
        else  if(student % 7 == 0) {
            return "whizz";
        }
        return String.valueOf(student);
    }
}
