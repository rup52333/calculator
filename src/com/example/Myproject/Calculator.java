package com.example.Myproject;
import java.util.*;
import java.io.*;
public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        int option;
        int result;
        char ch;

        System.out.println("\n\n		Welcome to this Mini Calculator");


        do{

            System.out.print("\n		Enter your first number : ");
            num1 = sc.nextInt();
            System.out.print("\n		Enter your second number : ");
            num2 = sc.nextInt();

            System.out.println("\n		You can select one of the below options");
            System.out.println("		1. Addition");
            System.out.println("		2. Substration");
            System.out.println("		3. Multiplication");
            System.out.println("		4. Division");
            System.out.print("\n		Plese select your option : ");
            option = sc.nextInt();

            if(option == 1){
                result = num1+num2;
                System.out.println("\n		Addition of "+num1 +" & "+ num2+" = " + result);
            }
            else if(option == 2){
                result = num1-num2;
                System.out.println("\n		Substraction of "+num1 +" & "+ num2+" = " + result);
            }
            else if(option == 3){
                result = num1*num2;
                System.out.println("\n		Multiplication of "+num1 +" & "+ num2+" = " + result);
            }
            else if(option == 4){
                result = num1/num2;
                System.out.println("\n		Division of "+num1 +" & "+ num2+" = " + result);
            }
            else{
                System.out.println("\n		Invalid Choice");
            }

            System.out.print("\n		Do you want to continue(y/n) : ");
            ch = sc.next().charAt(0);

        }while(ch == 'y' || ch == 'Y');



    }
}
