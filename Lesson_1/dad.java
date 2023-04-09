package Lesson_1;

import java.util.ArrayList;

public class dad extends family{

        public dad(String family,String name, String nameDad, String type,  Integer age, Integer yearOfBirth) {
        super(family, name, nameDad, type, age,yearOfBirth);
        
        
    }

        
        
       

        @Override
        public void due() {
            
                System.out.println("Долгожитель.");
            
        }


        @Override
        public ArrayList<String> getArrayName(String name) {
            ArrayList<String> nam = new ArrayList<>();
            for (int i = 0; i < name.length(); i++) {
                
                String str = String.valueOf(name.charAt(i));
                nam.add(str);
            
        }
            return nam;

       
           
    }



     

        // Ошибок нет, но не пойму почему не хочет принять массив.
        static <T extends Comparable<T>, V extends T> boolean array(T[] x, V[] y){
            if (x.length != y.length){                
            return false;   
        }
        for (int i = 0; i < x.length; i++) {
            if(!x[i].equals(y[i]) ){
                return false; 
            }
        }
        
            return true;

    }





       

     
}


      