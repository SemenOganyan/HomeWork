public class Cat extends Animal{

    public boolean hunger;
    public Cat(String name, boolean hunger) {
        super(name);
        this.hunger = hunger;
    }

    public void run(int range){
        if (range > 200) System.out.println(name + " Пробежал " + 200 + " м и устал"); 
        else System.out.println(name + " Пробежал " + range + " м");
    }

    public void swim(){
        System.out.println(name + " Не умеет плавать"); 
    }

    public void eat(int feed){
        if (hunger == false && feed >= 15){
            hunger = true;
            System.out.println(name + " Поел, сытость - " + hunger);
        } 
        else if(hunger == true) System.out.println(name + " Уже сытый, сытость - " + hunger) ;
        else System.out.println(name + " Не хватило еды, сытость - " + hunger);
    }
}
