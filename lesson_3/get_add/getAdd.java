package lesson_3.get_add;

import java.util.ArrayList;

import lesson_3.Class_Object.Telefone;

public class getAdd {
    
    
    public ArrayList<Telefone> array(ArrayList<Telefone> listTelefon) {
        Telefone nokia = new Telefone("Nokia", "3310", 6.14, 4500, "Android", 12000);
        Telefone samsung = new Telefone("Samsung", "5460", 5.5, 3000, "Android", 22000);
        Telefone apple = new Telefone("Apple", "13Pro", 6.14, 2500, "Ios", 100000);
        Telefone oppo = new Telefone("Oppo", "120+", 5.5, 6000, "Androin", 54000);

        listTelefon.add( nokia );
        listTelefon.add( samsung );
        listTelefon.add( apple );
        listTelefon.add( oppo );
        return listTelefon;

    }
}
