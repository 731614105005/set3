# set3
import java.io.*;
import java.util.*;
public class Vowels
{
  public static void main(String args[])throws IOException
  {
    Scanner sc=new Scanner(System.in);
    char c= sc.nextLine().charAt(0);
    if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
    {
      System.out.println("c is Vowels");
      }
      else
      {
        System.out.println("c is consonant");
        }
        }
        }
