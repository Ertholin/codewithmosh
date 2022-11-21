package oop;

public class Main {

    public static void main(String[] args) {
        //new Employee()
//        var employee = new Employee(50_000, 21);
//        Employee.printNumberOfEmployees();
//        int wage = employee.calculateWage();
//        System.out.println(wage);

//        var box1 = new TextBox();
//        var box2 = new TextBox();
//        System.out.println(box1.hashCode());
//        System.out.println(box2.toString());


//        var control = new UIControl(true);
//        var textbox = new TextBox();
//        show(control);

        //Polymorphism
            UIControl[] control = {new TextBox(), new CheckBox()};

            for(var controls : control){
                controls.render();
            }


    }

//    public static void show(UIControl control) {
//        if (control instanceof TextBox){
//            var textbox = (TextBox)control;
//            textbox.setText("Hello world");
//        }
//
//        System.out.println(control);
//    }
}
