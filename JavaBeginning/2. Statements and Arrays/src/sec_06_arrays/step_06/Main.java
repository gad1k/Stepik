package sec_06_arrays.step_06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] nums = new int[length];
        for (int i = 0; i < length; i++)
            nums[i] = scanner.nextInt();
        int maxPairwise = Integer.MIN_VALUE;
        if (nums.length == 1)
            System.out.println(nums[0]);
        else {
            for (int i = 0; i < length - 1; i++) {
                int pairwise = nums[i] * nums[i + 1];
                if (pairwise > maxPairwise)
                    maxPairwise = pairwise;
            }
            System.out.println(maxPairwise);
        }
    }
}