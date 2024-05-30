package com.mav.practice;

class App{
    public void run(){
        System.out.println("Bike is Running ");
    }
}
public class AnonymousInnerClass {
    public static void main (String a[]) {
        App app = new App()
        {
            public void run() {
            System.out.println("Working");
        }

        };
        app.run();
    }

}
