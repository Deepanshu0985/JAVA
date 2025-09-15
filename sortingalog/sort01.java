package sortingalog;

public class sort01 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 0, 0, 1};
        sort01arr(arr);
        System.out.println("Sorted array: ");
        printArray(arr);
    }

    public static void sort01arr(int[] arr) {
        int i =0;
        int j =0;
        int n = arr.length;
        while (i<n){
            if (arr[i]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }else{
                i++;    
            }
        }
        
    }
    public static void sort01leftright(int arr[]){
        int i = 0 ;
        int j = arr.length -1;
        while (i<j){
            while (arr[i]==0 && i<j){
                i++;
            }
            while (arr[j]==1 && i<j){
                j--;
            }
            if (i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

    }

    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
}
