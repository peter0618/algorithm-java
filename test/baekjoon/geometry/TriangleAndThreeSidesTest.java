package baekjoon.geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleAndThreeSidesTest {

    @Test
    void judgeTypeCase1() {
        int[] sides = new int[]{7,7,7};
        assertEquals("Equilateral", TriangleAndThreeSides.JudgeType(sides));
    }

    @Test
    void judgeTypeCase2() {
        int[] sides = new int[]{6,2,6};
        assertEquals("Isosceles", TriangleAndThreeSides.JudgeType(sides));
    }

    @Test
    void judgeTypeCase3() {
        int[] sides = new int[]{6,5,4};
        assertEquals("Scalene", TriangleAndThreeSides.JudgeType(sides));
    }

    @Test
    void judgeTypeCase4() {
        int[] sides = new int[]{3,2,5};
        assertEquals("Invalid", TriangleAndThreeSides.JudgeType(sides));
    }

    @Test
    void judgeTypeCase5() {
        int[] sides = new int[]{1,1,2};
        assertEquals("Invalid", TriangleAndThreeSides.JudgeType(sides));
    }
}