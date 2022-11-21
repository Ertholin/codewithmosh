package oop;

public class Main {

    public static void main(String[] args) {

        // Interface
//        var calculator = new TaxCalculator2018(100_000);
//        var report = new TaxReport(calculator);
//        report.show();
//
//        report.setCalculator(new TaxCalculator2019());
//        report.show();

        // Method Injection
        var calculator = new TaxCalculator2018(100_000);
        var report = new TaxReport();
        report.show(calculator);
        report.show(new TaxCalculator2019());





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
//            UIControl[] control = {new TextBox(), new CheckBox()};
//
//            for(var controls : control){
//                controls.render();
//            }


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
