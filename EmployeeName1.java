import java.util.Scanner;

class EmployeeName1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of employees:");
int n=sc.nextInt();
String name[]=new String[n];
System.out.println("Enter the names of the Employees:");
for(int i=0;i<n;i++){
name[i]=sc.next();
}


// To print the names of all the employees

/*
System.out.println("The Employees are:");
for(int i=0;i<n;i++){
System.out.println(name[i]);
}
*/

//To find the name of Employee

System.out.println("Enter the name of employee to search:");
String x=sc.next();
for(int i=0;i<n;i++){
if(name[i].equalsIgnoreCase(x)){
System.out.println("The employee is in the index:"+i);
}
}
}
}