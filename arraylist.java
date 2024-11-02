import java.util.ArrayList;
import java.util.*;

public class arraylist {
    public static void main(String[] args){
        ArrayList<Integer> l=new ArrayList<>(10);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println(l);
        System.out.println(l.contains(3));
        System.out.println(l.get(3) + "");
        l.set(0,10);
        System.out.println(l);
        l.remove(1);
        System.out.println(l);
        ArrayList<Integer> p=new ArrayList<>(10);
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the Elements for ArrayList:");
        for(int i=0;i<10;i++)
         p.add(in.nextInt());

         System.out.println(p);

        in.close();

    }
}
