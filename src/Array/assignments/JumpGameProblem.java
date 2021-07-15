package Array.assignments;

import org.w3c.dom.ls.LSOutput;

/*
You have an array of non-negative integers,you are initially positioned at the first index of the array.
Each element in the array represents your maximum jump length at that position.
Determine if you are able to reach the last index in minimum jumps in O(n) Time complexity and O(1) Space Complexity
*/
public class JumpGameProblem {
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(findJump(a));
    }

    private static int findJump(int[] arr) {
        int a = arr[0];
        int b = arr[0];
        int jump = 1;
        for (int i = 1; i < arr.length; i++)
        {
            if (i == arr.length - 1)
                return jump;
            a--;
            b--;
            if(arr[i]>b)
                b=arr[i];
            if(a==0) {
                jump++;
                b=a;
            }
        }
        return jump;
    }
}
