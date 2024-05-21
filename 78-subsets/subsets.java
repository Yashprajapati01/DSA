class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        return getSubsets(nums);
    }
    public static List<List<Integer>> getSubsets(int[] arr) {
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>()); // Start with the empty subset

        for (int num : arr) {
            int size = subsets.size();
            for (int i = 0; i < size; i++) {
                List<Integer> newSubset = new ArrayList<>(subsets.get(i));
                newSubset.add(num);
                subsets.add(newSubset);
            }
        }

        return subsets;
    }
}