package sec_03_04.step_09;

public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public boolean equals(Object obj) {
        ComplexNumber cn;
        if (this == obj)
            return true;
        if (obj instanceof ComplexNumber)
            cn = (ComplexNumber) obj;
        else
            return false;
        return this.re == cn.re && this.im == cn.im;
    }

    public int hashCode() {
        return (int) (re + im);
    }
}