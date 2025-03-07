import java.util.Scanner;
class Person{
private String name;//Private variable


//Setter
void setName(String newName){
name=newName;
}


//Getter
String getName(){
return name;
}
}


public class Encapsulation{
public static void main(String args[]){
Person p=new Person();
p.setName("Alice");//Setting value using setter
System.out.println(p.getName());//Getting value using getter
}
}