import java.util.*;
public class b{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a no. ");
int n= sc.nextInt();
int a =1;
for (int i=1;i<=n;i++){
if (i%2!=0){
for (int j =1;j<=i;j++){
System.out.print(a);
a=a+1;

}
}
else{
   int b=i+a-1;
for (int x =b;x>=a;x--){
System.out.print(x);
}
a=a+i;
}
System.out.println("");
}
}
}