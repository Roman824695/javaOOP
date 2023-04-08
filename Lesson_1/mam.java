package Lesson_1;

public class mam<T>  {
    T weight;
    T height;

    public mam(T weight,T height){
        this.weight = weight;
        this.height = height;

    }
    public mam() {
    }
    static void test(mam<? super dad> weight){
        System.out.println("НИхуя не прнимаю");

    }
   




/* 
    public mam(String family, String type, String name, Integer age, Integer yearOfBirth) {
        super(family, type, name, age, yearOfBirth);
        
    }

    @Override
    public void due() {
        System.out.println("Долгожитель.");
        
    }
    */
}
