package org.lab8.entity;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.lab8.entity.PermutateArray.perms;

import java.util.List;

import org.junit.jupiter.api.Test;

public class PermsTest {
    @Test   
    void testPerms() {
        int[] inputNums1 = {1, 2, 3};
        List<List<Integer>> result1 = List.of(
            List.of(1, 2, 3),
            List.of(1, 3, 2),
            List.of(2, 1, 3),
            List.of(2, 3, 1),
            List.of(3, 1, 2),
            List.of(3, 2, 1)
        );

        int[] inputNums2 = {5, 4, 6};
        List<List<Integer>> result2 = List.of(
            List.of(5, 4, 6),
            List.of(5, 6, 4),
            List.of(4, 5, 6),
            List.of(4, 6, 5),
            List.of(6, 5, 4),
            List.of(6, 4, 5)
        );

        int[] inputNums3 = {10, 11};
        List<List<Integer>> result3 = List.of(
            List.of(10, 11),
            List.of(11, 10)
        );

        assertAll(
            () -> assertEquals(result1, perms(inputNums1)),
            () -> assertEquals(result2, perms(inputNums2)),
            () -> assertEquals(result3, perms(inputNums3))
        );
    }
}
