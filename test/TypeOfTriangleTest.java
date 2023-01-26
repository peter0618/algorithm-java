import baekjoon.geometry.TypeOfTriangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 세 각의 크기가 모두 60이면, Equilateral
 * 세 각의 합이 180이고, 두 각이 같은 경우에는 Isosceles
 * 세 각의 합이 180이고, 같은 각이 없는 경우에는 Scalene
 * 세 각의 합이 180이 아닌 경우에는 Error
 */
class TypeOfTriangleTest {

    @Test
    void equilateralTest() {
        //given
        int[] angles = new int[]{ 60, 60, 60};

        //when
        String result = TypeOfTriangle.getTypeOfTriangle(angles);

        //then
        Assertions.assertEquals("Equilateral", result);
    }

    @Test
    void errorTest() {
        //given
        int[] angles = new int[]{ 62, 61, 59};

        //when
        String result = TypeOfTriangle.getTypeOfTriangle(angles);

        //then
        Assertions.assertEquals("Error", result);
    }

    @Test
    void isoscelesTest() {
        //given
        int[] angles = new int[]{ 45, 90, 45};

        //when
        String result = TypeOfTriangle.getTypeOfTriangle(angles);

        //then
        Assertions.assertEquals("Isosceles", result);
    }

    @Test
    void scaleneTest() {
        //given
        int[] angles = new int[]{ 46, 90, 44};

        //when
        String result = TypeOfTriangle.getTypeOfTriangle(angles);

        //then
        Assertions.assertEquals("Scalene", result);
    }
}
