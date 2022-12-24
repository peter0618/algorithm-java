import baekjoon.numbers.PrimeFactorDecomposition;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PrimeFactorDecompositionTest {
    @Test
    void decompose() {
        int[] decompose = PrimeFactorDecomposition.decompose(1);
        assertEquals(0, decompose.length);
        assertTrue(Arrays.equals(new int[]{2,2,2,3,3}, PrimeFactorDecomposition.decompose(72)));
        assertTrue(Arrays.equals(new int[]{3}, PrimeFactorDecomposition.decompose(3)));
        assertTrue(Arrays.equals(new int[]{2,3}, PrimeFactorDecomposition.decompose(6)));
        assertTrue(Arrays.equals(new int[]{2}, PrimeFactorDecomposition.decompose(2)));
        assertTrue(Arrays.equals(new int[]{97, 103}, PrimeFactorDecomposition.decompose(9991)));
    }

}
