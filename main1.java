import java.util.*;
public class main1
{
    public static void main(String[] a)
    {
        int[] arr ={1,2,3,4,5,6,7,8,9,0};

        //swap(arr ,0,9);
       // reverse(arr);
        System.out.println(Arrays.toString(arr));
        int max=min(arr,2,7);
        System.out.println(max+"");
        reverse(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void swap(int[] ar,int start,int end)
    {
        int i= ar[start];
        int j=ar[end];
        ar[start]=(i+j)-i;
        ar[end]=(i+j)-j;
    }
    static void reverse(int[]ar)
    {
        int start=0,end=ar.length-1;

        while(start<=end)
            swap(ar,start++,end--);
    }
    static void reverse(int[]ar, int start,int end)
    {
        while(start < end)
            swap(ar,start++,end--);
    }
    static int max(int[] ar) 
    {
       int max=ar[0];
       for(int m: ar)
        if(max<m)
         max=m;
       return max;
    }
    static int max(int[] ar,int start,int end)
    {
        int max=ar[start];
        for(int i=start;i < end;i++)
         if(max<ar[i])
          max=ar[i];
        return max;
        
    }
    static int min(int[] ar) 
    {
       int min=ar[0];
       for(int m: ar)
        if(min>m)
         min=m;
       return min;
    }
    static int min(int[] ar,int start,int end)
    {
        int min=ar[start];
        for(int i=start;i < end;i++)
         if(min>ar[i])
          min=ar[i];
        return min;
        
    }
    
}
