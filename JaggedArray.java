import java.util.Scanner;
class JaggedArray{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the row:");
int row=sc.nextInt();
int array[][]=new int[row][];

//Input
for(int i=0;i<row;i++){
System.out.println("enter the number of columns for row"+(i+1)+":");
int cols=sc.nextInt();
array[i]=new int[cols];
System.out.println("Enter the elements for rows"+(i+1)+":");
for(int j=0;j<cols;j++){
array[i][j]=sc.nextInt();
}
}


//Search
System.out.println("Enter the value to search:");
int x=sc.nextInt();
for(int i=0;i<row;i++){
for(int j=0;j<array[i].length;j++){
if(array[i][j]==x){
System.out.println("The x found at:("+i+","+j+")");
}
}
}

//Output
System.out.println("\nJaggedArray");
for(int i=0;i<row;i++){
for(int j=0;j<array[i].length;j++){
System.out.print(array[i][j]+" ");
}
System.out.println();
}
}
}