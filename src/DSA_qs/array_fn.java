package DSA_qs;

import java.util.Arrays;

//mutable behavior
//arrays are mutable in java and strings are not mutable in java

public class array_fn {
    public static void main(String[] args) {
        int[] nums={3,4,5,12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void change(int[] arr){
        arr[0]=99;
    }
}
