Given an integer array nums of unique elements, return all possible subsets (the power set).
The solution set must not contain duplicate subsets. Return the solution in any order.

Example 1:
Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]]

Using backtracking
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(0,nums,new ArrayList<>(),result);
        return result;
    }

    public List<List<Integer>> backtrack(int start,int[] nums,List<Integer> curr,List<List<Integer>> result){
        result.add(new ArrayList<>(curr));
        for(int i=start;i<nums.length;i++){
            curr.add(nums[i]);
            backtrack(i+1,nums,curr,result);
            curr.remove(curr.size()-1);
        }
        return result;
    }
}
