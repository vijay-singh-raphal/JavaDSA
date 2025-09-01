public class Array2 {

    public void arrayReverse(int []arr){
        int first = 0;
        int last = arr.length-1;
        int temp;
        while(first<=last){
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--; 
        }
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        Array2 reverse = new Array2();
        reverse.arrayReverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
