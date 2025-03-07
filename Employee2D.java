import java.util.Scanner;
class Employee2D{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number of rows and colums:");
String NumberOfEmployees[][]=new String[3][3];
System.out.println("Enter the name of company and number of employees:");
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
NumberOfEmployees[i][j]=sc.next();
}
}

for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
System.out.println(NumberOfEmployees[i][j]);
}
}
}
}