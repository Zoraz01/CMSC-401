import java.util.Scanner;
import java.lang.Math;
class garden{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numberOfGardens = sc.nextInt();
        int [] y = new int[numberOfGardens];
        int [] size = new int[numberOfGardens];
        int maxY = Integer.MIN_VALUE; 
        int minY = Integer.MAX_VALUE;
        for(int i =0; i < numberOfGardens; i++){
            y[i] = sc.nextInt();
            size[i] = sc.nextInt();
            maxY = Math.max(maxY,y[i]);
            minY = Math.min(minY,y[i]);
        }


        int opt = getOptimalLength(y,size,maxY,minY); 
        System.out.println(opt);


    }
    public static int getOptimalLength(int[] y, int [] size, int max, int x){
        if(x > max){
            return Integer.MAX_VALUE; 
        }
        int sum = 0;

        for(int i =0; i < y.length;i++){
            sum = sum + Math.abs(((x - y[i]) * size[i])); 
        }
        return Math.min(sum,getOptimalLength(y, size, max, x+1));
    }

}