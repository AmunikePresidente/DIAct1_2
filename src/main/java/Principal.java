
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ismaelperez
 */
public class Principal {
    
      
    public static void main(String args[], boolean rootPaneCheckingEnabled) {
         
       
        java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
             new InsertarAlumno().setVisible(true);
            }
        });
    }
        
    }
    

