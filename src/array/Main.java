package array;

public class Main {
    public static void main(String[] args) {
//        int numbers[] = {10, 20, 30};
//        System.out.println(numbers.length);
//        System.out.println(Arrays.toString(numbers));

        Array array = new Array(3);
        Array array1 = new Array(3);
        array.insert(10);
        array.insert(30);
        array.insert(42);
        array.insert(8);
        //array.print();

        /*array1.insert(21);
        array1.insert(32);
        array1.insert(43);*/


        // array.removeAt(3);
        //array.indexOf(10);
        //System.out.println(array.indexOf(30));
        //System.out.println(array.max());
        //array.print();
        //array1.print();
        //System.out.println(Arrays.toString(array.intersect(new int[]{10, 6, 6})));
        //array.reverse();
        array.insertAt(18, 3);
        //array.print();

        //System.out.println(5/3f);

    }
}