public class App {
    public static void main(String[] args){
// Первое задание
        Cat[] arrCat = new Cat[3];
        arrCat[0] = new Cat("Барсик", false);
        arrCat[1] = new Cat("Снежок", false);
        arrCat[2] = new Cat("Матроскин", false);

        Dog[] arrDog = new Dog[1];
        arrDog[0] = new Dog("Печенег");

        int countAnimals = arrCat.length + arrDog.length;
        int catBowl = 40; // Миска для котов

        arrCat[0].run(100); // Проверка кота на бег
        arrCat[1].swim(); // Проверка кота на плавание

        arrDog[0].run(1000); // Проверка пса на бег
        arrDog[0].swim(6); // Проверка пса на плавание
        
        System.out.println("Количество зверей - " + countAnimals); // Считаем зверей
        System.out.println("Количество котов - " + arrCat.length); // Считаем котов
        System.out.println("Количество собак - " + arrDog.length); // Считаем собак

        for(int i = 0; i < arrCat.length; i++){
            arrCat[i].eat(catBowl); // Кормим котов
            if(catBowl >= 15) catBowl -= 15;
        }
//  Второе задание
    }
}