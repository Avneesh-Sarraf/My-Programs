import java.util.*;
public class Amicable{
 public static void main (String args[]){
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int a1=sc.nextInt();
  int s=0,s1=0;
  for (int i=1;i>=a;i++){
   if (a%i==0)
    s+=i;
  }
  for (int i=1;i>=a1;i++){
   if (a1%i==0)
    s1+=0;
  }
  if(s==a1 && s1==a)
   System.out.println("Amicable");
  else
   System.out.println("Not Amicable");
 }
}