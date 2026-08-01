
interface Animal{
    void walk();
   

}

interface herbivore{


}

class Horse implements Animal , herbivore{

    public void walk(){
        System.out.println("walks on 4 legs");
    }
}

public class hollow {
    public static void main (String args[]){

        
        Horse horse = new Horse();


        horse.walk();

      
        
    }
}