








// created two classes.


// public class classes_objects {

//     public static void main(String args[]){

//         Pen p1 = new Pen();         // created a pen object p1.

//         p1.setColor("Blue");

//         System.out.println(p1.color);


//         p1.setTip(50);

//         System.out.println(p1.tip);



//     }
    
// }

// class Pen{

//     String color;
//     int tip;


//     void setColor(String newColor){
//         color = newColor;
//     }

//     void setTip(int newTip ){
//         tip = newTip;
//     }
// }

// class Student{

//     String name;

//     int age ;

//     float percentage; // cgpa

//     void calculatePercentage(int phy , int chem , int math){
//         percentage = (float)(phy + chem + math)/3;
//     }
// }












// Constructors        

// when we dont define constructor java automatically constructs it.


// public class classes_objects{
//     public static void main(String args[]){


//         Student s1 = new Student("Tanmay");
//         Student s2 = new Student();
//         Student s3 = new Student (123);

//         System.out.println(s1.name);
        
//         System.out.println(s3.roll);

//     }
// }


// class Student{
//     String name;

//     int roll;

//     Student(String name){
//         // System.out.println();

//         this.name = name;
//     }

//     Student(){                                  // non paremeterized
//         System.out.print("constructor is called  ");
//     }

//     Student ( int roll){
//                                         // Parameterized
//         this.roll = roll;

//     }
// }








// copy constructor



// public class classes_objects{
//     public static void main(String args[]){

//         Student s1 = new Student();
//         s1.name = "shradha";

//         s1.roll = 456;

//         s1.password = "abcd";
//         s1.marks[0]= 100;
//         s1.marks[1] = 90;
//         s1.marks[2] = 80;

//         Student s2 = new Student(s1);

//         s2.password = "xyz";
//         s1.marks[0] = 120;
//         for(int i = 0 ; i < 3 ; i++){
//             System.out.println(s2.marks[i]);
//         }

//         s2.marks[0] = 120;


//     }
// }


// class Student {
//     String name;

//     String password;

//     int roll;

//     int marks[];


    

//     // Copy Constructor
//     //(Shallow copy Constructor.)

//     Student(Student s1){
//         marks = new int [3];
//         this.name = s1.name;
//         this.roll = s1.roll;
//         this.marks = s1.marks;
//     }



//     // Deep copy Constructor.
//     // Student(Student s1){
//     //     marks = new int [3];
//     //     this.name = s1.name;
//     //     this.roll = s1.roll;

//     //     for(int i = 0 ; i < marks.length ; i++){
//     //         this.marks[i] = s1.marks[i];
//     //     }
//     // }


//     Student(){
//         marks = new int [3];
//         System.out.println("constructor is called");

//     }

//     Student(String newname){
//         this.name = newname;
//         marks = new int[3];
//     }

//     Student(int roll){
//         this.roll = roll;
//         marks = new int [3];
//     }

// }













// Getters and Setters


// public class classes_objects{
//     public static void main(String args[]){

//         Pen p1 = new Pen();

//         p1.setColor("blue");
//         p1.setTip(50);

//         System.out.println(p1.getColor());

//         System.out.println(p1.getTip());

//         p1.setColor("red");
//         p1.setTip(100);

//         System.out.println(p1.getColor());
//         System.out.println(p1.getTip());


//     }
// }

// class Pen{

//     private String color;
//     private int tip;

//     int getTip(){
//         return this.tip;
//     }

//     String getColor(){
//         return this.color;
//     }

//     void setColor(String newcolor){
//         this.color = newcolor;
//     }

//     void setTip(int newtip){
//         this.tip = newtip;
//     }
// }















// Access modifiers / specifiers.


// public class classes_objects{
//     public static void main(String args[]){

//         BankAccount my_acc = new BankAccount();

//         my_acc.username = "Tanmay Patharkar";

//         //my_acc.password = "asd";            // not possible

//         my_acc.setPass("asd");              // this works.




//     }
// }

// class BankAccount{

//     public String username;
    
    
//     private String password;

//     public void setPass(String pwd){
//         password = pwd;
//     }
// }
















// Encapsulation .

// Define :- Encapsulation is defined as wrapping up of data & methods under a single unit . it also implements data hiding. 













// Inheritance

// Define :- Inheritance is when properties & mathods of base class are passed down to a derived class.







// Syntax To Write.

//(SINGLE LEVEL Inheritance.)

// public class classes_objects{
//     public static void main(String args[]){


//         Fish f1 = new Fish();

//         f1.eat();


//     }
// }

// class Animal{

//     String color;

//     void eat(){
//         System.out.println("eat");
//     }

//     void breath(){
//         System.out.println("breath");
//     }
// }

// class Fish extends Animal{

//     int fins;


// }




















// (MULTI Level Inheritance.)

// public class classes_objects{

//     public static void main(String args[]){

//         Dog d1 = new Dog();

//         d1.legs = 56;
//         d1.color = "red";

//         System.out.println(d1.legs +" "+d1.color);

//     }
// }

// class Animal{

//     String color;

//     void eat(){
//         System.out.println("eat");
//     }

//     void breath(){
//         System.out.println("breath");
//     }
// }

// class Mammel extends Animal{
//     int legs ;

// }

// class Dog extends Mammel{
//     String breed;
// }

















// HIERARCHIAL Inheritance



// public class classes_objects{
//     public static void main(String args[]){

//         Fish f1 = new Fish();

//         Mammel m1 = new Mammel();

//         m1.eat();
//         f1.breath();

//     }
// }

// class Animal{

//     String color;

//     void eat(){
//         System.out.println("eat");
//     }

//     void breath(){
//         System.out.println("breath");
//     }
// }

// class Mammel extends Animal {

//     void walk(){
//         System.out.println("Walks");

//     }
// }

// class Fish extends Animal{
//     void swim(){
//         System.out.println("Swim");
//     }
// }















// Hybrid Inheritance.


// public class classes_objects{
//     public static void main(String args[]){

//         Fish f1 = new Fish();

//         Mammel m1 = new Mammel();

//         bear b1 = new bear();



//         m1.eat();
//         f1.breath();

//         b1.eat();

//     }
// }

// class Animal{

//     String color;

//     void eat(){
//         System.out.println("eat");
//     }

//     void breath(){
//         System.out.println("breath");
//     }
// }

// class Mammel extends Animal {

//     void walk(){
//         System.out.println("Walks");

//     }
// }

// class Fish extends Animal{
//     void swim(){
//         System.out.println("Swim");
//     }
// }

// class bear extends Mammel{

//     void weapon(){
//         System.out.println("Nails");
//     }

// }


















// POLYMORPHISM.

// Method Overloading.


// public class classes_objects{
//     public static void main(String args[]){

//         Calculator c1 = new Calculator();

//         System.out.println(c1.sum(2,3));
//         System.out.println(c1.sum(2,3,4));
//         System.out.println(c1.sum(0.34f , 0.66f));

//     }
// }

// class Calculator{

//     int sum(int a, int b){
//         return a+b;
//     }

//     int sum(int a ,int b ,int c){
//         return a+b+c;
//     }

//     float sum (float a , float b){
//         return a+b;
//     }
// }












// Method Overriding.


// public class classes_objects{
//     public static void main(String args[]){

//         Deer d1 = new Deer();

//         d1.eat();


//     }
// }

// class Animal {
//     void eat(){
//         System.out.println("eats anything");

//     }
// }

// class Deer extends Animal{
//     void eat(){
//         System.out.println("eats Only Grass");
//     }
// }









//Abstraction 

// define : -  Hiding all the Unnecessary detail and showing only the important part of the user


// public class classes_objects{
//     public static void main(String args[]){

//         Horse h = new Horse();

//         h.eat();
//         h.walk();

//         Chicken c = new Chicken();

//         c.eat();
//         c.walk();

//         System.out.println(h.color);
        
//     }
// }

// abstract class Animal{

//     String color;

//     Animal(){
//         color = "brown";                    // we can define constructors
//     }                 
//                                           // even in abstract classes.
//     void eat(){

//         System.out.println("eat");
//     }

//     abstract void walk();

// }

// class Horse extends Animal{

//     void changeColor(){
//         color = "black";
//     }
//     void walk(){
//         System.out.println("Walks on 4 legs");
//     }
// }

// class Chicken extends Animal{

//     void changeColor(){
//         color = "yellow";
//     }

//     void walk(){
//         System.out.println("Walks on two legs");
//     }
// }

















// INTERFACES



// public class classes_objects{
//     public static void main(String args[]){

//         Queen q1 = new Queen();

//         q1.moves();

//     } 
// }

// interface Chessplayer{

//     void moves();
// }

// class Queen implements Chessplayer{

//     public void moves(){
//         System.out.println("all possible directions.");
//     }
// }

// class Rook implements Chessplayer{

//     public void moves(){
//         System.out.println("in plus shape");
//     }
// }

// class king implements Chessplayer{

//     public void moves(){
//         System.out.println("one step all directions");
//     }
// }











// Multiple inheritance by Interfaces.


// public class classes_objects{
//     public static void main(String args[]){

//         Bear b1 = new Bear();

//         b1.Survival();

//     } 
// }

// interface Herbivore{

//     void Survival();
        
    
// }

// interface Carnivore{

//     void Survival();

// }

// class Bear implements Herbivore , Carnivore{

//     public void Survival(){
//         System.out.println("Eats Both");
//     }
// }


















//  SUPER KEYWORD.


// public class classes_objects{
//     public static void main(String args[]){


//         Horse h = new Horse();

//         System.out.println(h.color);

//     }
// }
// class Animal{

//     String color;
//     Animal(){
//         System.out.println("animal constructor is called");

//     }
// }

// class Horse extends Animal{

//     Horse(){
//         super();
//         super.color = "black";
//         System.out.println("horse constructor is called");
//     }
// }














// Static Keyword.


// public class classes_objects{
//     public static void main(String args[]){

//         Student s1 = new Student();

//         s1.schoolName = "JMV";

//         Student s2 = new Student();

//         System.out.println(s2.schoolName);  


//     }
// }

// class Student {
//     String name;
//     int roll;

//     static String schoolName;

//     void setName(String name){
//         this.name = name;
//     }
//     String getName(){
//         return this.name;
//     }

// }














// Packages in Java



// import java.util.*;
// public class classes_objects{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         System.out.println(a);
//     }
// }













// Practice Problems.

// SEE video 

// there are only multiple choice questions make your command on them.













//Q1)

// Print the sum, difference and product of two complex numbers by creating a
// class named 'Complex' with separate methods for each operation whose real and imaginary
// parts are entered by the user.


// import java.util.*;
// public class classes_objects{
//     public static void main(String args[]){

//         Scanner sc = new Scanner (System.in);

//         Complex c1 = new Complex();
//         Complex c2 = new Complex();

//         c1.real = sc.nextInt();
//         c1.img = sc.nextInt();
//         c2.real = sc.nextInt();
//         c2.img = sc.nextInt();

//         c1.sum(c2);
//         c1.difference(c2);
//         c1.product(c2);

//     }
// }
// class Complex{
//     int real;
//     int img;

//     void sum(Complex c){

//         int real1 = this.real + c.real;
//         int img1 = this.img + c.img;
//         System.out.println("SUM IS: " + real1 +"+" + img1 +"i");

//     }
//     void difference(Complex c){

//         int real1 = this.real - c.real;
//         int img1 = this.img - c.img;
//         System.out.println("DIFFERENCE IS: " + real1  +"+"+ img1 +"i");
        
//     }

//     void product(Complex c){
//         int real1 = ((this.real*c.real) - (this.img*c.img));
//         int img1 = ((this.real * c.img ) - (this.real * c.real));
//         System.out.println("PRODUCT IS: " + real1  +"+"+ img1 +"i");
//     }
// }














// Q2). What is the output of the following program.

// B. Driving electric car
// The drive() method in the Car class does not override the version in the Automobile class
// since the method is not visible to the Car class.
// The drive() method in the ElectricCar class is a valid override of the method in the Car class,
// with the access modifier expanding in the subclass. For these reasons, the code compiles,
// and Option D is incorrect.
// In the main() method, the object created is an ElectricCar, even if it is assigned to a Car
// reference. Due to polymorphism, the method from the ElectricCar will be invoked, making
// Option B the correct answer










//Q3). 

// B. public and protected both can be used.
// You can provide only a less restrictive or same-access modifier when overriding a method.








//Q4 ).

// Rule to remember

// For object creation, the order is:

// Superclass static blocks (once)
// Subclass static blocks (once)
// Superclass instance initializer blocks
// Superclass constructor body
// Subclass instance initializer blocks
// Subclass constructor body