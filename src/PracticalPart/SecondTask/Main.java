package PracticalPart.SecondTask;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new List<Integer>();
        for (int i = 0; i < 10; i++) {
            list.pushBack(i);
        }
        System.out.println(list);

        list.del(9);
        list.del(0);
        list.del(2);
        System.out.println(list);

        list.pushFront(20);
        list.pushBack(30);
        System.out.println(list);

        list.insert(5, 55);
        list.insert(0, 1);
        list.insert(9, 2);
        System.out.println(list);

        System.out.println(list.getCount());
        list.delAll();
        System.out.println(list);
    }
}
