package Lesson_1;
public class play {
    
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
          System.out.println(ivan.getArrayNameDad(ivan.getNameDad()));   //Массив из имени отца.
          System.out.println(egor.getArrayNameDad(egor.getNameDad()));   //Массив из имени отца.

         
          //Пытаюсь передать массив, но встречаюсь с ошибкой и не пойму что с этим делать. (Class dad)
          if(ivan.array(ivan.getArrayName(ivan.getName()), ivan.getArrayName(ivan.getName())) ){
            System.out.println("Отец");
          }else{
            System.out.println("Не отец");
          }

          
          
           
        }



}
