import java.util.*;
public class CircularPrime{
 public static void main (String []args){
  Scanner sc =new Scanner (System.in);
  int a= sc.nextInt();
  int b=a,p=1,c=0,a1=a,f=0,k=0;
  while (b>0){
   p=p*10; 
   c++;
   b=b/10;
  }
  p=p/10;
  int c1=c;
  while (c>0){
   b=a/p;
   f=0;
   for (int i=1;i<=a;i++){
    if (a%i==0){
     f++;
    }
   }
   if (f==2){
    k++;
    }
   a=a%p;
   a=a*10+b;
   c--;
  }
  if (k==c1){
   System.out.println("Circular Prime");
    }
  else{
   System.out.println("Nt Circular Prime");
    }
 }
}