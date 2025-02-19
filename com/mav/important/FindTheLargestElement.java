package com.mav.important;

public class FindTheLargestElement {

    public static void main(String[] args) {
       int num[]={10,7,23,45,8};

       int largest=num[0];
       for(int i=1;i<num.length;i++)
       {
           if(largest<num[i])
           {
               largest=num[i];
           }
       }
        System.out.println("Largest Number is "+largest);
    }
}
