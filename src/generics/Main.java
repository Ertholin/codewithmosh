package generics;

public class Main {

    // 5- method CompareTo
    public static void main(String[] args) {
        var user1 = new User(10);
        var user2 = new User(20);

        if(user1.compareTo(user2) < 0)
            System.out.println("use1 < user2");1
    }

    // 4- Boxing & Unboxing
//    public static void main(String[] args) {
//        GenericList<Integer> numbers = new GenericList<>();
//        numbers.add(1);  // Boxing : The compiler wrap this value into an instance of the Integer class (put it into a box)
//        int number = numbers.get(0); // Unboxing : The JVC extract the value
//    }


    // 3- Create a generic Class
//    public static void main(String[] args) {
//        var list = new GenericList<User>();
//        list.add(new User());
//        User user = list.get(0);
//    }


    // 2- Adding any types of ...
//    public static void main(String[] args) {
//        var list = new List();
//        list.add(1);
//        list.add("1");
//        list.add(new User());
//
//        int number = (int)list.get(1);
//    }

    // 1- Adding Only Integer
//    public static void main(String[] args) {
//        var list = new List();
//        list.add(1);
//    }
}
