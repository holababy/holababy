import javax.swing.*;
public class Main {
    public static void main(String[] args) throws Exception {
    OptionPane();  
        
    }


public static void  OptionPane(){  
        JFrame f;
        f=new JFrame();   
        int n1=Integer.parseInt(JOptionPane.showInputDialog(f,"Ingrese el primer número:"));      
        int n2=Integer.parseInt(JOptionPane.showInputDialog(f,"Ingrese el segundo número:"));  
        
        if (n1<n2)
        JOptionPane.showMessageDialog( f,"El número "+ n1+ " es menor que el número " + n2 );
       else
       if (n1>n2)
       JOptionPane.showMessageDialog( f,"El número "+ n1+ " es mayor que el número " + n2 );
             
       else
       JOptionPane.showMessageDialog( f,"El número "+ n1+ " es igual al número " + n2);
        

    }  }