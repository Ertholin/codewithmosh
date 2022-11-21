package array;

import java.util.Arrays;

public class Array {
    private int[] items;
    private int count;
    public Array(int length){
        items = new int[length];
    }


    public void insert(int item){
        if(count == items.length){
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];

            items = newItems;
        }
        items[count++] = item;
    }

    public void removeAt(int index){
        if(index < 0 || index >= count)
            throw new IllegalArgumentException();
        for (int i = index; i < count; i++)
            items[i] = items[i+1];
        count--;
    }

    public int indexOf(int item){
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;
            return -1;

    }

    public int max(){
        int itemMax = items[1];
        for (int i = 0; i < count; i++) {
            if(itemMax < items[i])
                itemMax = items[i];
        }
        return itemMax;
    }

    public int[] intersect(int items2[]){
        int comItem[] = new int[count];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < items2.length; j++) {
                if(items[i] == items2[j]){
                    comItem[i] = items[i];
                }
            }
        }
        return comItem;
    }

    public void reverse(){
        for (int i = count-1; i >= 0  ; i--) {
            System.out.println(items[i]);
        }
    }


//    public void insertAt(int item, int index){
//        int[] newItems = new int[count + 1];
//        if(index < 0 || index > count)
//            throw new IllegalArgumentException();
//
//        for (int i = 0; i < count; i++) {
//            newItems[i] = items[i];
//        }
//        newItems[index] = item;

//        for (int i = count - 1; i > index; i--) {
//            items[i] = items[i - 1];
//        }
//        items[index] = item;
//
//
//    }


    public void insertAt(int item, int index){
        int[] newItems = new int[count + 1];
        for (int i = 0; i < count + 1; i++) {
            if (index < 0 || index > count + 2) {
                throw new IllegalArgumentException();
            }
            if(i < index - 1)
                newItems[i] = items[i];
            else if (i == index - 1)
                newItems[i] = item;
            else
                newItems[i] = items[i - 1];

        }
        System.out.println("New array.Array after insertion");
        for (int i = 0; i < count + 1; i++) {
            System.out.println(newItems[i]);
        }


    }

    public void print(){
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}
