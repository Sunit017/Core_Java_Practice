class Computer{
    public void work(){
        System.out.println("Computer Works");
    }
}
class Laptop extends Computer{
    public void work(){
        System.out.println("Laptop works ");
    }
}
class Mobile{
    public void work(){
        System.out.println("Mobile works ");
    }
}

public class DynamicMethodDemo {
    public static void main(String a[])
    {
        Computer obj =new Computer();
        obj.work();
        obj =new Laptop();
        obj.work();
    }

}
