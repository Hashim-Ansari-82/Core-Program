package com.assertion;

public class AssertionDemo2nd {
    public static void main(String[] args) {

        boolean assertionOn=true;
        assert(assertionOn):assertionOn=false;
        if(assertionOn) {
            System.out.println("assertionON");
        }
        boolean assertion=false;
        assert(assertion):assertion=true;
        if(assertion) {
            System.out.println("assertionON");
        }

    }
}
