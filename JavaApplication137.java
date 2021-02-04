package javaapplication137;
import java.util.Scanner;
public class JavaApplication137 
{
    public static void main(String[] args) 
    {
        Scanner is=new Scanner(System.in);
        System.out.println("Enter a size");
        int size=is.nextInt();
        String arr[]=new String[size];
        System.out.println("Enter the name of the students:");
        for(int i=0; i<arr.length;i++)
        {
          System.out.println("Enter " + (i+1) + " student name");
          arr[i]=is.next();
        }
        for(int i=0; i<arr.length; i++)
        {
        String temp="";
        for(int j=i+1; j<arr.length; j++)
        {
            if(arr[i].compareTo(arr[j])>0)
            {
               temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
            }
        }
        }
        for(int i=0; i<arr.length; i++)
        {
           System.out.println("The name of the student is = " + arr[i]);
           System.out.println("The rollno of the student is = " + (i+1));
        }
    }
}