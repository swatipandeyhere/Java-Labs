import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.prograd.CompoundAmount;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class CompoundAmountTest{
    CompoundAmount compoundAmount;
    @BeforeEach
    void init(){
        compoundAmount = new CompoundAmount();
    }

    @Test
    void shouldReturnFortyEightThousandsOneHundredSeventyThreePointFourFourWhenPrincipalIsThirtyThousandsTimeIsSevenAndRateIsSeven(){
        double expectedCompoundAmount = 48173.44;
        double actualCompoundAmount = compoundAmount.getCompoundAmount(30000,7,7.0);
        assertThat(actualCompoundAmount, closeTo(expectedCompoundAmount, 0.05));
    }

    @Test
    void shouldReturnSixtySevenThousandsEightHundredsTwentyNinePointFiveZeroWhenPrincipalIsThirtyThousandsTimeIsTenAndRateIsEightPointFive(){
        double expectedCompoundAmount = 67829.50;
        double actualCompoundAmount = compoundAmount.getCompoundAmount(30000,10,8.5);
        assertThat(actualCompoundAmount, closeTo(expectedCompoundAmount, 0.05));
    }

    @Test
    void shouldReturnOneLakhSeventeenThousandsThirtyNinePointSixFiveWhenPrincipalIsThirtyThousandsTimeIsFifteenAndRateIsNinePointFive(){
        double expectedCompoundAmount = 117039.65;
        double actualCompoundAmount = compoundAmount.getCompoundAmount(30000,15,9.5);
        assertThat(actualCompoundAmount, closeTo(expectedCompoundAmount, 0.05));
    }

    @Test
    void shouldReturnThreeLakhsSixteenThousandsThreeHundredsFiftyTwoPointEightOneWhenPrincipalIsThirtyThousandsTimeIsTwentyAndRateIsTwelvePointFive(){
        double expectedCompoundAmount = 316352.81;
        double actualCompoundAmount = compoundAmount.getCompoundAmount(30000,20,12.5);
        assertThat(actualCompoundAmount, closeTo(expectedCompoundAmount, 0.05));
    }

    @Test
    void shouldReturnOneLakhFiftyThreeThousandsFiveHundredsSeventyFourPointTwoThreeWhenPrincipalIsThirtyThousandsTimeIsTwentyFiveAndRateIsSixPointSevenFive(){
        double expectedCompoundAmount = 153574.23;
        double actualCompoundAmount = compoundAmount.getCompoundAmount(30000,25,6.75);
        assertThat(actualCompoundAmount, closeTo(expectedCompoundAmount, 0.05));
    }

    @Test
    void shouldReturnFortyThousandsOneHundredFortyFourPointFiveThreeWhenPrincipalIsTwentyFiveThousandsTimeIsSevenAndRateIsSeven(){
        double expectedCompoundAmount = 40144.53;
        double actualCompoundAmount = compoundAmount.getCompoundAmount(25000,7,7);
        assertThat(actualCompoundAmount, closeTo(expectedCompoundAmount, 0.05));
    }

    @Test
    void shouldReturnFiftySixThousandsFiveHundredsTwentyFourPointFiveEightWhenPrincipalIsTwentyFiveThousandsTimeIsTenAndRateIsEightPointFive(){
        double expectedCompoundAmount = 56524.58;
        double actualCompoundAmount = compoundAmount.getCompoundAmount(25000,10,8.5);
        assertThat(actualCompoundAmount, closeTo(expectedCompoundAmount, 0.05));
    }

    @Test
    void shouldReturnNinetySevenThousandsFiveHundredsThirtyThreePointZeroFourWhenPrincipalIsTwentyFiveThousandsTimeIsFifteenAndRateIsNinePointFive(){
        double expectedCompoundAmount = 97533.04;
        double actualCompoundAmount = compoundAmount.getCompoundAmount(25000,15,9.5);
        assertThat(actualCompoundAmount, closeTo(expectedCompoundAmount, 0.05));
    }

    @Test
    void shouldReturnTwoLakhsSixtyThreeThousandsSixHundredsTwentySevenPointThreeFourWhenPrincipalIsTwentyFiveThousandsTimeIsTwentyAndRateIsTwelvePointFive(){
        double expectedCompoundAmount = 263627.34;
        double actualCompoundAmount = compoundAmount.getCompoundAmount(25000,20,12.5);
        assertThat(actualCompoundAmount, closeTo(expectedCompoundAmount, 0.05));
    }

    @Test
    void shouldReturnOneLakhTwentySevenThousandsNineHundredsSeventyEightPointFiveTwoWhenPrincipalIsTwentyFiveThousandsTimeIsTwentyFiveAndRateIsSixPointSevenFive(){
        double expectedCompoundAmount = 127978.52;
        double actualCompoundAmount = compoundAmount.getCompoundAmount(25000,25,6.75);
        assertThat(actualCompoundAmount, closeTo(expectedCompoundAmount, 0.05));
    }

    @Test
    void shouldReturnThirtySixThousandsEightySevenPointOneTwoWhenPrincipalIsTwentyFourThousandsTimeIsSevenAndRateIsSix(){
        double expectedCompoundAmount = 36087.12;
        double actualCompoundAmount = compoundAmount.getCompoundAmount(24000,7,6);
        assertThat(actualCompoundAmount, closeTo(expectedCompoundAmount, 0.05));
    }

    @Test
    void shouldReturnFortyTwoThousandsNineHundredsEightyPointThreeFourWhenPrincipalIsTwentyFourThousandsTimeIsTenAndRateIsSix(){
        double expectedCompoundAmount = 42980.34;
        double actualCompoundAmount = compoundAmount.getCompoundAmount(24000,10,6);
        assertThat(actualCompoundAmount, closeTo(expectedCompoundAmount, 0.05));
    }

    @Test
    void shouldReturnFiftySevenThousandsFiveHundredsSeventeenPointThreeNineWhenPrincipalIsTwentyFourThousandsTimeIsFifteenAndRateIsSix(){
        double expectedCompoundAmount = 57517.39;
        double actualCompoundAmount = compoundAmount.getCompoundAmount(24000,15,6);
        assertThat(actualCompoundAmount, closeTo(expectedCompoundAmount, 0.05));
    }

    @Test
    void shouldReturnSeventySixThousandsNineHundredsSeventyOnePointTwoFiveWhenPrincipalIsTwentyFourThousandsTimeIsTwentyAndRateIsSix(){
        double expectedCompoundAmount = 76971.25;
        double actualCompoundAmount = compoundAmount.getCompoundAmount(24000,20,6);
        assertThat(actualCompoundAmount, closeTo(expectedCompoundAmount, 0.05));
    }

    @Test
    void shouldReturnOneLakhThreeThousandsFourPointEightNineWhenPrincipalIsTwentyFourThousandsTimeIsTwentyFiveAndRateIsSix(){
        double expectedCompoundAmount = 103004.89;
        double actualCompoundAmount = compoundAmount.getCompoundAmount(24000,25,6);
        assertThat(actualCompoundAmount, closeTo(expectedCompoundAmount, 0.05));
    }
}