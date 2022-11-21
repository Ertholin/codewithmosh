package oop;

public class TextBox extends UIControl{
    public String text;

//    public TextBox() {
//        super(true);
////        System.out.println("TextBox");
//    }


    @Override
    public void render() {
        System.out.println("Render a textbox");
    }

    @Override
    public String toString(){
        return text;
    }

    public void setText(String text){
        this.text = text;
    }

    public void clear(){
        text = "";
    }
}
