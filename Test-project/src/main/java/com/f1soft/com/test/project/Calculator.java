package com.f1soft.com.test.project;

/**
 *
 * @author yogesh
 */
public class Calculator {

    public static void main(String[] args) {


        Divide d = new Divide();
        d.division(4, 3);

        Multiply multiply = new Multiply();
        double result = multiply.multiply(5, 10);
        System.out.println("result after multiplication: "+result);
        

    }

}
