package com.fasttrack;

import java.util.ArrayList;
import java.util.List;

public class ExtraMile {
    public int minMax(List <List < Integer>> lists ){
        int max = (lists.get(0)).get(0);
        int min = Integer.MAX_VALUE;
        for(int i=0; i< lists.size(); i++){
            for(int j=0; j<(lists.get(i)).size(); j++){
                max = max < (lists.get(i)).get(j) ? (lists.get(i)).get(j) : max;


            }
            min = min > max ? max : min;


        }

        return min;
    }
}
