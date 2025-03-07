import java.util.Scanner;
class star{
public static void main(String[] args){
for(int row=0;row<3;row++){
for(int col=5;col>row;col--){
System.out.print("*");
}
for(int space=0;space<3-row-1;space++){
System.out.print(" ");
}
System.out.println(" ");
}
}
}