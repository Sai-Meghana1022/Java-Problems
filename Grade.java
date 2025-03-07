import java.util.Scanner;

class Grade{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of students:");
int n=sc.nextInt();
int grades[]=new int[n];
System.out.println("Enter the grades of students:");
for(int i=0;i<n;i++){
grades[i]=sc.nextInt();
}
for(int i=0;i<n;i++){
if(grades[i]>=50){
System.out.println("Student "+i+" is passed");
}
else{
System.out.println("Student "+i+" is Failed");
}
}
}
}