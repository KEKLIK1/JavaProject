package task_7;

public class nomer1 implements MathCalculable{
    @Override
    public double power(double n, double i, int t) {
        double t_1 = n;
        double t_2 = i;
        double t_3;
        while(t > 1){
            t_3 = t_1;
            t_1 = t_1 * n - t_2 * i;
            t_2 = t_3 * i + t_2 * n;
            t -= 1;
        }
        return Math.pow(Math.pow(t_1,2) + Math.pow(t_2, 2), 0.5);
    }

    @Override
    public double complexModulus(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    public double circleLength(double radius) {
        return 2 * PI * radius;
    }
}
