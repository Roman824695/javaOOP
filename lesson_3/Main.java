package lesson_3;

import java.util.ArrayList;

import lesson_3.Class_Object.Telefone;
import lesson_3.get_add.getAdd;

public class Main {
    

    public static void main(String[] args) {
        ArrayList<Telefone> list = new ArrayList<>();
        getAdd.array(list);
       
        
       System.out.println(list.toString());
      
    }

    

    
}
