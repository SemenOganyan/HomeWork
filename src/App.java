public class App {
    public static void main(String[] args){
// Первое задание
        Cat[] arrCat = new Cat[2];
        arrCat[0] = new Cat("Барсик");
        arrCat[1] = new Cat("Снежок");
        arrCat[2] = new Cat("Матроскин");

        Dog[] arrDog = new Dog[1];
        arrDog[0] = new Dog("Печенег");

        arrCat[0].run(100); // Проверка кота на бег
        arrCat[1].swim(); // Проверка кота на плавание

        arrDog[0].run(1000); // Проверка пса на бег
        arrDog[0].swim(6); // Проверка пса на плавание

    }
}