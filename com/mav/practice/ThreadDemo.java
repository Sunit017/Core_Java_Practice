package com.mav.practice;
class ThreadA extends Thread{
    public void run(){
        for(int i=1;i<10;i++)
        {
            System.out.println("Hi");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
class ThreadB extends Thread{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Hello");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
public class ThreadDemo {
    public static void main(String a[])
    {
        ThreadA obj1=new ThreadA();
        ThreadB obj2=new ThreadB();

        obj1.start();
        obj2.start();
    }
}
