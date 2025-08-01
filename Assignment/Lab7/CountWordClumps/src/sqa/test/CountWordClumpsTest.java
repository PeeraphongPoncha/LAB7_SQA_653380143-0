package sqa.test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import sqa.main.CountWordClumps;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountWordClumpsTest {

    private static Stream<Arguments> clumpTestCases() {
        return Stream.of(
            Arguments.of(null, 0),                  
            Arguments.of(new int[]{}, 0),           
            Arguments.of(new int[]{1, 2, 2}, 1),     
            Arguments.of(new int[]{1, 1, 1}, 1)      
        );
    }

    @DisplayName("Count Word Clumps Test Case")
    @ParameterizedTest(name = "TC0{index} : input= {0}, Expected= {1}")
    @MethodSource("clumpTestCases")
    void testCountClumpsParameterized(int[] nums, int expected) {
        int actual = CountWordClumps.countClumps(nums);
        assertEquals(actual , expected );
    }
}