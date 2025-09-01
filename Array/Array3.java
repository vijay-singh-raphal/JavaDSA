import java.util.Scanner;
public class Array3 {

    public void reverse(int []arr,int first,int last){
        int temp;
        while(first < last){
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }

    public void rotateArray(int []arr,int pos){
        pos = pos % arr.length;
        reverse(arr,pos,arr.length-1);
        reverse(arr,0,pos-1);
        reverse(arr,0,arr.length-1);
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the rotating position ");
        int pos = in.nextInt();
        Array3 array = new Array3();
        array.rotateArray(arr,pos);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        in.close();
    }
}
