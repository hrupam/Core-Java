/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hrupa
 */

package awt;
import java.awt.*;

class MyFrame extends Frame{
    TextField tf;
    Label l;
    Button b;
    public MyFrame(){
        super("Application");
        setLayout(new FlowLayout());
        tf=new TextField(20);
        l=new Label("Name");
        b=new Button("OK");
        
        add(l);
        add(tf);
        add(b);
    }
}


public class App2 {
    public static void main(String args[]){
        MyFrame f=new MyFrame();
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
