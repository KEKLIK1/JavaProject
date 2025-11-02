package task_7;

public class Primer {
    public static void main(String[] args) {
        MathCalculable mc = new nomer1();
        System.out.println("Длина окружности: " + ((nomer1) mc).circleLength(3));
        System.out.println("Модуль комплексного числа: " + mc.complexModulus(3, 4));
        System.out.println("Возведение в степень: " + mc.power(3, 4, 2));
    }
}
