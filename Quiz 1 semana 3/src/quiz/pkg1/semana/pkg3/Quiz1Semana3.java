/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz.pkg1.semana.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Quiz1Semana3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String NombreEmpleado = "";
        double SalarioCompleto = 0;
        double MontoSEM = 0;
        double MontoIVM = 0;
        double salarioTotal = 0;
        
        String salario = "";
        NombreEmpleado = JOptionPane.showInputDialog("Escribe tu nombre");
        salario = JOptionPane.showInputDialog("Digite su salario");

        SalarioCompleto = Double.parseDouble(salario);

        MontoSEM = SalarioCompleto * 0.0925;
        MontoIVM = SalarioCompleto * 0.0508;
        salarioTotal = MontoSEM + MontoIVM;

        JOptionPane.showInternalMessageDialog(null, "El nombre del empleado es:" + NombreEmpleado + "\n"
                + "La empresa debera de abonar a la CCSS el monto de:" + salarioTotal + "\n" + "Por concepto SEM:" + MontoSEM + "\n" +
                 "Y IVM :" + MontoIVM + "\n");

    }

}
