package Test;

public class Quiz4 {
    
    public static int sumArray(int[] arr) {
       
        if (arr.length < 3) {
            return -999;
        }

        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
       
        int[] arr1 = {2, 4, 6, 8, 10};
        int result1 = sumArray(arr1);
        System.out.println("첫번째 배열의 합: " + result1);

        
        int[] arr2 = {2, 4};
        int result2 = sumArray(arr2);
        System.out.println("두번째 배열의 합: " + result2);
    }
}
