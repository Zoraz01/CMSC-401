//Zoraz Haseeb
import java.util.Scanner;
class majorityElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int loopNumber = sc.nextInt();
        int [] arr = new int [loopNumber];
        for(int i =0; i < loopNumber;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(getMajority(arr));

    }
    public static int getMajority(int [] arr){
        int majority = 0;
        int majCounter = 1;
        int sizeToBeMaj = arr.length / 2;
        majority = arr[1];
        

        for(int i =1; i < arr.length; i++){
            if(majority == arr[i]){
                majCounter++;
            }
            else{
                majCounter--;
            }
            if(majCounter == 0){
                majority = arr[i+1];
                majCounter = 1;
            }
        }
        int counter = 0; 
        for(int i = 0; i < arr.length; i++){
            if(majority == arr[i]){
                counter++;
            }
        }
        if(counter >= sizeToBeMaj){
            return majority;
        }
        else{
            return -1; 
        }
    }
}

