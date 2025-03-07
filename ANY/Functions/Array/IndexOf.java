package ANY.Functions.Array;

import java.util.Objects;

public class IndexOf {

    public int indexOf(String[] array, String item) {
        for(int i = 0; i < array.length; i++) {
            if(Objects.equals(array[i], item)) {
                return i;
            }
        }
        return -1;
    }

    public int indexOf(int[] array, int item) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public int indexOf(char[] array, char item) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public int indexOf(boolean[] array, boolean item) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public int indexOf(double[] array, double item) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public int indexOf(float[] array, float item) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public int indexOf(long[] array, long item) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public int indexOf(short[] array, short item) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == item) {
                return i;
            }
        }
        return -1;
    }

}
