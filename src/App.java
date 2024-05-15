public class App {
    public static void main(String[] args){
        printThreeWords();// 1
        checkSumSign();// 2
        printColor();// 3
        compareNumbers();// 4
        boolean s = yesOrNo(8, 3);// 5
        System.out.println(s);// Чтобы проверить 5
        negativеOrPasitive(3);// 6
        boolean ss = plusOrMinus(5);// 7
        System.out.println(ss);// Чтобы проверить 7
        stringNums("Восьмое", 3);// 8
        leapYear(2005);// 9
        revesrMass();// 10
        bigMass();// 11
        sixMass();// 12
        sqareMass();// 13
        lastMass(3, 5);// 14
    }
// Четырнадцатое задание
    private static void lastMass(int len, int initialValue){
        int arr[] = new int[len];
        for(int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
            System.out.println("hah["+ i +"] = " + arr[i]);// Чтобы проверить 14
        }
    }
// Тринадцатое задание
    private static void sqareMass() {
        int arr[][] = new int[5][5];
        int son = arr.length - 1;// Счетчик для второй диагонали
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(j == i || j == son){
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");// Рисуем строку для наглядности
            }
            son--;
            System.out.println();// Новая строка
        }
    }
// Двенадцатое задание
    private static void sixMass() {
        int arr[] = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < arr.length; i++){
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.println("bar["+ i +"] = " + arr[i]);// Чтобы проверить 12
        }
    }
// Одинадцатое задание
    private static void bigMass(){
        int arr[] = new int[100];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
            //System.out.println("rar["+ i +"] = " + arr[i]);// Если надо вот проверка
        }
    }
// Десятое задание
    private static void revesrMass() {
        int arr[] = new int[] {1, 0, 1, 0, 1};
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == 1) {
                arr[i] = 0;
            }else{
                arr[i] = 1;
            }
            System.out.println("arr["+ i +"] = " + arr[i]);// Чтобы проверить 10
        }
    }
// Девятое задание
    private static void leapYear(int a) {
        if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
            System.out.println("да");
        }else{
            System.out.println("нет");
        }
    }
// Восьмое задание
    private static void stringNums(String a, int b) {
        for(int i = b; i != 0; i--){
            System.out.println(a);
        }
    }
// Седьмое задание
    private static boolean plusOrMinus(int a) {
        if (a >= 0) {
            return false;
        }else{
            return true;
        }
    }
// Шестое задание
    private static void negativеOrPasitive(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        }else{
            System.out.println("Отрицательное");
        }
    }
// Пятое задание
    private static boolean yesOrNo(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        }else{
            return false;
        }
    }
// Четвертое задание
    private static void compareNumbers() {
        int a = 8, b = 5;
        if (a >= b) {
            System.out.println("a >= b");
        }else{
            System.out.println("a < b");
        }
    }
// Третье задание
    private static void printColor() {
        int value = 0;
        if (value <= 0) {
            System.out.println("Красный");
        }else if (value > 0 && value <=100 ) {
            System.out.println("Желтый");
        }else{
            System.out.println("Зеленый");
        }
    }
// Второе задание
    private static void checkSumSign() {
        int a = 2, b = 4;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        }else{
            System.out.println("Сумма отрицательная");
        }
    }
// Первое задание
    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
}
