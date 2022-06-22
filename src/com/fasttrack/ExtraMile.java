package com.fasttrack;

import java.util.ArrayList;
import java.util.List;

public class ExtraMile {
    List <Integer> maxList = new ArrayList<>();
    public int minMax(List <List < Integer>> lists ){
        for(int i=0; i< lists.size(); i++){
            int max = (lists.get(i)).get(0);
            for(int j=0; j<(lists.get(i)).size(); j++){
                max = max < (lists.get(i)).get(j) ? (lists.get(i)).get(j) : max;
            }
            maxList.add(max);
        }
        int min = maxList.get(0);
        for(int i=0; i<maxList.size(); i++){
            min = min > maxList.get(i) ? maxList.get(i) : min;
        }
        return min;
    }
}
