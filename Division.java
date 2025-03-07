import java.util.Scanner;

class Division{
private int numerator;
private int denominator;

//creating the methods for setting and getting the numerator
int getNumerator(){
return numerator;
}

void setNumerator(int numerator){
if(numerator!=0)
this.numerator=numerator;
else
this.numerator=1;
}

//creating the methods for setting and getting the denominator
int getDenominator(){
return denominator;
}
void setDenominator(int denominator){
if(denominator!=0)
this.denominator=denominator;
else
this.denominator=10;

}
Division(){
int numerator=1;
int denominator=1;
}

void division_number(int a , int b){
double res=a/b;
System.out.println("Result:"+res);
}

}
