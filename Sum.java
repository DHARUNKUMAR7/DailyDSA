package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum {
    public static void main(String[] args) {


        int[] g=new int[]{-1,0,1,2,-1,-4};
        System.out.println(findDisappearedNumbers(g));//this will not print o/p search 3 sum problem in leetcode ans put the below function
    }
    static List<List<Integer>> findDisappearedNumbers(int[] nums) {

        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            int c=nums[i];
            int start=i+1,end=n-1;
            while(start<end){
                if(nums[start]+nums[end]+c<0){
                    start++;
                }
                else if(nums[start]+nums[end]+c>0){
                    end--;
                }
                else{
                    List<Integer> ans1=new ArrayList<Integer>();
                    ans1.add(nums[i]);
                    ans1.add(nums[start]);
                    ans1.add(nums[end]);
                    ans.add(ans1);
                    int e=nums[start],f=nums[end];
                    while(start<end&&e==nums[start]) start++;
                    while(start<end&&f==nums[end]) end--;



                }
            }
            int d=nums[i];
            while(i<n&&d==nums[i]){
                i++;
            }
            i--;

        }
        return ans;

    }
}
