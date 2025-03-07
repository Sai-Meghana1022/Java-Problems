class StaticKeyWordExample{
static int counter;
// the counter variable is static hence the number the times the counter incremented is what getting in output
int c;


static{
counter ++;
System.out.println("This is a static block");
}


void function_1(){
c++;
System.out.println("This is a normal function");
}


static void function_2(){
System.out.println("This is a static function:"+counter);
counter++;
}


public static void main(String args[]){
System.out.println("---Calling object 1---");
StaticKeyWordExample s= new StaticKeyWordExample();
s.function_1();
function_2();

System.out.println("---Calling object 2---");
StaticKeyWordExample s1=new StaticKeyWordExample();
s1.function_1();
function_2();

System.out.println("c in object 1:"+s.c);
System.out.println("c in object 1:"+s1.c);
System.out.println("counter:"+counter);
}
}