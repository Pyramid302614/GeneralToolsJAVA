package ANY.Functions.Array;

public class Includes {

    public boolean includes(String[] array, String item) {
        for (String arrayItem : array) {
            if (arrayItem.equals(item)) {
                return true;
            }
        }
        return false;
    }

    public boolean includes(int[] array, int item) {
        for (int arrayItem : array) {
            if (arrayItem == (item)) {
                return true;
            }
        }
        return false;
    }

    public boolean includes(double[] array, double item) {
        for (double arrayItem : array) {
            if (arrayItem == (item)) {
                return true;
            }
        }
        return false;
    }

    public boolean includes(char[] array, char item) {
        for (char arrayItem : array) {
            if (arrayItem == (item)) {
                return true;
            }
        }
        return false;
    }

    public boolean includes(boolean[] array, boolean item) {
        for (boolean arrayItem : array) {
            if (arrayItem == (item)) {
                return true;
            }
        }
        return false;
    }

    public boolean includes(float[] array, float item) {
        for (float arrayItem : array) {
            if (arrayItem == (item)) {
                return true;
            }
        }
        return false;
    }

    public boolean includes(long[] array, long item) {
        for (long arrayItem : array) {
            if (arrayItem == (item)) {
                return true;
            }
        }
        return false;
    }

    public boolean includes(short[] array, short item) {
        for (short  arrayItem : array) {
            if (arrayItem == (item)) {
                return true;
            }
        }
        return false;
    }

}
