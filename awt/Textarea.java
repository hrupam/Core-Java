/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awt;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author hrupa
 */
class MyFrame6 extends Frame implements ActionListener{
    TextArea ta;
    TextField tf;
    Label l;
    Button b;
    public MyFrame6(String name){
        super(name);
        
        setLayout(new FlowLayout());
        ta=new TextArea(10,20);
        tf=new TextField(30);
        l=new Label("                                       ");
        b=new Button("Click");
        b.addActionListener(this);
        
        add(ta);
        add(l);
        add(tf);
        add(b);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        l.setText(ta.getText());
        ta.insert(tf.getText(), ta.getCaretPosition());
    }
}


public class Textarea {
    public static void main(String args[]){
        MyFrame6 f=new MyFrame6("Textarea Operations");
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
