/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employ_payroll;

/**
 *
 * @author beye
 */
public class Employ_Payroll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
        // 1. THIS ACTIVATES THE FLATLAF ENGINE
        com.formdev.flatlaf.FlatLightLaf.setup();
    } catch( Exception ex ) {
        System.err.println( "Failed to initialize LaF" );
    }
        LoginFrame login = new LoginFrame();
        login.setVisible(true);
        
    }
    
}
