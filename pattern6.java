import java.util.Scanner;
class pattern6{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
for(int i=0;i<5;i++){
for(int j=1;j<i;j++){
System.out.print(" ");
}
for(int k=1;k<5-(i*2);k++){
System.out.print("* ");
}
System.out.println(" ");
}
}

}
