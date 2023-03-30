package Lesson_1;
public class dad extends family{

    public dad(String family,String type, String name, Integer age) {
        super(family, type, name, age);
        
    }
    
    public void say(){
        System.out.println("Я могу водить машину");
    }

   /*  public void nameFamily(String fam){

        if (fam == "Крапивин"){
        
        System.out.println("Да работает");
        }else {
            System.out.println("не работает");
        }
    
     }  */ 
    
}