package com.mav.practice;

public class ThreadLambdaDemo {
    public static void main(String a[])
    {
        Runnable t1= ()->{
            for(int i=1;i<=10;i++)
            {
                System.out.println(i);
            }
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Thread thread=new Thread(t1);
        thread.start();
    }
}
