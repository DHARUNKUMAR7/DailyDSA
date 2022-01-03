package com.company;

public class LARGESTNUMBER {
    public static void main(String[] args) {

    }
    public String largestNumber(int[] nums) {
        String[] s=new String[nums.length];
        int k=0;
        for(int i:nums){
            s[k++]=String.valueOf(i);
        }
        Arrays.sort(s,(a,b)->(b+a).compareTo(a+b));
        StringBuilder p=new StringBuilder();
        for(String j:s){
            p.append(j);
        }
        String o=p.toString();
        return o.startsWith("0")?"0":o;

    }
}
