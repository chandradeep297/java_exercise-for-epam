import java.util.Scanner;
public class Arrayp1
{
    public static void main(String[] args) 
    {
        int n, sum = 0;
        float average;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n ; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum of the array :"+sum);
        average = (float)sum / n;
        System.out.println("Average of the numbers:"+average);
    }
}