import java.util.Arrays;

public class MergeSort implements Strategy {
  public void sort(int[] nums) {
    if (nums.length < 2) {
      return;
    }

    int mid = nums.length / 2;
    int[] left = Arrays.copyOfRange(nums, 0, mid);
    int[] right = Arrays.copyOfRange(nums, mid, nums.length);

    sort(left);
    sort(right);

    merge(nums, left, right);
  }

  private void merge(int[] nums, int[] left, int[] right) {
    int i = 0;
    int j = 0;
    int k = 0;

    while (i < left.length && j < right.length) {
      if (left[i] <= right[j]) {
        nums[k++] = left[i++];
      } else {
        nums[k++] = right[j++];
      }
    }

    while (i < left.length) {
      nums[k++] = left[i++];
    }

    while (j < right.length) {
      nums[k++] = right[j++];
    }
  }
}
