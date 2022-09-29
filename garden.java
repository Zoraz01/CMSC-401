import java.util.Scanner;
import java.lang.Math;
class garden{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numberOfGardens = sc.nextInt();
        int [] y = new int[numberOfGardens];
        int [] size = new int[numberOfGardens];
        int sum1 = 0; 
        int sum2 = 0;
        for(int i =0; i < numberOfGardens; i++){
            y[i] = sc.nextInt();
            size[i] = sc.nextInt();
            sum1 = sum1 + size[i] * size[i] * y[i];
            sum2 = sum2 + size[i] * size[i];
        }
        int x =  sum1 / sum2;
        double totalCost = 0;
        for(int i =0; i < numberOfGardens;i++){
            totalCost = totalCost + Math.abs(x - y[i] * size[i]);
        }
        System.out.println((int) x);
        System.out.println((int)totalCost);

    }

}