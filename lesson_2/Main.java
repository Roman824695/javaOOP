package lesson_2;
import java.util.ArrayList;

public class Main {
    public  static void main(String[] args) {

        Shop shop = new Shop();
        ArrayList<Telefone> listTelefone = new ArrayList<>();
        
        
        shop.creat(listTelefone);

        for(Telefone temp: listTelefone){
            System.out.println(temp.toString());
         }

        shop.sell(listTelefone);
        System.out.println("Остались: ");
          for( Telefone temp: listTelefone){
            System.out.println(temp.toString());
            
        }

        
    }
    
} 
