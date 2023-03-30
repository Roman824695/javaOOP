package Lesson_1;

public class son extends dad {

    public son(String family,String type, String name, Integer age) {
        super(family, type, name, age);
        
    }
    @Override
    public void say(){
        System.out.println("Я хочу водить машину");
    }
    
}
