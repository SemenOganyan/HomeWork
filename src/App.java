public class App {
    public static void main(String[] args){
        App main = new App();
        String[][] correct = {
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"}
        };
        String[][] incorrect = {
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"}
        };
        String[][] incorrect1 = {
            {"1", "2", "3"},
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"}
        };
        String[][] incorrect2 = {
            {"1", "2", "3", "U"},
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"}
        };
// Третье задание
        try {
        // Для проверки исключений раскоментируйте 1 из 3х с припиской incorrect№
           main.stringExceptionTest(correct);
           // main.stringExceptionTest(incorrect); // Проверка первого исключения
           // main.stringExceptionTest(incorrect1); // Проверка второго исключения
           main.intExceptionTest(correct); // Проверка расчета суммы массива
           main.intExceptionTest(incorrect2); // Проверка второго задания, первого исключения
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException b){
            b.printStackTrace();
        }
    }
// Первое задание
    public void stringExceptionTest(String[][] arr) throws MyArraySizeException {
        if (arr.length != 4) throw new MyArraySizeException("Неверное количество строк");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) throw new MyArraySizeException(String.format
            ("Неверное количество столбцов в %d-й" + " строке", i));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    class MyArraySizeException extends Exception {
        public MyArraySizeException(String message) {
            super(message);
        }
    }

// Второе задание
    public void intExceptionTest(String[][] arr) throws MyArrayDataException {
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                try{
                    a += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException("Элемент " + arr[i][j] + " в " + i + " строке, " + j + 
                    " столбце является строкой а не числом");
                }
            }
            System.out.println();
        }      
        System.out.println("Сумма элементов массива = " + a);  
    }
}

class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}