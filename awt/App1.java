/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awt;
import java.awt.*;

/**
 *
 * @author hrupa
 */
public class App1 {
    public static void main(String args[]){
        Frame f=new Frame("Application");
        f.setLayout(new FlowLayout());
        
        
        //COMPONENTS
        TextField tf1=new TextField(35);
        TextField tf2=new TextField(35);
        
        Label l1=new Label("First Name:");
        Label l2=new Label("Last Name:");
        
        Button b=new Button("Submit");
        
        //REQUIRED IF setLayout is null
        /*l1.setBounds(30,150,80,50);
        l2.setBounds(30,210,80,50);
        t1.setBounds(100,150,200,50);
        t2.setBounds(100,210,200,50);*/
        
        f.add(l1);
        f.add(tf1);
        f.add(l2);
        f.add(tf2);
        f.add(b);
        
        f.setSize(400,400);
        f.setVisible(true);
        
        
    }
}
