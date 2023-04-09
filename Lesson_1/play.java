package Lesson_1;


import java.util.ArrayList;

public class play {
    
    private static final ArrayList<String> T = null;

    public static void main(String[] age){

       

        dad ivan = new dad("Крапивин", "Иван", "Игорь","Папа", 28, 1994);
        son egor = new son("Крапивин", "Егор", "Иван","Сын", 8 , 2014);
       // try (Scanner scan = new Scanner(System.in)) {
           // System.out.println("Введите год: ");
          //  String year = scan.next();
            //ivan.getYear(year, ivan.getyearOfBirth(), ivan.name);
            //egor.getYear(year, egor.getyearOfBirth(), egor.name);
           
          System.out.println(ivan.getArrayName(ivan.getName()));    //Массив из имени
          System.out.println(egor.getArrayName(egor.getName()));    //Массив из имени
          System.out.println(ivan.getArrayName(ivan.getNameDad()));   //Массив из имени отца.
          System.out.println(egor.getArrayName(egor.getNameDad()));   //Массив из имени отца.
          
        
        



          if(ivan.array(egor.getArrayName(egor.getNameDad()).toArray(new String[0]),ivan.getArrayName(ivan.getName()).toArray(new String[0])) ){
            if(egor.getFamily() != ivan.getFamily()){
              System.out.println("Не отец");
            }else{
              System.out.println("Отец");
            }
          }else
          System.out.println("Не отец");
          }

          
          
           
        }




