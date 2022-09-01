//zoraz haseeb
import java.util.Scanner;
class cmsc401{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int loopNumber = sc.nextInt();
        int index = 0;
        int [] answers = new int[loopNumber];

        for(int i =0; i < loopNumber;i++){
            int secondLoop = sc.nextInt();
            int [] arr = new int [secondLoop - 1];
            for(int j =1; j < secondLoop -1;j++){
                arr[j] = sc.nextInt();

            }
            int firstIndex = sc.nextInt();
            int secondIndex = sc.nextInt();
            int ans = arr[firstIndex] + arr[secondIndex];
            answers[index] = ans;
            index++;
        }
        for(int i =0; i < loopNumber;i++){
            System.out.print(answers[i] + "\n");
        }
    }
}
