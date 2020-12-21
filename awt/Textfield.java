/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awt;
import java.awt.*;
import java.awt.event.*;

class MyFrame5 extends Frame {
    Label l1,l2;
    TextField tf;
    public MyFrame5(String name){
        super(name);
        setLayout(new FlowLayout());
        
        tf=new TextField(20);
        l1=new Label("TextField is blank");
        l2=new Label("Enter key is not pressed");
        
        add(l1);
        add(tf);
        add(l2);
        
        Handler h=new Handler();
        
        tf.addTextListener(h);
        tf.addActionListener(h);
    }
    class Handler implements ActionListener,TextListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            l2.setText(tf.getText());
        }

        @Override
        public void textValueChanged(TextEvent e) {
            l1.setText(tf.getText());
        }
    }

}
/**
 *
 * @author hrupa
 */
public class Textfield {
    public static void main(String args[]){
        MyFrame5 f=new MyFrame5("Textfield ActionListening");
        f.setSize(400,400);
        f.setVisible(true);
    }
}
