

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class hollow{
    public static void main(String args[]){

        LocalDate date = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM YYYY");

        System.out.println(date.format(formatter));
        
    }
}