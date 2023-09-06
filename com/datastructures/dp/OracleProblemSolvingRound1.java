package com.com.datastructures.dp;

import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

public class OracleProblemSolvingRound1 {

    public static void main(String[] args) {
        int[] arr = {5, 5, 5, 3, 3, 3, 4, 4, 4, 4};
        System.out.println("length "+arr.length);
        sortByMaxCount(arr);
        int[] sort = sort(arr);
        for (int curr: sort){
            System.out.print("from other function :"+curr);
        }

    }

    private static void sortByMaxCount(int[] arr) {
        int[] countArray = new int[100];
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == null) {
                map.put(arr[i], 1);
            } else {
                count = map.get(arr[i]);
                count++;
                map.put(arr[i], count);
            }
        }
        //map is filled
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        List<Map.Entry<Integer, Integer>> collect = entries.stream()
                .sorted((o1, o2) -> o2.getValue() - o1.getValue())
                .collect(Collectors.toList());
        for (Map.Entry<Integer, Integer> entry : collect) {
            for (int i = 0; i < entry.getValue(); i++) {
                System.out.println(entry.getKey());
            }
        }


    }
    private static int[] sort(int[] arr){

        return new int[]{arr[0],arr[4]};
    }


}
