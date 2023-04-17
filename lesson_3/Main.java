package lesson_3;

import java.util.ArrayList;

import lesson_3.Class_Object.Telefone;
import lesson_3.get_add.getAdd;

public class Main {
    

    public static void main(String[] args) {
        ArrayList<Telefone> list = new ArrayList<>();
        // Почему не передаётся ArrayList? Как я вижу, list должен перейти в меттод array, взять  оттуда информацию и вывести в консоль, но чтото у меня не выходит.
       System.out.println(getAdd.array(list).toString());
      
    }

    

    
}
