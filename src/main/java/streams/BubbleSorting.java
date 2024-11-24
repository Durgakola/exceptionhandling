package streams;

public class BubbleSorting {

    public static void main(String[] args) {
        int arr[]={23,45,22,12,15,1,3,2};
        int length=arr.length;
        System.out.println("UnSorted array : ");
        for(int i=0;i<length;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<length;i++){
            for(int j=1;j<length-i;j++){
                if(arr[j-1]>arr[j]){
                    int tem=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=tem;
                }
            }
        }

        System.out.println("Sorted array : ");
        for(int i=0;i<length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
