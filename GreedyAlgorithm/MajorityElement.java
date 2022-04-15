package com.practice.interviewbit.random;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String [] args){

        MajorityElement obj = new MajorityElement();
        int[] array = {2,2,1};
        System.out.println(obj.getMajorityElement(array));


    }


    public int getMajorityElement(final int[] A ){
        int finalresult = 0;
        int len = A.length;
        int flornum = len/2;

        Map<Integer, Integer> intergerToCountMap = new HashMap<>();

        for(int i =0 ; i< A.length; i++){
            if(intergerToCountMap.containsKey(A[i])){
                intergerToCountMap.put(A[i], intergerToCountMap.get(A[i]) + 1);
            }else{
                intergerToCountMap.put(A[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> item: intergerToCountMap.entrySet()){
            if(item.getValue()>flornum){
                finalresult = item.getKey();
            }
        }

        return finalresult;
    }




}
