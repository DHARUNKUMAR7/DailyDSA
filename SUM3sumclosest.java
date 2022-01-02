package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr=new int[]{-1,2,1,-4};
        int target =1;
        System.out.println(threeSumClosest(arr,target));
    }
    static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans=nums[0]+nums[1]+nums[nums.length-1];
        int a=0;

        for(int i=0;i<nums.length-2;i++){
            int start=i+1,end=nums.length-1;
            while(start<end){
                a=nums[i]+nums[start]+nums[end];
                if(a>target){
                    end--;
                }
                else {
                    start++;
                }
                if(Math.abs(a-target)<Math.abs(ans-target)){
                    ans=a;
                }


            }
        }
        return ans;


    }
}
