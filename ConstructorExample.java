import java.util.Scanner;

class ConstructorExample{


//Non-Parameterised Constructor
ConstructorExample()
{
System.out.println("Non-Parameterised Constructor");

}


//Parameterised constructor -1 parameter
ConstructorExample(int a){
System.out.println("Parameterised Constructor:"+a);
}

//Parameterised constructor -2 parameters
ConstructorExample(int a,String s){
System.out.println("Parameterised Constructor,a:"+a+" s=" +s);
}


public static void main(String args[]){
Scanner scan= new Scanner(System.in);
int num=scan.nextInt();
ConstructorExample ce1=new ConstructorExample(num);
ConstructorExample ce=new ConstructorExample();

ConstructorExample ce2=new ConstructorExample(num,args[0]);

}
}