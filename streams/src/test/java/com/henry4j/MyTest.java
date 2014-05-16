package com.henry4j;

import java.util.Arrays;

import org.junit.Test;

import com.google.common.base.Joiner;
import com.google.common.primitives.Ints;

public class MyTest {
    @Test
    public void test() {
        int[] ints = { 1, 2, 3, 4 };
        int[] even = Arrays.stream(ints).filter(i -> i % 2 == 0).toArray();
        System.out.println(Joiner.on(", ").join(Ints.asList(even)));
    }
}