package lesson_2;
import java.util.Objects;

public class Telefone {
    private String nameFactory;
    private String model;
    private double sizeDisplay;
    private int quantityAkb;
    private String TypeOS;
    private double price;


    public Telefone(){

    }
    public Telefone(String nameFactory, String model, double sizeDisplay, int quantityAkb, String typeOS, double price){
        this.nameFactory = nameFactory;
        this.model = model;
        this.sizeDisplay = sizeDisplay;
        this.quantityAkb = quantityAkb;
        this.TypeOS = typeOS;
        this.price = price;
    }
    public String getNameFactory() {
        return nameFactory;
    }
    public String getModel() {
        return model;
    }
    public double getSizeDisplay() {
        return sizeDisplay;
    }
    public int getQuantityAkb() {
        return quantityAkb;
    }
    public String getTypeOS() {
        return TypeOS;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Telefone telefone = (Telefone) o;
        return Double.compare(telefone.sizeDisplay, sizeDisplay) == 0 && quantityAkb == telefone.quantityAkb && Double.compare(telefone.price, price) == 0 && Objects.equals(nameFactory, telefone.nameFactory) && Objects.equals(model, telefone.model) && Objects.equals(TypeOS, telefone.TypeOS);

    }
    @Override 
    public int hashCode(){
        return Objects.hash(nameFactory, model, sizeDisplay, quantityAkb, TypeOS, price);
    }
    
    @Override
    public String toString() {
        return 
        "Марка телефона: " + nameFactory  +
        ", Модель: " + model +  
        ", Размер экрана: " + sizeDisplay + 
        ", Ёмкость АКБ: " + quantityAkb + 
        ", Операционная система: " + TypeOS + 
        ", Цена: " + price ;

    }
}
