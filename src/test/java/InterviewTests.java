import interview.DuplicateSolution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InterviewTests {


    // TARGET EXERCISE - DuplicateSolution
    @Test
    public void testDuplicatesRemoved(){
        // Input array
        int[] nums = {1,1,2,2,3,3,3,4};
        // The expected answer length for the removed duplicates
        int[] expectedNums = {1,2,3,4};
        // Implemented Solution Call
        int k = DuplicateSolution.removeDuplicates(nums);
        // TEST ASSERTION
        Assertions.assertSame(k,expectedNums.length);
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}
