public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }
    public void run(int range){
        if (range > 500) System.out.println(name + " Пробежал " + 500 + " м и устал"); 
        else System.out.println(name + " Пробежал " + range + " м");
    }
    public void swim(int range){
        if (range > 10) System.out.println(name + " Проплыл " + 10 + " м и устал"); 
        else System.out.println(name + " Проплыл " + range + " м");
    }
}
