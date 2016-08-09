# harikrishnan
package array;

import java.io.*;
import java.util.*;
public class Array {

    
    public static void main(String[] args)throws Exception {
        int[] a=new int[100]; 
        int count=0;
        int newarr=0;
        ArrayList<Integer> al=new ArrayList();
        int n,i;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=0;i<n;i++)
        {
           a[i]=s.nextInt();
           al.add(a[i]);
        }
        Collections.sort(al);
        for(i=0;i<n;i++)
        {
            a[i]=al.get(i);
        }
        for(i=0;i<n-1;i++)
        {
            if(a[count]==a[count+1])
            {
                count++;
                newarr++;
            }
            else if(a[count]!=a[count+1])
            {
                count++;
            }
        }
        System.out.println(newarr);
    }
    
}
