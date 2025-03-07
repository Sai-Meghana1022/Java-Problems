import java.util.Scanner;
class pattern5{
/*public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n:");
int n=sc.nextInt();
for(int row=0; row<n;row++){
for(int space=0;space<n-row-1;space++){
System.out.println("_");
}
for(int col=n;col<(2*row)+1;col++){
System.out.print("* ");
}
}
}*/




public static void main(String[] args){
Scanner sc=new Scanner(System.in);
for(int i=0;i<3;i++){
for(int j=0;j<=3-i-1;j++){
System.out.print("-");
}
for(int k=0;k<(2*i)+1;k++){
System.out.print("* ");
}

System.out.println(" ");
}
}

}
