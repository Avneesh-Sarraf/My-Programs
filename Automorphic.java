import java.util.*;
public class Automorphic{
 public static void main(String []args){
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int b=a;
  int c=0;
  int e=0;
  int e1=0;
  while (b>0){
   c++;
   b=b/10;
  }
  int a1=a*a;
  b=a;
  while (c>0){
   int d=a1%10;
   e=e*10+d;
   a1=a1/10;
   c--;
  }
  while (e>0){
   int d1=e%10;
   e1=e1*10+d1;
   e=e/10;
  }
  if (e1==a){
   System.out.println("Automorphic");  
  }
  else{
    System.out.println("Not Automorphic");
    }
 }
}