public class BubbleSort implements Strategy {
  @Override
  public void sort(int[] nums) {
    int n = nums.length;
    boolean swapped = false;
    for (int i = 0; i < n - 1; i++) {
      swapped = false;
      for (int j = 0; j < n - 1 - i; j++) {
        if (nums[j] > nums[j + 1]) {
          int tmp = nums[j];
          nums[j] = nums[j + 1];
          nums[j + 1] = tmp;
          swapped = true;
        }
      }
      if (!swapped) {
        break;
      }
    }
  }
}
