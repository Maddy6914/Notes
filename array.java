//import java.util.*;

import java.util.Arrays;

public class array{
    public static void main (String []ar)
    {
     //Scanner in = new Scanner(System.in);
     int [] a= new int[4];
     for(int i=0;i<a.length;i++)
     a[i]= Integer.parseInt(ar[i]);
     for(int j: a)
     System.out.println(j);
     System.out.println("-------------------------------------");
     System.out.println(Arrays.toString(a));
    // in.close();
    }
}