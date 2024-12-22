public class ArrayRotation {
    public static void rotateArray(int[] arr, int k) {
        k = k % arr.length; 
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[(i + k) % arr.length] = arr[i];
        }
        System.arraycopy(result, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotateArray(arr, 2);
        for (int num : arr) {
            System.out.print(num + " ");  
        }
    }
}
