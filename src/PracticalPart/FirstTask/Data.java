package PracticalPart.FirstTask;

import java.util.ArrayList;

public class Data {
    int number;
    String name;

    public Data(int number, String name) {
        this.number = number;
        this.name = name;
    }

    private static int comp(Data d1, Data d2) {
        if (d1.number > d2.number) {
            return 1;
        } else if (d1.number < d2.number) {
            return -1;
        } else {
            return d1.name.compareTo(d2.name);
        }
    }

    public static void sort(ArrayList<Data> dt) {
        for (int left = 0; left < dt.size(); left++) {
            Data value = dt.get(left);
            int i = left - 1;
            for (; i >= 0; i--) {
                if (comp(value, dt.get(i)) < 0) {
                    dt.set(i + 1, dt.get(i));
                }else {
                        break;
                }
            }
            dt.set(i + 1, value);
        }
    }

    @Override
    public String toString() {
        return String.format("Data(number = %d; name = %s)", number, name);
    }
}
