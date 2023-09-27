import java.io.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //task1HW();
        //task2HW();
        //task3HW()
        //task4();

    }

    private static void task4()  {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        if (input.isEmpty()){
            throw new IllegalArgumentException("Вы ввели пустую строку");
        }else{
            System.out.printf("Вы ввели %s", input);
        }
    }

    private static void task3HW() {
        int a = 90;
        int b = 3;
        if (b != 0){
            System.out.println(a / b);
        }else{
            System.out.println("Пытаетесь разделить на 0");
        }

        printSum(23, 234);

        int[] abc = { 1, 2 };
        int index = 3;
        if (index >= abc.length){
            System.out.println("Индекс выходит из диапазона массива");
        }else{
            abc[3] = 9;
        }
    }

    private static void task2HW() {
        int[] intArr = new int[5];
        int d = 0;
        int index = 8;
        if (d == 0){
            System.out.println("вы пытаетесь делить на 0");
        }else if (index >= intArr.length){
            System.out.println("Индекс за пределами массива");
        }else{
            double catchedRes1 = intArr[8] / d;
        }
    }

    private static void task1HW() {
        InputStream is;
        String[] strings = {"asdasd", "asdasdgg"};
        int i = 2;
        if (i >= strings.length) {
            throw new RuntimeException("Индекс за пределами массива :(");
        }
        String strings1 = strings[i];

        try{
            test();
        }catch (StackOverflowError e){
            System.out.println("Вы вызвали бесконечную рекурсию");
        }

        int d = 0;
        if (d == 0){
            System.out.println("Вы пытаетесь разделить на 0");
        }

        try {
            is = new FileInputStream("asdasdasd");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Не нашли такой файл");
        }
    }


    public static void test() {
        try {
            File file = new File("1");
            file.createNewFile();
            FileReader fr = new FileReader(file);
            fr.read();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("что-то пошло не так при работе с файлом:(");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

}