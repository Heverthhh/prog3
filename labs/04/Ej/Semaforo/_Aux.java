import static java.lang.Thread.sleep;
import java.awt.Color;
import javax.swing.*;

public class Aux implements Runnable {
    public boolean rep;
    public JButton rojo;
    public JButton amarillo;
    public JButton verde;
    public JTextField texto;
    public int num=0, temp1=0, temp2=0, temp3=0, temp4=0;
   
    public Aux(JButton entrada1, JButton entrada2, JButton entrada3, JTextField entrada4){
        this.rojo=entrada1;
        this.amarillo=entrada2;
        this.verde=entrada3;
        this.texto=entrada4;
    }

 @Override
    public void run() {
        while (rep){
            num++;
            if (num>=1 && num<=20){
                temp1++;
                texto.setText(" "+temp1);
            }
            if(num==1){
                rojo.setBackground(Color.red);
                amarillo.setBackground(Color.gray);
                verde.setBackground(Color.gray);
            }
            
            
            if(num>20 && num<=23){
                temp2++;
                texto.setText(" "+temp2);
            }
             if(num==20){
                rojo.setBackground(Color.gray);
                amarillo.setBackground(Color.yellow);
                verde.setBackground(Color.gray);
            }
             
             
             if(num>23 && num<=48){
                temp3++;
                texto.setText(" "+temp3);
            }
             if(num==23){
                rojo.setBackground(Color.gray);
                amarillo.setBackground(Color.gray);
                verde.setBackground(Color.green);
            }
            
             
            if(num>48 && num<=51){
                temp4++;
                texto.setText(" "+temp4);
            }
             if(num==48){
                rojo.setBackground(Color.gray);
                amarillo.setBackground(Color.yellow);
                verde.setBackground(Color.gray);
            }
            if(num==52){
                num=0;
                temp1=0;
                temp2=0;
                temp3=0;
                temp4=0;
            }
            try{
                sleep(1000);
            }catch (InterruptedException e){}
        }
    }
    
    public void start(){
        rep=true;
        new Thread(this).start();
    }
    
}
