package primer.array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        int[] array = {1, 2, 8, 4, 6, 0, 2};

        //Реверс строки без метода revers()                                            +1
        String s = "asd";
        for (int i = s.length(); i > 0; i--) {
            System.out.print(s.charAt(i - 1));
        }
        System.out.println();

        //babl sort                                                                   +2
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }

            }
        }
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println();


        // max  masiv                                                                +3
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("max = " + max);

        //erkrord max um@                                                                   +4
        // int max1 = array[0];
        int max2 = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                max2 = array[i];
            } else if (array[i] > max2 && array[i] != max) {
                max2 = array[i];
            }
        }
        System.out.println("max2 = " + max2);
        System.out.println();


//        Scanner scan = new Scanner(System.in);                                                +14
//        System.out.println("enter the String");
//        String st = scan.nextLine();
        String st = "hhggfff";
        char ch[] = st.toCharArray();//converts String to character array
        int n = ch.length;
        for (int i = 0; i < n; i++) {
            int count=1;
            for (int j = i+1; j < n; j++) {
                if (ch[i]!=' '&&ch[i]==ch[j]) {
                    count++;//increment count
                    for (int j2 = j; j2 < n-1; j2++) {
                        //Shift all the subsequent chars in the array to the left
                        ch[j2]=ch[j2+1];
                    }
                    n--;
                    j--;
                }
            }
            if (count>1) {
                System.out.println(ch[i]+"="+count);
            }
        }













        //miacnel masivner@                                                        +18
        int[] a = {1,2,3};
        int[] b = {4,5,6};
        int[] c = new int [a.length+b.length];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
            count++;
        }
        for (int j = 0; j < b.length; j++) {
            c[count++] = b[j];
        }
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }



    }
}
