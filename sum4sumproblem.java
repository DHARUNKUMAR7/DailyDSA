package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sum4sumproblem {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> ans=new ArrayList<List<Integer>>();
        int n= nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int start=j+1,end=n-1;
                while (start<end){
                    int target1=target-(nums[j]+nums[i]);
                    if(nums[start]+nums[end]<target1){
                        start++;
                    }
                    else if(nums[start]+nums[end]>target1){
                        end--;
                    }
                    else{
                        List<Integer> quad=new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[start]);
                        quad.add(nums[end]);
                        ans.add(quad);

                        while(start<end&&nums[start]== quad.get(2))
                            start++;
                        while(start<end&&nums[end]== quad.get(3))
                            end--;


                    }

                }
                int k=j;
                while(j<n&&nums[j]==nums[k]){
                    j++;
                }
                j--;
            }
            int l=i;
            while(i<n&&nums[i]==nums[l]){
                i++;
            }
            i--;
        }
        return ans;
    }
}
