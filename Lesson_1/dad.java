package Lesson_1;



public class dad extends family{

        public dad(String family, String type, String name, Integer age, Integer yearOfBirth) {
        super(family, type, name, age, yearOfBirth);
        
    }

        
        
        public void say(){
            System.out.println("Я могу водить машину");
        }

        @Override
        public void due() {
            
                System.out.println("Долгожитель.");
            
        }}
