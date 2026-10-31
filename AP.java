import java.util.*;
public class AP{
 public static void main (String []args){
  Scanner sc=new Scanner (System.in);
  System.out.println("Enter First Term");
  int t=sc.nextInt();
  System.out.println("Enter Second Term");
  int t2=sc.nextInt();
  System.out.println("Enter Third Term");
  int t3=sc.nextInt();
  System.out.println("Enter nth Term");
  int n=sc.nextInt();
  int t1=t3-t2;
  int j=0;
  int n1=0;
  for (int i=t;n1<n;i=i+t1){
   j=j+i;
   n1++;
  }
  System.out.println(j);
 }
}