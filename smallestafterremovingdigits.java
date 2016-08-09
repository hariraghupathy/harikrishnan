package codekatapro.java;

import java.io.*;
import java.util.*;
public class CodekataproJava {

  
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      ArrayList<Integer> al=new ArrayList();
      System.out.println("Enter the elements to be deleted");
      int k=s.nextInt();
      int i;
      System.out.println("Enter the number of elements in the array");
      int size=s.nextInt();
      int[] number=new int[100];
      for(i=0;i<size;i++)
      {
          number[i]=s.nextInt();
          al.add(number[i]);
      }
      Collections.sort(al);
      for(i=0;i<size;i++)
      {
          number[i]=al.get(i);
      }
      for(i=0;i<size-k;i++)
      {
          System.out.print(number[i]);
      }
      
    }
    
}
