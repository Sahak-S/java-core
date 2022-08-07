package primer.java.interview.programs;

import java.util.Scanner;
//Напишите программу на Java для переворота последовательности символов в строке без использования встроенной в String функции reverse()
public class SecondTask {

    public static void main(String[] args) {

        String st;

        Scanner scannerQ = new Scanner(System.in);

        System.out.println("Введите вашу строку:");

        st = scannerQ.nextLine();

        String[] temp = st.split("");    //используем метод split для вывода строки в обратном порядке

        for (int x = temp.length - 1; x >= 0; x--) {

            System.out.print(temp[x] + "");
        }
        System.out.println();


        String str = "Учимся программировать";

        char symbols[] = str.toCharArray();  // конвертируем строку в массив символов, затем выводим символы на экран в обратном порядке

        for(int x= symbols.length-1; x>=0; x--) {

            System.out.print(symbols [x]);

        }
    }
}
