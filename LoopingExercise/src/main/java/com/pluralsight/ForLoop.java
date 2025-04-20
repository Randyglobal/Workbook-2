package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--){
            System.out.println(i);
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
