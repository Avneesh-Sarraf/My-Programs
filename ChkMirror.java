import java.util.*;
public class ChkMirror{
 public static void main(String args[]){
  Scanner sc=new Scanner (System.in);
  int a=sc.nextInt();
  int b=a,b1=0,c=0,p=0,a1=0;
  while  (b>0){
   b1=b%10;
   b/=10;
   c++;
  }
  if (c%2==0){
   p=(int)Math.pow(10,c/2);
   b1=a%p;
   while (b1>0){
    a1=a1*10+b1%10;
    b1/=10;
   }
   a/=p;
   if (a==a1){
    System.out.println("Miiror Nombuer"); 
   }
   else{
    System.out.println("Noi mirroe Number"); 
   }
  }
  else{
   System.out.println("Not Mirrpr Nu,ber");  
  }
 }
}