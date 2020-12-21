/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awt;
import java.awt.*;
import java.awt.event.*;
class MyFrame3 extends Frame implements ItemListener{
    Label l;
    Checkbox c1,c2,c3;
    CheckboxGroup cbg;
    public MyFrame3(String name){
        super(name);
        setLayout(new FlowLayout());
        l=new Label("     None is selected     ");
        
        cbg=new CheckboxGroup();
        
        c1=new Checkbox("Spring",false,cbg);
        c2=new Checkbox("Django",false,cbg);
        c3=new Checkbox("Node.js",false,cbg);
        
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        
        add(c1);
        add(c2);
        add(c3);
        add(l);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String str="";
        if(c1.getState())
            str+=" "+c1.getLabel();
        if(c2.getState())
            str+=" "+c2.getLabel();
        if(c3.getState())
            str+=" "+c3.getLabel();
        if(str.isBlank())
            str="     None is selected     ";
        
        l.setText(str);
    }
    
}

/**
 *
 * @author hrupa
 */
public class RadioButton {
    public static void main(String args[]){
        MyFrame3 f=new MyFrame3("Radio Buttons");
        f.setSize(300, 300);
        f.setVisible(true);
    }
}
