package com.jetbrains.main;

import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int total = 0;
        System.out.println("Enter the expression for normal calculator");
        String input = sc.next();
        EvaluateService evaluate = new EvaluateService();
        int result = evaluate.execute(input);
        System.out.print("Result =" +result);



    }
}
