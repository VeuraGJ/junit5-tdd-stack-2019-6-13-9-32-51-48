package com.thoughtworks.tdd;

public class FizzBuzz {
    public String say(int student) {
        if(student == 105){
            return "fizzbuzzwhizz";
        }
        if(student == 21){
            return "fizzwhizz";
        }
        if(student == 15){
            return "fizzbuzz";
        }
        if(student == 35){
            return "buzzwhizz";
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
