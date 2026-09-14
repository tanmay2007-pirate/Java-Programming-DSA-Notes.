
class Rectangle{

    float length;
    float width;
    float perimeter;
    float area;

    public void perimeter(float length , float width){
        perimeter = 2*length*width;
    }

    public void area(float length , float width){
        area = length * width;
    }

    public void display(){
        System.out.println("Perimeter is :- " + perimeter);
        System.out.println("Area is :- "+ area);
    }

}


class Employee{

    String name;
    int id;
    int salary;
    int annualsalary;

    public void annualsalary(int salary){
        annualsalary = 12*salary;
    }

    public void display(){
        System.out.println("Name :-"+name );
        System.out.println("id:-" + id);
        System.out.println("Salary :- "+salary);
        System.out.println("annualsalary:-"+annualsalary);

    }
}


class Book{

    String title;
    String author;
    int price;

    Book(String t , String a,int p){
        title = t;
        author = a;
        price = p;
    }

    public void display(){
        System.out.println("Title:-" + title);
        System.out.println("Author:-"+author);
        System.out.println("Price :- "+price);
    }
}
public class assignment3 {
    public static void main(String args[]){

        Rectangle r1 = new Rectangle();

        r1.perimeter(2,3);
        r1.area(3,2);
        r1.display();

        Employee e1 = new Employee();

        e1.name = "raghav";
        e1.id = 3456;
        e1.salary = 100000;

        e1.annualsalary(e1.salary);
        e1.display();


        Book b1 = new Book("Ramayan" , "valmiki" ,3000);
        b1.display();

    }
    
}
