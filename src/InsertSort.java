public class InsertSort {
    public static void insertSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i - 1;
            while (j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }

    public static void main(String[] args) {
        int[] arr={3,2,5,3,6,4,5,3,7};
        System.out.println("Mang ban dau la");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"   ");
        }
        insertSort(arr);
        System.out.println("\nMang sau khi sap xep la");
        for (int e:arr) {
            System.out.print(e+"   ");
        }
    }
}
