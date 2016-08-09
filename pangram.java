package pangramchecker.java;

import java.io.*;
import java.lang.*;
public class PangramcheckerJava {

  
    public static void main(String[] args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the sentence");
        String sentence=br.readLine();
        String[] pangram=new String[100];
        char[] a=new char[100];
        int[] b=new int[100];
        int len=1;
        int i,j;
        int flag=0;
        int size=sentence.length();
        for(i=0;i<size;i++)
        a[i]=sentence.charAt(i);//a array store the original sentence
        b[0]=0;
        for(i=0;i<size;i++)//b array store where space occurs in the sentence
        {
            if(a[i]==' '||a[i]=='.')
            {
                b[len]=i;
                len++;
            }
        }
        for(i=0;i<len;i++)
            System.out.println(b[i]);

       int z=0;
       for(i=0;i<len-1;i++)//storing individual words in array of string
       {
           pangram[i]=sentence.substring(b[z],b[z+1]);
           z++;
       }
      for(i=0;i<len-2;i++)
       {
           for(j=i+1;j<len-2;j++)
           {
               if(pangram[i].equals(pangram[j]))
               {     
                   flag=1;
                   break;
               }
               else 
               flag=0;
           }
           if(flag==1)
               break;
       }
      if(flag==1)
          System.out.println("The sentence is not a pangram");
      else if(flag==0)
          System.out.println("The sentence is a pangram");
       
       
       
      

        
        
    
    }
      
}
