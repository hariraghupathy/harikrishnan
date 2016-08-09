package encrypt.java;

import java.io.*;
import java.util.*;
public class EncryptJava {

    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str;
        int i,size;
        str=s.next();
        int count=0;
        char[] a=new char[100];
        char[] b=new char[100];
        size=str.length();
        for(i=0;i<size;i++)
        {
            a[i]=str.charAt(i);
        } 
        for(i=0;i<size;i++)
        {
            if(a[i]=='j')
            {
                b[i]='i';
            }
            else if((a[i]=='a')&&(count==0))
            {
                b[i]='z';
                count=1;
            }
            else if(a[i]=='v')
            {
                b[i]='u';
            }
            else if((a[i]=='a')&&(count==1))
            {
              
                b[i]='a';
            }
        }
        for(i=0;i<size;i++)
        {
            System.out.println(b[i]);
        }
     
      
        
    }
    
}
