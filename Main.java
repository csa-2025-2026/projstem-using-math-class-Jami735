import java.util.Scanner;    // optional to use user input
 
public class Main
{
    public static void main(String[] args)
    {
        // You can optionally use the Scanner for user input
        Scanner scan = new Scanner(System.in);
        
        double xy = calcSlope(x1, x2, y1, y2);
        System.out.println("The slope is: " + xy);
        
       
    }
    
    public static void printRandom3(int num)
    {
        // Random whole numbers between a and b
        // (int) (Math.random() * (b-a+1) + a);
        int lowerBound = 2;
        int upperBound = num +2;
        System.out.println( (int)  (Math.random() * (upperBound - lowerBound + 1) + lowerBound) );
        System.out.println( (int)  (Math.random() * (upperBound - lowerBound + 1) + lowerBound) );
        System.out.println( (int)  (Math.random() * (upperBound - lowerBound + 1) + lowerBound) );
    }
    
    public static double calcSlope(double x1, double x2, double y1, double y2)
    {
         x1 = 4.3;
         x2 = 3.7;
         y1 = -4.0;
         y2 = 6.7;
        double xy = calcSlope(x1, x2, y1, y2);
      
        return 0.0;

    }
    
    public static int roundedDist(double a, double b)
    {
        System.out.println("Enter two doubles:");
        int dist = (int)(Math.abs(a-b) + 8.5);
        return 0;
    }
}
