package Project;

import java.util.Scanner;

public class NumberSeries2 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();
        
        System.out.print("Output: ");
        
        for (int i = 1; i <= x; i += 2) 
        	{
              System.out.print(i);
                if (i + 2 <= x) 
                {
                   System.out.print(", ");
                 }
            }
    }
}

