package Array.FindPairWithSumK;

import java.sql.SQLOutput;

/*int array[] = { 3, 5, 6, 9, 14, 8, 2, 12, 7, 7 };
  O/P ->
        sum : 14 array : [ 3, 5, 6, ]
        sum : 14 array : [ 14, ]
        sum : 14 array : [ 2, 12, ]
        sum : 14 array : [ 7, 7, ]*/
public class FindAllContagiousSubArrayWithGivenSum {
    public static void main(String[] args) {
        int arr[] = {3, 5, 6, 9, 14, 8, 2, 12, 7, 7};
        int sum = 14;
        printAllSubArray(arr, sum);
    }

    private static void printAllSubArray(int[] arr, int sum) {
       ;
        for (int i = 0; i < arr.length; i++) {
            int curr_sum = 0;
            String str = "[ ";

            for (int j = i; j < arr.length; j++) {
                curr_sum += arr[j];
                str = str+ arr[j]+", ";

                if (curr_sum == sum) {
                    System.out.println(str + " ]");
                    str = "[ ";
                    curr_sum = 0;
                }

            }
        }
    }
}
//This code can be improved! Currently having 0(n2) complexity
