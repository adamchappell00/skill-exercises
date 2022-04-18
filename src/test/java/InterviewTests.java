import Interview.DuplicateSolution;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;


public class InterviewTests {

    @Test
    public void testDuplicatesRemoved(){
        int[] nums = {1,1,2,2,3,3,3,4}; // Input array
        int[] expectedNums = {1,2,3,4,1,2,3,3}; // The expected answer with correct length

        int k = DuplicateSolution.removeDuplicates(nums); // Calls your implementation

        assertsame(k,expectedNums.length);
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}
