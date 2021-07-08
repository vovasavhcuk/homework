package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        exc1();
        exc2();
        //доп задание
        System.out.println(degree(2, 3));
        sqequalation(2, 2, 2);

    }
    // задание 1
    public static void exc1() {
        System.out.println(" " + (char)40 + (char)92 + (char)47 + (char)41 + "\n " + (char)40 + (char)62 + " " + (char)60 + (char)41 + "\n" + (char)99 + (char)40 + (char)34 + (char)41 + (char)40 +(char)34 + (char)41);
    }
    // задание 2
    public static void exc2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        double a, b, c, d, e, f, g, h, y, x;
        System.out.println("1)\nEnter a number");
        x = in.nextDouble();
        a = 3 * Math.pow(x, 1/3) - 7;
        System.out.println("a = " + a);
        System.out.println("2)\nEnter a number");
        x = in.nextDouble();
        y = in.nextDouble();
        b = 4 * x * 3 - 12 * y;
        System.out.println("b = " + b);
        System.out.println("3)\nEnter a number");
        x = in.nextDouble();
        y = in.nextDouble();
        c = Math.sin(x * (-3 + 2*y + 1));
        System.out.println("c = " + c);
        System.out.println("4)\nEnter a number");
        x = in.nextDouble();
        d = 122 * (1/(x*x));
        System.out.println("d = " + d);
        System.out.println("5)\nEnter a number");
        x = in.nextDouble();
        y = in.nextDouble();
        e = x*x*x*x*Math.abs(485-179*y);
        System.out.println("e = " + e);
        System.out.println("6)\nEnter a number");
        x = in.nextDouble();
        f = 3 + Math.pow(9, x) - 5/x - 1;
        System.out.println("f = " + f);
        System.out.println("7)\nEnter a number");
        x = in.nextDouble();
        g = 2.5* 4-6*x - 5;
        System.out.println("g = " + g);
        System.out.println("8)\nEnter a number");
        x = in.nextDouble();
        h = Math.cos(x/2) + Math.sin(x/4) + 3*x/6;
        System.out.println("h = " + h);
        System.out.println("9)\nEnter a number");
        x = in.nextDouble();
        y = Math.abs(5*x + 3/(x*x) + 6 + 7*x*x*x - 12);
        System.out.println("y = " + y);
    }
    //доп.задание
    public static double degree(int a, int n){
        int tmp = a; //временная переменная чтобы записать начальное значение а
        for(int i = 0; i < n - 1; i++){
            a *= tmp;
        }
        return a;
    }
    public static void sqequalation(double a, double b, double c){
        double x1 = (-b + Math.sqrt(b*b-4*a*c))/2*a;
        double x2 = (-b - Math.sqrt(b*b-4*a*c))/2*a;
        System.out.println("x1=" + x1 + "\nx2=" + x2);
    }
}