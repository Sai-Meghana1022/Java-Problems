import java.util.Scanner;
class pattern11{
/*
_*****
__*****
___*****
*/
public static void main(String[] args){
for(int i=1;i<4;i++){
for(int j=1;j<i;j++){
System.out.print("_");
for(int k=1;k<=5;k++){
System.out.print("* ");
}
}
System.out.println(" ");
}
}
}