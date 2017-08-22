/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainoff;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Alumno
 */
public class obtenerFactorialyFi extends JFrame implements ActionListener{
     JButton obtener = new JButton("Obtener");
     JTextField facto = new JTextField("");
     JTextField factoR = new JTextField(" ");
     JTextField fiboR = new JTextField(" ");
     ArrayList <setnum> listita = new ArrayList<>();
     int yalohizo = 0;
     
        

    public obtenerFactorialyFi (){
      
    }
    
    public void ventana(){
        setTitle("Obtener Factorial y Fibonacci");
        setSize(800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        elementos();
        
        
    }
    
    public void elementos(){
        JLabel texto = new JLabel("Ingresa tu numero");
        texto.setBounds(50, 50, 150, 25);
        add(texto);
        
        JLabel resultadoFa = new JLabel("Resultado Factorial");
        resultadoFa.setBounds(50, 350, 180, 25);
        add(resultadoFa);
        
        JLabel resultadoFi = new JLabel("Resultado Fibonacci");
        resultadoFi.setBounds(400, 350, 160, 25);
        add(resultadoFi);
        
        obtener.setBounds(450, 50, 100, 25);
        obtener.addActionListener(this);
        add(obtener);
        
        
        facto.setBounds(200, 50, 200, 25);
        add(facto);

        factoR.setBounds(184, 350, 200, 25);
        add(factoR);
        
        
        fiboR.setBounds(530, 350, 200, 25);
        add(fiboR);
        
        setVisible(true);
        
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        setnum setito = new setnum();
        setito.setNumero(0);
        listita.add(setito);
        setnum setito2 = new setnum();
        setito2.setNumero(1);
        listita.add(setito2);
        if(e.getSource().equals(obtener)){
            
            
            
            
            int cuantos = Integer.parseInt(facto.getText());
            int factofi = 0, suma = 0;
            if(cuantos == 0){
                factofi = 1;
            }
            for(int i = 0;i < cuantos; i++){
                if(i == 0){
                    factofi = (i+1);
                }
                factofi = factofi * (i+1);
                suma = listita.get(listita.size()-2).getNumero() + listita.get(listita.size()-1).getNumero();
                setnum nume =  new setnum();
                nume.setNumero(suma);
                listita.add(nume);
            }
            System.out.println("kk"+listita.get(listita.size()-1).getNumero());
            factoR.setText(String.valueOf(factofi));
            if(yalohizo != 0){
                fiboR.setText("");
                for(int i = 0; i < cuantos; i++){
                fiboR.setText(fiboR.getText()+"-"+listita.get(i).getNumero());
                }
            }
            else{
                for(int i = 0; i < cuantos; i++){
                fiboR.setText(fiboR.getText()+"-"+listita.get(i).getNumero());
                }
            }
            yalohizo = 1;
        }
    }
    
    
}
