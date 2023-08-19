package org.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBestTimeToBuyAndSellStockII {
    @Test
    public void TestBestTimeToBuyAndSellStockII(){
        assertEquals(7, BestTimeToBuyAndSellStockII.maxProfit(new int[]{7,1,5,3,6,4}));
        assertEquals(4, BestTimeToBuyAndSellStockII.maxProfit(new int[]{1, 2, 3, 4, 5}));
    }
}
