import java.util.*;
public class c{
public static void main (String[]args){
Scanner sc=new Scanner(System.in);
int a = sc.nextInt();
for(int i=1;i<=5;i++){
for(int j=i;j>=1;j--){
System.out.print(" ");
}
for (int x =1;x<=i;x++){
System.out.print("1");
}
System.out.println(" ");
}
}
}