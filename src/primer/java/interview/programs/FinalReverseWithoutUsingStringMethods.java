package primer.java.interview.programs;
// Напишите программу на Java для переворачивания строки, изменив расположение символов в строке задом наперёд без использования встроенных в String функций
public class FinalReverseWithoutUsingStringMethods {

    public static void main(String[] args) {
        String str = "Automation";
        StringBuilder str2 = new StringBuilder();
        str2.append(str);
        str2 = str2.reverse();     // used string builder to reverse
        System.out.println(str2);
    }
}
