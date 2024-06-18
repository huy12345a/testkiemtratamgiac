package test;


import org.junit.jupiter.api.Test;
import src.Triangle;

public class TriangleTests {
    @Test
    public void testTriangleWithEdgAIsZero() {
        int a = 0;
        int b = 3;
        int c = 4;
        String expected = "Gia tri dau vao khong thoa man";
        String actual = Triangle.checkTriangle(a, b, c);
        assert expected.equals(actual);
    }
    @Test
    public void testTriangleWithEdgBIsZero() {
        int a = 3;
        int b = 0;
        int c = 2;
        String expected = "Gia tri dau vao khong thoa man";
        String actual = Triangle.checkTriangle(a, b, c);
        assert expected.equals(actual);
    }
    @Test
    public void testTriangleWithEdgCIsZero() {
        int a = 1;
        int b = 4;
        int c = 0;
        String expected = "Gia tri dau vao khong thoa man";
        String actual = Triangle.checkTriangle(a, b, c);
        assert expected.equals(actual);
    }
    @Test
    public void testTriangleWithEdgAIsNegative() {
        int a = -2;
        int b = 4;
        int c = 5;
        String expected = "Gia tri dau vao khong thoa man";
        String actual = Triangle.checkTriangle(a, b, c);
        assert expected.equals(actual);
    }
    @Test
    public void testTriangleWithEdgBIsNegative() {
        int a = 2;
        int b = -1;
        int c = 6;
        String expected = "Gia tri dau vao khong thoa man";
        String actual = Triangle.checkTriangle(a, b, c);
        assert expected.equals(actual);
    }
    @Test
    public void testTriangleWithEdgCIsNegative() {
        int a = 4;
        int b = 2;
        int c = -3;
        String expected = "Gia tri dau vao khong thoa man";
        String actual = Triangle.checkTriangle(a, b, c);
        assert expected.equals(actual);
    }
    @Test
    public void testNotIsTriangleEdgA(){
        int a = 1;
        int b = 2;
        int c = 3;
        String expected = "khong phai la tam giac";
        String actual = Triangle.checkTriangle(a, b, c);
        assert expected.equals(actual);
    }
    @Test
    public void testNotIsTriangleEdgB(){
        int a = 3;
        int b = 1;
        int c = 2;
        String expected = "khong phai la tam giac";
        String actual = Triangle.checkTriangle(a, b, c);
        assert expected.equals(actual);
    }
    @Test
    public void testNotIsTriangleEdgC(){
        int a = 1;
        int b = 3;
        int c = 2;
        String expected = "khong phai la tam giac";
        String actual = Triangle.checkTriangle(a, b, c);
        assert expected.equals(actual);
    }
    @Test
    public void testIsTriangle(){
        int a = 2;
        int b = 4;
        int c = 3;
        String expected = "la tam giac";
        String actual = Triangle.checkTriangle(a, b, c);
        assert expected.equals(actual);
    }
    @Test
    public void testIsIsoscelesTriangleEdgeA(){
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "la tam giac can";
        String actual = Triangle.checkTriangle(a, b, c);
        assert expected.equals(actual);
    }
    @Test
    public void testIsIsoscelesTriangleEdgeB(){
        int a = 2;
        int b = 3;
        int c = 3;
        String expected = "la tam giac can";
        String actual = Triangle.checkTriangle(a, b, c);
        assert expected.equals(actual);
    }
    @Test
    public void testIsIsoscelesTriangleEdgeC(){
        int a = 2;
        int b = 3;
        int c = 2;
        String expected = "la tam giac can";
        String actual = Triangle.checkTriangle(a, b, c);
        assert expected.equals(actual);
    }
    @Test
    public void testIsEquilateralTriangleEdge(){
        int a = 3;
        int b = 3;
        int c = 3;
        String expected = "la tam giac deu";
        String actual = Triangle.checkTriangle(a, b, c);
        assert expected.equals(actual);
    }

}
