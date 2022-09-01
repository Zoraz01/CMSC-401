//Zoraz Haseeb
class majorityElement{
    public static void main(String[] args){

    }
    public int getMajority(int [] arr){
        int majority = 0;
        int majCounter = 1;
        majority = arr[i];

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
    }
}
