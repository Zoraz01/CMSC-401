import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
//Zoraz Haseeb
class garden{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numberOfGardens = sc.nextInt();
        int [] y = new int[numberOfGardens * 3];
        int loopNUmber = 0;
        int totalNUmbers = 0; 
        for(int i =0; i < numberOfGardens; i++){
            y[i] = sc.nextInt();
            totalNUmbers++;
            loopNUmber = sc.nextInt();
            numberOfGardens += loopNUmber - 1;
            for(int j =1; j < loopNUmber;j++){
                y[i+j] = y[i];
                totalNUmbers++;

            }
            i += loopNUmber - 1;
        }
        int [] arr = new int[totalNUmbers];
        for(int i =0; i < totalNUmbers;i++){
            arr[i] = y[i];
        }
        int median = 0; 
        if(arr.length % 2 != 0){
            median = (arr.length - 1) / 2;
        }
        else{
            median = arr.length / 2;
        } 
        garden gar = new garden();
        int result = gar.quickMedian(arr,median,0,arr.length - 1, arr.length - 1);
        System.out.println(result);
        //System.out.println(gar.realMed(arr,totalNUmbers));
    }
    //Partition function
    public int partition(int [] arr, int l, int h){
        int pivot = arr[h];
        int i = l -1;
        for(int j = l;j < h; j++){
            if(arr[j]<= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp; 
            }
        }
        int temp2 = arr[i+1];
        arr[i+1] = arr[h];
        arr[h] = temp2;
        return i+1;
    }
    //Method that runs in O(n)
    public int quickMedian(int []arr, int med, int l, int h, int n){
        int result = 0;
        if(l < h){
            int p = partition(arr, l, h);
            if(med == p){
                if(n % 2 ==0){
                    return arr[med];
                }
                else{
                    return (arr[med] + arr[med-1]) / 2;
                }
            }
            else if(p > med){
            result = quickMedian(arr, med, l, p-1,n);
            }else{
            result = quickMedian(arr,med,p+1,h,n);
            }
        }
        if(n % 2 ==0){
            return arr[med];
        }
        else{
            return (arr[med] + arr[med-1]) / 2;
        }
    }
    // Method that runs in more than O(n) but is good for testing
   /*public int realMed(int []arr, int n){
        Arrays.sort(arr);
        if (n % 2 != 0)
            return arr[n / 2];
 
        return (arr[(n - 1) / 2] + arr[n / 2]) / 2;
    }*/
}
