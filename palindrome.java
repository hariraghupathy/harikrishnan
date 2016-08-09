package codekata4.java;

import java.io.*;
import java.util.*;
import java.lang.*;
public class Codekata4Java {


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] a=new int[100];
       char[] b=new char[100];
        int answer=0;
        String pal1;
        String pal3;
        int size=s.nextInt();
        int i;
        for(i=0;i<size;i++)
        {
            a[i]=s.nextInt();
        }
        for(i=0;i<size;i++)
        {
            answer+=a[i];
        }
        pal1=String.valueOf(answer);
        System.out.println(pal1); 
        StringBuilder pal2=new StringBuilder();
        pal2.append(pal1);
        pal2=pal2.reverse();
        pal3=pal2.toString();
        if(pal1.equals(pal3))
        System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }
    
}
