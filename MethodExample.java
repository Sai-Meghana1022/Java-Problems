class Calculator{
//Instance Method
int add(int a,int b){
return a+b;
}
//Static Method
static int multiply(int a,int b){
return a*b;
}
}
public class MethodExample{
public static void main(String args[]){
Calculator calc=new Calculator();
System.out.println("Addition:"+calc.add(5,3)); //Calls instance method

}
}