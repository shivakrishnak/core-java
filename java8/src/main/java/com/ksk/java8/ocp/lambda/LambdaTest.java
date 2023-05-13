package com.ksk.java8.ocp.lambda;

import java.util.function.UnaryOperator;

public class LambdaTest {
    public static void main(String[] args) {
        UnaryOperator<Integer> d  = x -> x * 3;
        UnaryOperator<Integer> d1 = (Integer x) -> x * 3;
        //UnaryOperator<Integer> d2 = (int x) -> x * 3; //error expected Integer
        //UnaryOperator<Integer> d3  = x ->{ x * 3;}; // error need return
        UnaryOperator<Integer> d4  = x ->{ return x * 3;};
    }

}
