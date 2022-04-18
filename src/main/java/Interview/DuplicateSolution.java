package Interview;

// Source : https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Description:
/* Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that
 each unique element appears only once. The relative order of the elements should be kept the same.
Since it is impossible to change the length of the array in some languages, you must instead have the result
be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates,
then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
Return k after placing the final result in the first k slots of nums.
Do not allocate extra space for another array. You must do this by modifying the input array in-place with
O(1) extra memory.
*/
// Testing:

import java.util.Arrays;

public class DuplicateSolution {

    public static int removeDuplicates(int[] nums){
        // If the Array has no values, it has no unique values/indexes
        if (nums.length == 0){return 0;}

        // First Pointer
        int i = 0;
        // Second Pointer
        for (int j = 1; j < nums.length; j++) {
            // If the values are not the same, increment i, which is the count of unique values
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        // Because i is the index of the unique numbers, return the quantity of unique numbers by i + 1
        return i + 1;
    }
}
