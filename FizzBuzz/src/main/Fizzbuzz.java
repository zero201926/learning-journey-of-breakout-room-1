package main;

public class Fizzbuzz {
//    Logic for checking the modulo of the inputted number
    public static String result(int number){
        if ((number % 3 == 0) & (number % 5 == 0)){
            return "fizzbuzz";
        } else if(number % 3 == 0) {
            return "fizz";
        } else if (number % 5 == 0) {
            return "buzz";
        }
//        Return the outputted value from method String result
        return String.valueOf(number);
    }

}

