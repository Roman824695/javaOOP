package lesson_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop implements SellTelefon{
    private ArrayList<Telefone> listTelefon;

    @Override
    public ArrayList<Telefone> creat(ArrayList<Telefone> listTelefon) {
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

    @Override
    public ArrayList<Telefone> sell(ArrayList<Telefone> listTelefon) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Какой телефон купили: ");
        String buyPhone = sc.next();
        sc.close();


        ArrayList<Telefone> tempList = new ArrayList<>();
        for(Telefone telefone: listTelefon){
            if(! buyPhone.equals(telefone.getNameFactory())){
                tempList.add(telefone);
            }
        }

        listTelefon.clear();
        listTelefon.addAll(tempList);
        return listTelefon;
    }

    @Override
    public ArrayList<Telefone>
    addPhone(ArrayList<Telefone> listTelefon){
     Telefon phone = new Telefon();
     Scanner sc = new Scanner(System.in);
     System.out.println("Введите назваание производителя: ");
     String factory = sc.next();
     System.out.println("Введите модель телефона: ");
     String model = sc.next();
     System.out.println("Введите размер экрана: ");
     double size = sc.nextDouble();
     System.out.println("Введите ёмкость батареи: ");
     int quantity = sc.nextInt();
     System.out.println("Введите тип операционной системы: ");
     String os = sc.next();
     System.out.println("Введите стоимость телефона: ");
     double prise = sc.nextDouble();

     sc.close();
     return listTelefon;
    }



    
    
}
