import java.util.Scanner;
class Numbers2D{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int rows=sc.nextInt();
int cols=sc.nextInt();
int numbers[][]=new int[rows][cols];


//INPUT

System.out.println("Enter the numbers:");
for(int i=0;i<rows;i++){
for(int j=0;j<cols;j++){
numbers[i][j]=sc.nextInt();
}
}

/*

//OUTPUT

System.out.println("The Numbers are:");
for(int i=0;i<rows;i++){
for(int j=0;j<cols;j++){
System.out.print(numbers[i][j]+" ");
}
System.out.println();
}

*/

//To find the number 

System.out.println("Enter the number to search:");
int x=sc.nextInt();
for(int i=0;i<rows;i++){
for(int j=0;j<cols;j++){
if(numbers[i][j]==x){
System.out.println("The number "+x+" is found at index:("+i+","+j+")");
}
}
}
}
}