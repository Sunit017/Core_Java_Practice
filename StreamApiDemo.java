import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo {

    public static void main(String a[])
    {
        // find out the even number from a list

        List<Integer> l1=new ArrayList<>();
        l1.add(23);
        l1.add(98);
        l1.add(56);
        l1.add(39);
        System.out.println(l1);

        for(int i:l1)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }

        // By Using Stream

        List<Integer>a1= l1.stream().filter(n ->n%2==0).collect(Collectors.toList());
        System.out.println(a1);
    }
}
