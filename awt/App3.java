/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awt;
import java.awt.*;
import java.awt.event.*;
class MyFrame2 extends Frame implements ActionListener{
    int count=0;
    Label l;
    Button b;
    public MyFrame2(){
        super("Action Listener");
        l=new Label("   "+count);
        b=new Button("Click");
        b.addActionListener(this);
        
        setLayout(new FlowLayout());
        add(l);
        add(b);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText("   "+count);
    }
    
}
/**
 *
 * @author hrupa
 */
public class App3 {
    public static void main(String args[]){
        MyFrame2 f=new MyFrame2();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
