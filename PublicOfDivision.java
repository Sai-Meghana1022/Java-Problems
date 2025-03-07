import java.util.Scanner;
class PublicOfDivision{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Numerator:");
int numerator=sc.nextInt();
System.out.println("Denominator:");
int denominator=sc.nextInt();
Division d=new Division();
d.setNumerator(numerator);
d.setDenominator(denominator);
numerator=d.getNumerator();
denominator=d.getDenominator();
d.division_number(numerator,denominator);
}
}