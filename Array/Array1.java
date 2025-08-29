// Write a program to find the maximum element in the array
public class Array1 {

    public int maxElement(int []arr){
        if(arr.length == 0){
            return -1;
        }
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int []arr = {7,5,8,2,9,1,6};
        Array1 array = new Array1();
        System.out.println(array.maxElement(arr));
        }
}
