package sec_03_05.step_08;

public class AsciiCharSequence implements CharSequence {
    private byte[] value;

    public AsciiCharSequence(byte[] arrayBytes) {
        value = new byte[arrayBytes.length];
        System.arraycopy(arrayBytes, 0, value, 0, value.length);
    }

    @Override
    public int length() {
        return value.length;
    }

    @Override
    public char charAt(int index) {
        return (char) value[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] tmp = new byte[end - start];
        for (int i = start; i < end; i++)
            tmp[i - start] = value[i];
        return new AsciiCharSequence(tmp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (byte b : value)
            sb.append((char) b);
        return sb.toString();
    }
}