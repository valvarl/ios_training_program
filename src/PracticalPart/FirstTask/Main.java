package PracticalPart.FirstTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Data> data = new ArrayList<Data>(Arrays.asList(
                new Data(1, "C"),
                new Data(1, "A"),
                new Data(2, "D"),
                new Data(1, "E"),
                new Data(2, "B")));
        System.out.println(data);
        Data.sort(data);
        System.out.println(data);
    }
}
