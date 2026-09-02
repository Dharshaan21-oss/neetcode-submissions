class Solution {
    public int[] replaceElements(int[] arr) {
        int maxSeen = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int currentVal = arr[i];
            arr[i] = maxSeen;
            if (currentVal > maxSeen) {
                maxSeen = currentVal;
            }
        }
        return arr;
    }
}
