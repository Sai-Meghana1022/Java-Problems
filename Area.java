import java.util.Scanner;
//square, rectange,triangle, circle

class Area{
//square

//void area(int a){
//int res=a*a;
//System.out.println("the area of Square is:"+res);
//}


//Return type example
int area(int a){
int res=a*a;
System.out.println("the area of Square is:"+res);
return res;
}


//rectangle

void area(int l,int b){
int res=l*b;
System.out.println("The area of Rectangle is:"+res);
}

//triangle

void area(int b,double h){
double res=0.5*b*h;
System.out.println("The area of Triangle is:"+res);
}

//circle

void area(double r){
double res=3.14*r*r;
System.out.println("The area of circle is:"+res);
}


public static void main(String args[]){
Area ab=new Area();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the side of square:");
int a=sc.nextInt();
int s=ab.area(a);

System.out.println("Enter the length and breath:");
int l=sc.nextInt();
int b=sc.nextInt();
ab.area(l,b);


System.out.println("Enter the base and height:");
int ba=sc.nextInt();
double h=sc.nextDouble();
ab.area(ba,h);


System.out.println("Enter the radius:");
double r=sc.nextDouble();
ab.area(r);
}
}