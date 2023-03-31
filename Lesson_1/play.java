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


        //if (Integer.parseInt(year) > ivan.getyearOfBirth()){
         //   System.out.println("В " + year + "году \n"+ ivan.name +"будет "+(Integer.parseInt(year) - ivan.getyearOfBirth()) + " лет" );
       // }
        //System.out.println(egor.getyearOfBirth());
        //egor.setyearOfBirth(egor.getyearOfBirth()+ 3);
        //System.out.println(egor.getyearOfBirth());

        //ivan.say();
        //ivan.display();
        //System.out.println("\n"+ivan.getFamily()+"\n");
        //egor.say();
        //egor.display();
        //System.out.println("\n"+ egor.getFamily()+"\n");
         //ivan.nameFamily(ivan.family);
        //egor.nameFamily(egor.family);
       
    }

}
