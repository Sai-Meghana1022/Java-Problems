import java.util.Scanner;

class MethodOverLoadingExample{

//Method 1

void add(int a, int b){
int res=a+b;
System.out.println("res1="+res);
}

//Method 2

void add(int a, int b , int c){
int res=a+b+c;
System.out.println("res2="+res);
}

//Method 3

void add(double a, int b){
double res=a+b;
System.out.println("res3="+res);
}

public static void main(String args[]){
MethodOverLoadingExample m1=new MethodOverLoadingExample();
m1.add(10,20);
m1.add(10,20,30);
m1.add(40.7,50);
}
}