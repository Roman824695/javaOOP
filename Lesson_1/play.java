package Lesson_1;



import java.util.Scanner;

public class play {
    
    public static void main(String[] age){

       

        dad ivan = new dad("Крапивин", "Папа", "Иван", 28, 1994);
        son egor = new son("Крапивин", "Сын", "Егор", 8 , 2014);
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Введите год: ");
            String year = scan.next();
            ivan.getYear(year, ivan.getyearOfBirth(), ivan.name);
            egor.getYear(year, egor.getyearOfBirth(), egor.name);
            
           
        }


       
    }

}
