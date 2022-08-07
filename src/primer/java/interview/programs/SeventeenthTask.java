package primer.java.interview.programs;
//Напишите Java-программу для проверки является ли введенное число - числом Армстронга.
public class SeventeenthTask {

    public static void main(String[] args) {

        int y=0, x, tempNumber;

        int qurentNumber=25; //Данное число мы будем проверять на то, является ли оно числом Армстронга

        tempNumber = qurentNumber;

        while(qurentNumber >0)

        {

            x= qurentNumber %10;

            qurentNumber = qurentNumber /10;

            y=y+(x*x*x);

        }

        if(tempNumber ==y)

            System.out.println("Данное число является числом Армстронга");

        else

            System.out.println("Данное число не является числом Армстронга");
    }
}
