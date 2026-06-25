


class Planets{

    String name;

    int age;

    void printInfo(){
        

        System.out.println(name + " " + age);
    }

    Planets(){
        System.out.println("whattsapp my nigga.");
    }

    Planets(String name){
        this.name = name;
    }

    Planets(int kuch){
        this.age = kuch;
    }
}




public class hollow{
    public static void main(String args[]){

        Planets p1 = new Planets();

        Planets p2 = new Planets("pluto");

        Planets p3 = new Planets(20);

        p2.age = 45;


        p2.printInfo();


        System.out.println(p3.age);

    }
}



