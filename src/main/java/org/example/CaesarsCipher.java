package org.example;

public class CaesarsCipher {
    public static String caesar(String in, int key, boolean encrypt) {
        if (in == null || in.isEmpty())
            return null;

        char[] out = new char[in.length()];
        for (int i = 0; i < in.length(); i++) {
            out[i] = (char) (in.charAt(i) + ((encrypt) ? key : -key));
        }
        return new String(out);
    }

    private static void shifter(int[] a, int n) {
        n %= a.length;
        int shift = a.length + n;
        shift %= a.length;
        for (int i = 0; i < shift; i++) {
            int temp = a[a.length - 1];
            System.arraycopy(a, 0, a, 1, a.length - 1);
            a[0] = temp;
        }
    }
}