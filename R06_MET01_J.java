public class R06_MET01_J {
    public static int getAbsAdd(int x, int y) {
        assert x != Integer.MIN_VALUE;
        assert y != Integer.MIN_VALUE;

        int absX = Math.abs(x);
        int absY = Math.abs(y);

        assert (absX <= Integer.MAX_VALUE - absY);
        return absX + absY;
    }

    public static void main(String[] args) {
        System.out.println(getAbsAdd(3, 4));
    }
}