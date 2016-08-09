# harikrishnan
package codekata1.java;

import java.io.*;
import java.util.*;
public class Codekata1Java {

   
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String name;
        String s1,s2;
        int size;
        name=s.next();
        size=name.length();
        s1=name.substring(0, size/2);
        s2=name.substring(size/2, size);
        if(s1.equals(s2))
        {
            System.out.println("double string");
        }
        else
        {
           System.out.println("Not a double string");
        }
        
       
    }
    
}
