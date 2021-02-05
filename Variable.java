public class Variable {
 //Write a program that will declare local, instance, and static variable and print them

public int a=50;//instance variable  
static int m=100;//static variable 
public void printVar1() {
    System.out.println("Instance Variable: " + a );}
public static void main(String[] args){	 
   
    int i =90;//local variable  
    //float a = i;
    System.out.println("Local Variable " + i);
    System.out.println("Static " + m);
    Variable var1 = new Variable ();
    var1.printVar1();

}}
