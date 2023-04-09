package Lesson_1;

public abstract class family implements interf  {
    
        private String family;
        String name;
        String nameDad;
        String type;
        private Integer age;
        private Integer yearOfBirth;


        public  family(String family,String name,String nameDad,String type,Integer age,Integer yearOfBirth){
            this.family = family;
             this.type = type;
             this.name = name;
             this.nameDad = nameDad;
            this.age = age;
            this.yearOfBirth = yearOfBirth;
         }    

    @Override
    public void display() {
        System.out.println( "Семья: " + family +
    "\nСемейное положение: " + type  +
    "\nИмя: " + name  +
    "\nЛет: " + age );
    }

    @Override
    public String getFamily() {
        return family;
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
        public String getNameDad() {
           return nameDad;
        }

    

    @Override
    public Integer getyearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public void setyearOfBirth(Integer yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public void getYear(String year, Integer year2, String name) {
        if(Integer.parseInt(year)> year2 ){
            if( (Integer.parseInt(year)- year2) > 100){
        System.out.println("В " + year + " году \n "+ name +"у будет "+(Integer.parseInt(year) - year2) );
        due();
    }else{System.out.println("В " + year + " году \n "+ name +"у будет "+(Integer.parseInt(year) - year2) );}
    }else{
        System.out.println(name + " ещё не родился");
    }
}

       public abstract void due();

       
    
}
