class A{
    public A(){
       System.out.println("In A Constructor");
    }
    public A(int b){
        System.out.println("In A int Constructor");
    }

}
class B extends A{
    public B(){
        System.out.println("In B Constructor");
    }
    public B(int a){
        this();
        System.out.println("In B int Constructor");
    }

}

public class DemoSuper {
    public static void main(String a[])
    {
      B obj=new B(5);
    }

}
