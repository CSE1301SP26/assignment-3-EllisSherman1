import java.util.Scanner;

public class bubblesort {


    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);  

        System.out.println("How long do you want the array to be?");
        int length = in.nextInt();

        int[] array = new int[length];


        int i;
        int value;
        for (i=0; i < array.length ; i++)
        {
            System.out.println("what do you want array[" + i + "] to be?");
            value = in.nextInt();
            array[i] = value;

        }
        System.out.printf("Given Values:");
        for (int num : array)
        {
            System.out.printf(" " + num );
        }
        
        int j;
        for (j=0; j < array.length ; j++)
        {
            int k;
            int swap;
            for (k=j+1 ; k < array.length ; k++)
            {
                if (array[j] > array [k])
                {
                    swap = array[k];
                    array[k] = array[j];
                    array[j] = swap;
                }


            }

        }
        System.out.println();
        System.out.printf("Sorted Values:");
        for (int numb : array)
        {
            System.out.printf(" " + numb );
        }

        







}
}