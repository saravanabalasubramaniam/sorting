import java.io.*;

import java.util.*;

class Sorting

  {
  
public static void main(String args[])

    {

    int a;
    Scanner input=new Scanner(System.in);

    System.out.println("enter the size of an array");

    a=input.nextInt();

    int[] num=new int[a];

    for(int i=0;i<a;i++)
  
       {

            num[i]=input.nextInt();
 
            System.out.println("");
       }
        System.out.println();
     
        for (int r= 0; r < a; ++r) 
        {
 
           for (int j = r+1; j < a; ++j)
            {
 
                if (num[r] > num[j]) 
                {
 
                int  b =  num[r];
                    num[r] = num[j];
                    num[j] = b;
 
                }
 
            }
 
         }
           System.out.println("The numbers arranged in ascending order are given below \n");
           for (int s = 0; s < a; ++s)
              {
                  System.out.println(num[s]);
              }
    }
}
