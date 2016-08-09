package codekata6.java;

import java.io.*;
import java.util.*;
import java.lang.*;
public class Codekata6Java {

   
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      String str=s.next();
      String str3;
      int i;
      char[] orarr=new char[100];
      int size=str.length();
      System.out.println("Enter the position to be reversed");
      int pos=s.nextInt();
      for(i=0;i<size;i++)
          orarr[i]=str.charAt(i);
      String str1=str.substring(pos, size);
      String str4=str.substring(0,pos);
      StringBuilder str2=new StringBuilder();
      str2.append(str1);
      str2=str2.reverse();
      str3=str2.toString();
      System.out.println(str2);
      str4=str4.concat(str3);
      System.out.println(str4);
      
      
      
      
      
    }
    
}
