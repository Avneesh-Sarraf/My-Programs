import java.util.*;
public class CaseChange{
 public static void main(String args[]){
  Scanner sc=new Scanner (System.in);
  String a=sc.nextLine();
  String a2="";
  int a1=a.length();
  for (int i=0;i<a1;i++){
   char ch=a.charAt(i);
   if (Character.isUpperCase(ch)){
    a2=a2+Character.toLowerCase(ch);
   }
   else if (Character.isLowerCase(ch)){
    a2=a2+Character.toUpperCase(ch);
   } 
   else{
    a2=a2+ch; 
   }
  }
  System.out.println(a2);
 }
}