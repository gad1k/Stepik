package sec_09_object_class.step_04;

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

    @Override
    public int hashCode() {
        return (int) (re + im);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ComplexNumber))
            return false;
        return Math.abs(this.re - ((ComplexNumber) obj).re) < 0.001 &&
                Math.abs(this.im - ((ComplexNumber) obj).im) < 0.001;
    }
}