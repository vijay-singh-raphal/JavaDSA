public class Array7 {
    public void findMissing(int []arr){
        int len = arr.length+1;
        int expectedSum = len*(len+1)/2;
        int actualSum = 0;
        for(int i= 0;i<arr.length; i++){
            actualSum = actualSum + arr[i];
        }

        System.out.println("the missing number is "+(expectedSum-actualSum));
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,5};
        Array7 array = new Array7();
        array.findMissing(arr);
    }
}
