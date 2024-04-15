import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.prograd.TotalCommission;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TotalCommissionTest {
    TotalCommission commission;
    @BeforeEach
    void init(){
        commission = new TotalCommission();
    }

    @Test
    void shouldReturnEighteenThousandsWhenSalesMadeIsSixtyThousands(){
        double expectedCommission = 18000.0;
        double actualCommission = commission.getTotalCommission(60000);
        assertEquals(expectedCommission, actualCommission);
    }

    @Test
    void shouldReturnTenThousandsWhenSalesMadeIsFiftyThousands(){
        double expectedCommission = 10000.0;
        double actualCommission = commission.getTotalCommission(50000);
        assertEquals(expectedCommission, actualCommission);
    }

    @Test
    void shouldReturnSixThousandsWhenSalesMadeIsFortyThousands(){
        double expectedCommission = 6000.0;
        double actualCommission = commission.getTotalCommission(40000);
        assertEquals(expectedCommission, actualCommission);
    }

    @Test
    void shouldReturnThreeThousandsWhenSalesMadeIsThirtyThousands(){
        double expectedCommission = 3000.0;
        double actualCommission = commission.getTotalCommission(30000);
        assertEquals(expectedCommission, actualCommission);
    }

    @Test
    void shouldReturnSixteenHundredsWhenSalesMadeIsTwentyThousands(){
        double expectedCommission = 1600.0;
        double actualCommission = commission.getTotalCommission(20000);
        assertEquals(expectedCommission, actualCommission);
    }

    @Test
    void shouldReturnFiveHundredsWhenSalesMadeIsTenThousands(){
        double expectedCommission = 500.0;
        double actualCommission = commission.getTotalCommission(10000);
        assertEquals(expectedCommission, actualCommission);
    }

    @Test
    void shouldReturnZeroWhenSalesMadeIsZero(){
        double expectedCommission = 0;
        double actualCommission = commission.getTotalCommission(0);
        assertEquals(expectedCommission, actualCommission);
    }

    @Test
    void shouldReturnMinusOneWhenSalesMadeIsNegative(){
        double expectedCommission = -1;
        double actualCommission = commission.getTotalCommission(-10000);
        assertEquals(expectedCommission, actualCommission);
    }
}