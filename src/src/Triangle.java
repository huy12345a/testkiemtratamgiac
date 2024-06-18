package src;

public class Triangle {
    public static String checkTriangle(int a, int b, int c) {

        if (a <= 0 || b <= 0 || c <= 0) {
            return "Gia tri dau vao khong thoa man";
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "khong phai la tam giac";
        }
        if (a == b && a == c)
            return "la tam giac deu";
        if (a == b || b == c || c == a) {
            return "la tam giac can";
        }
        return "la tam giac";
    }
}
