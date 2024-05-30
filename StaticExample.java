public class StaticExample {

    int age;
    String name;
    static String branch;

    public void study(){
        branch="ECE";
        System.out.println(branch);
    }


    public static void main(String [] a)
    {
        StaticExample staticExample=new StaticExample();
        staticExample.study();
       StaticExample.branch="CSE";
        System.out.println(branch);
    }


}
