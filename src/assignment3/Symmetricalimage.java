import java.util.Scanner;

public class Symmetricalimage {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);  

        System.out.println("how many rows?");
        int rows = in.nextInt();
        System.out.println("how many columns?");
        int cols = in.nextInt();
        boolean[][] array =new boolean[rows][cols];
        for (int i = 0; i < rows * cols / 8; i++)
        {
            int row = (int) (Math.random() * rows) ;
            int col = (int) (Math.random() * cols) ;
            array[row][col] = true;
        }
        for (int i = 0; i < array.length ; i++)
        {
            for (int j = 0; j < array[0].length; j++)
            {
                if (array[i][j] == true)
                {
                    array[i][array[0].length - j-1] = true;
                }
            }
        }
        System.out.println(" ");
        for (int i = 0; i < array.length ; i++)
        {
            for (int j = 0; j < array[0].length; j++)
            {
                if (array[i][j] == true)
                {
                    System.out.printf("*");
                }
                else
                {
                    System.out.printf(" ");
                }

            }    
            System.out.println(" ");
        }




}
}