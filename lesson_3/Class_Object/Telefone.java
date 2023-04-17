package lesson_3.Class_Object;


    public class Telefone {
        private  String nameFactory;
        private  String model;
        private  double sizeDisplay;
        private  int quantityAkb;
        protected  String TypeOS;
        private  double price;
    
    
       
        public Telefone(String nameFactory, String model, double sizeDisplay, int quantityAkb, String TypeOS, double price){
            this.nameFactory = nameFactory;
            this.model = model;
            this.sizeDisplay = sizeDisplay;
            this.quantityAkb = quantityAkb;
            this.TypeOS = TypeOS;
            this.price = price;
        }
        public  String getNameFactory() {
            return nameFactory;
        }
        public  String getModel() {
            return model;
        }
        public  double getSizeDisplay() {
            return sizeDisplay;
        }
        public  int getQuantityAkb() {
            return quantityAkb;
        }
        public  String getTypeOS() {
            return TypeOS;
        }
        public  double getPrice() {
            return price;
        }
        /**
         * пытаюсь вывести toString в отдельный класс но не понимаю как туда отдать значение. 
         * Если тут все подтягивается, как мне вывести этот метод в отдельный класс?
         */

 
        public String toString() {
            return 
             "\n" + "Марка телефона: " + nameFactory  +
            ", Модель: " + model +  
            ", Размер экрана: " + sizeDisplay + 
            ", Ёмкость АКБ: " + quantityAkb + 
            ", Операционная система: " + TypeOS + 
            ", Цена: " + price + "\n";
    
        }

       
       
    }
    
    

