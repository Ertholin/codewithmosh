package generics;

public class List {

    // If wanted to store any types of Objects
    private Object[] items = new Object[10];
    private int count;

    public void add(Object item){
        items[count++] = item;
    }

    public Object get(int index){
        return items[index];
    }

    // 1- Create a tab of item
//    private int[] items = new int[10];
//    private int count;
//
//    public void add(int item){
//        items[count++] = item;
//    }
//
//    public int get(int index){
//        return items[index];
//    }
}
