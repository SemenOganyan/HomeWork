public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }
    public void run(int range){
        if (range > 200) System.out.println(name + " Пробежал " + 200 + " м и устал"); 
        else System.out.println(name + " Пробежал " + range + " м");
    }
    public void swim(){
        System.out.println(name + " Не умеет плавать"); 
    }
}
