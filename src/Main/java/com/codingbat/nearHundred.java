package com.codingbat;

public class nearHundred {

    // Given an int n, return true if it is within 10 of 100 or 200.
    // Note: Math.abs(num) computes the absolute value of a number.
    public boolean nearHundred(int n) {
        if(189 < n && n < 211){
            return true;
        }
        if(89 < n && n < 111){
            return true;
        }
        return false;
    }
}
