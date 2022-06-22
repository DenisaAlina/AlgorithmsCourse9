package com.fasttrack;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ExtraMile extraMile = new ExtraMile();
        List<List<Integer>> parameter = Arrays.asList(Arrays.asList(1,2,4,7,9), Arrays.asList(11, 34, 27, 40), Arrays.asList(-2, 7, -20, 34));
        System.out.println( extraMile.minMax(parameter));
    }
}
