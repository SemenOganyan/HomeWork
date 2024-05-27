public class App {
    public static void main(String[] args){
// Первое задание
        Staff staff1 = new Staff("Гаврилов В.А.", "Сварщик", "Gavr@mail.ru",
        "+7962 657 56 76", 35000, 33);
        staff1.info();
// Второе задание
        Staff[] persArray = new Staff[5];
        persArray[0] = new Staff("Гаврилов В.А.", "Сварщик", "Gavr@mail.ru",
         "+7962 657 56 76", 35000, 33);
        persArray[1] = new Staff("Семенов С.А.", "Токорь", "Sems@mail.ru",
         "+7942 647 53 26", 30000, 25);
        persArray[2] = new Staff("Петров Р.Г.", "Токорь", "Petr@mail.ru",
        "+7986 453 75 99", 36000, 38);
        persArray[3] = new Staff("Караваев В.В.", "Директор", "Boss@mail.ru",
         "+7943 434 43 43", 55000, 45);
        persArray[4] = new Staff("Синицын Ю.А.", "Мастер", "Sin@mail.ru",
         "+7933 234 53 65", 40000, 55);
    }
// Третье задние
// Класс Park создан, никак не используется
}
