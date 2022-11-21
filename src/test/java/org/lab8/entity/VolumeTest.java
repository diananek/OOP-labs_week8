package org.lab8.entity;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.lab8.entity.WaterVolume.calcVolume;

public class VolumeTest {
    @Test
    void testVolume() {
        List<Integer> inputNums1 = List.of(1, 8, 6, 2, 5, 4, 8, 3, 7);
        int result1 = 49;
        
        List<Integer> inputNums2 = List.of(1, 1);
        int result2 = 1;

        List<Integer> inputNums3 = List.of(4, 3, 2, 1, 4);
        int result3 = 16;

        List<Integer> inputNums4 = List.of(1, 2, 1);
        int result4 = 2;

        assertAll(
            () -> assertEquals(result1, calcVolume(inputNums1)),
            () -> assertEquals(result2, calcVolume(inputNums2)),
            () -> assertEquals(result3, calcVolume(inputNums3)),
            () -> assertEquals(result4, calcVolume(inputNums4))
        );
    }
}
