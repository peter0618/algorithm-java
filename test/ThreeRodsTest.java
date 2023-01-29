import baekjoon.geometry.ThreeRods;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThreeRodsTest {
    @Test
    void test1() {
        int[] numbers = new int[]{1,2,3};
        Assertions.assertEquals(5, ThreeRods.calMaxRound(numbers));
    }

    @Test
    void test2() {
        int[] numbers = new int[]{2,2,2};
        Assertions.assertEquals(6, ThreeRods.calMaxRound(numbers));
    }

    @Test
    void test3() {
        int[] numbers = new int[]{1,100,1};
        Assertions.assertEquals(3, ThreeRods.calMaxRound(numbers));
    }

    @Test
    void test4() {
        int[] numbers = new int[]{41,64,16};
        Assertions.assertEquals(113, ThreeRods.calMaxRound(numbers));
    }
}
