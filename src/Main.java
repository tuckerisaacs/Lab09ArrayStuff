import java.util.*;
public class Main

{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dataPoints;
        dataPoints = new int[100];
        Random rand = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100);
            System.out.print(dataPoints[i] + " | ");

        }
        float sum = 0;
        int i = 0;
        while (i < dataPoints.length) {
            sum += dataPoints[i];
            i++;
        }
        float average = (sum / dataPoints.length);

        System.out.println("\nthe average value of the array is " + average);
        System.out.println("\nthe sum value of the array is " + sum);

        int total = 0;
        System.out.println("\nEnter the target value: ");
        int target = sc.nextInt();
        if (target == dataPoints[i]) {
            total++;
        }
        System.out.print("the value "+target+" is present "+total+" times");

     





    }


}