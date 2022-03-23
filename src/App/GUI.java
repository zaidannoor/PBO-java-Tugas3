/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import static java.lang.Float.parseFloat;
/**
 *
 * @author Lenovo
 */
public class GUI extends JFrame implements ActionListener {
    //deklarasi label
    JLabel lblLength, lblWidth, lblHeight,lblResult,lblSA,lblSC,lblCV,lblCSA,judul;
    JLabel SA,SC,CV,CSA;
    // deklarasi text field
    JTextField FLength, FWidth, FHeight; 
    // deklarasi button
    JButton BCount,BReset;
    
    
    public GUI(){
        setSize(350,450);
        setDefaultCloseOperation(3);
       // setLocation (100,100);
        setLocationRelativeTo(null);  
        setLayout(null);
        setResizable (false);
        setVisible(true);
        
        judul = new JLabel("Cuboid Calculator");
        lblLength = new JLabel("Length");
        lblWidth = new JLabel("Width");
        lblHeight = new JLabel("Height");
        lblResult = new JLabel("Result : ");
//        lblSA = new JLabel();
//        lblSC = new JLabel();
//        lblCV = new JLabel();
//        lblCSA = new JLabel();
        SA = new JLabel();
        SC = new JLabel();
        CV = new JLabel();
        CSA = new JLabel();
            
        FLength = new JTextField();
        FWidth = new JTextField();
        FHeight = new JTextField();
        
        BCount = new JButton("Count");
        BReset = new JButton("Reset");
        
        BCount.addActionListener(this); 
        BReset.addActionListener(this); 
        
        add(lblLength);
        add(lblWidth);
        add(lblHeight);
        add(lblResult);
        add(SA);
        add(SC);
        add(CV);
        add(CSA);
//        add(lblSA);
//        add(lblSC);
//        add(lblCV);
//        add(lblCSA);
        add(FLength);
        add(FWidth);
        add(FHeight);
        add(BCount);
        add(BReset);
        
        
        judul.setBounds(100,5,200,20);
        lblLength.setBounds(25, 50, 200, 20);
        lblWidth.setBounds(25, 125, 200, 20);
        lblHeight.setBounds(25, 200, 200, 20);
        FLength.setBounds(100, 50, 150, 20);
        FWidth.setBounds(100, 125, 150, 20);
        FHeight.setBounds(100, 200, 150, 20);
        BCount.setBounds(65, 375, 75, 20);
        BReset.setBounds(175, 375, 75, 20);
        lblResult.setBounds(100, 225, 100, 50);
        SA.setBounds(10, 250, 300, 50);
        SC.setBounds(10, 275, 300, 50);
        CV.setBounds(10, 300, 300, 50);
        CSA.setBounds(10, 325, 300, 50);
          
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        ErrorHandling er = new ErrorHandling();
        
        
        if(e.getSource() == BCount){
            float p = 0, l = 0 , t = 0;
             
            try{   
             t = parseFloat(this.FHeight.getText());
             }catch(NumberFormatException x){
             er.erTinggi(this.FHeight.getText());
             
             }
            
            try{   
             p = parseFloat(this.FLength.getText());
             }catch(NumberFormatException x){
             er.erPanjang(this.FLength.getText());
             
             }
            
            try{   
             l = parseFloat(this.FWidth.getText());
             }catch(NumberFormatException x){
             er.erLebar(this.FWidth.getText());
          
             }
            
            if(t > 0 && p > 0 && l > 0){  
                Balok balok = new Balok(t,p,l);
                SA.setText("Square Area   =  " + String.valueOf(balok.HitungLuas()));
                SC.setText("Square Circumstance   =  " + String.valueOf(balok.HitungKeliling()));
                CV.setText("Cuboid Volume =  " + String.valueOf(balok.HitungVolume()));
                CSA.setText("Cuboid Surface Area  =  " + String.valueOf(balok.HitungLuas(p,l,t)));       
            }
             
        }
        if(e.getSource() == BReset){
            FLength.setText("");
            FWidth.setText("");
            FHeight.setText("");
            SA.setText("");
            SC.setText("");
            CV.setText("");
            CSA.setText("");
        }
    }
    
}
