package com.company;
import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {

    }
    public int[][] merge(int[][] intervals) {
        List<int[]> ans=new ArrayList<>();
        if(intervals.length==0||intervals==null){
            return (new int[0][]);
        }
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int[] i:intervals){
            if(i[0]<=end){
                end=Math.max(end,i[1]);
                start=Math.min(start,i[0]);
            }
            else{
                ans.add(new int[]{start,end});
                start=i[0];
                end=i[1];
            }
        }
        ans.add(new int[]{start,end});
        return ans.toArray(new int[0][]);


    }
}
