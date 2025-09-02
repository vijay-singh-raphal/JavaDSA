public class Array4 {
    public int secondLargest(int []arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int []arr = {5,7,3,8,2,9};
        Array4 array = new Array4();
        int rs = array.secondLargest(arr);
        System.out.println("The second largest element is "+rs);
    }
}
