package codekata5.java;

import java.io.*;
import java.util.*;
public class Codekata5Java {

   
    public static void main(String[] args)throws Exception {
        Scanner s=new Scanner(System.in);
        int i,j;
        int answer=1;
        int flag=0;
        int[] arr=new int[100];
        int size=s.nextInt();
        for(i=0;i<size;i++)
            arr[i]=s.nextInt();
        for(i=0;i<size;i++)
        {
            for(j=i+1;j<size;j++)
            {
                if(arr[i]==arr[j])
                {
                   answer=arr[i];
                   flag=1;
                   break;
                }
            }
            if(flag==1)
            {
                break;
            }
        }
        System.out.println("First repeating element is "+answer);
        
        
    }
    
}
