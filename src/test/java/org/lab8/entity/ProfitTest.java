package org.lab8.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.lab8.entity.SharesProfit.maxProfit;

import java.util.List;

public class ProfitTest {
    @Test 
    void testProfit() {
        List<Integer> inputNums1 = List.of(7, 1, 5, 3, 6, 4);
        int result1 = 5;
        
        List<Integer> inputNums2 = List.of(7, 6, 4, 3, 1);
        int result2 = 0;

        List<Integer> inputNums3 = List.of(2, 5);
        int result3 = 3;

        assertAll(
            () -> assertEquals(result1, maxProfit(inputNums1)),
            () -> assertEquals(result2, maxProfit(inputNums2)),
            () -> assertEquals(result3, maxProfit(inputNums3))
        );
    }
}
