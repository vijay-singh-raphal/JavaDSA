public class Array8 {
    public void findMissingSorted(int []arr){
        int left = 0;
        int right = arr.length-1;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if(arr[mid] == mid){
                left = mid + 1;
            }
            else{
                right = mid -1;
            }
        }
        System.out.println("missing "+left);
    }
    public static void main(String[] args) {
        int []arr = {0,1,2,4,5,6};
        Array8 array = new Array8();
        array.findMissingSorted(arr);
    }
}
