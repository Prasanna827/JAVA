import java.util.Arrays;

public class MoveZeros {

    public static void moveZeros(int[] nums) {
        
        int insertPosition = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertPosition] = nums[i];
                insertPosition++;
            }
        }

        while (insertPosition < nums.length) {
            nums[insertPosition++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        System.out.println("Before moving zeros: " + Arrays.toString(nums));

        moveZeros(nums);

        System.out.println("After moving zeros:  " + Arrays.toString(nums));
    }
}




