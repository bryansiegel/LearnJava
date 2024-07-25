package com.bryansiegel.chapter01;


public class Exceptions {
    //Java The complete Reference

    class Exc1 {
        static void subroutine() {
            try{
                int d = 0;
                int a = 10 / d ;

            } catch (ArithmeticException e) {
                System.out.println("Division by zero" + e.getMessage());
            }
        }
    }

    //run
        public static void main(String[] args) {
            Exc1.subroutine();
        }
    }
