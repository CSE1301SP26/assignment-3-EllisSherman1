import java.util.Scanner;

public class Frequencytable {

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);  

        System.out.println("How many dice?");
        int rolls = in.nextInt();
        int[] array = new int[rolls*6 - (rolls-1)];

        for (int i = 0; i < 10000; i++)
        {
            int sum = 0;
            for (int j = 0; j < rolls; j++)
            {
                int roll = (int) (Math.random() * 6) + 1;

                sum = sum + roll;

            }
            array[(sum - (rolls))]++;
        }
        for (int k = 0; k < array.length ; k++)
        {
            System.out.println(array[k]);
            
        }
        

    }
}
