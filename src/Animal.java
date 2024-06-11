public class Animal {
    public String name; 
    public Animal(String name){
        this.name = name;
    }

    public void run(int range){
        System.out.println(name + " Пробежал " + range + " м");
    }
    
    public void swim(int range){
        System.out.println(name + " Проплыл " + range + " м");
    }
}
