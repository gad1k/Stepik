package sec_02_04.step_09;

public class Main {
    /**
     * Merges two given sorted arrays into one
     *
     * @param a1 first sorted array
     * @param a2 second sorted array
     * @return new array containing all elements from a1 and a2, sorted
     */
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];

        int indexA1 = 0, indexA2 = 0;

        for (int i = 0; i < result.length; i++) {
            if (indexA1 == a1.length) {
                result[i] = a2[indexA2++];
                continue;
            }
            if (indexA2 == a2.length) {
                result[i] = a1[indexA1++];
                continue;
            }
            if (a1[indexA1] < a2[indexA2])
                result[i] = a1[indexA1++];
            else
                result[i] = a2[indexA2++];
        }
        return result;
    }
}