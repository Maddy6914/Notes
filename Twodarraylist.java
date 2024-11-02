import java.util.ArrayList;
import java.util.*;
public class Twodarraylist
 {
    public static void main(String[] args)
    {
        ArrayList <ArrayList<Integer>> l = new ArrayList<>();
        Scanner in=new Scanner(System.in);
        for (int i=0;i < 3; i++)
         l.add(new ArrayList<>());


        for (int i=0;i < 3; i++)
          for(int j=0;j < 3;j++)
            l.get(i).add(in.nextInt());

        System.out.println(l+"");
        in.close();
    }
}
