public class Array5 {
    public void moveZeros(int []arr){
        int j = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
        }

        while(j < arr.length){
            arr[j] = 0;
            j++;
        }
    }
    public static void main(String[] args) {
        int []arr = {7,0,9,5,0,6,8,0,0,4};
        Array5 array = new Array5();
        array.moveZeros(arr);

        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
