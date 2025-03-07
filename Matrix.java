import java.util.Scanner;
class Matrix{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int rows=sc.nextInt();
int cols=sc.nextInt();
int matrix1[][]=new int[rows][cols];
System.out.println("Enter the values of matrix1:");
for(int i=0;i<rows;i++){
for(int j=0;j<cols;j++){
matrix1[i][j]=sc.nextInt();
}
}
int matrix2[][]=new int[rows][cols];
System.out.println("Enter the values of matrix2:");
for(int i=0;i<rows;i++){
for(int j=0;j<cols;j++){
matrix2[i][j]=sc.nextInt();
}
}
int result[][]=new int[rows][cols];
System.out.println("Result:");
for(int i=0;i<rows;i++){
for(int j=0;j<cols;j++){
result[i][j]=matrix1[i][j]+matrix2[i][j];

}
}
for(int i=0;i<rows;i++){
for(int j=0;j<cols;j++){
System.out.println(result[i][j]);
}
}
}
}