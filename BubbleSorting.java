import java.util.*;
public class BubbleSorting{
 public static void main (String []args){
  Scanner sc=new Scanner (System.in);
  System.out.println("Eneter length of array "); 
  int a=sc.nextInt();
  int []ar=new int[a];
  for (int i=0;i<ar.length;i++){
   ar[i]=sc.nextInt();
  }
  for (int i=0;i<a;i++){
   for (int j=0;j<a-1;j++){
    if (ar[j]<ar[j+1]){
     int b=ar[j];
     ar[j]=ar[j+1];
     ar[j+1]=b;
    }
   } 
  } 
  for (int i=0;i<ar.length;i++){
   System.out.println(ar[i]);
  } 
 }
}