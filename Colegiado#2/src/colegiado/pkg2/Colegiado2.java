/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colegiado.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Colegiado2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Promedio promedio[] = new Promedio[10];
        setData(promedio);
        printData(promedio);
        promedio(promedio);
    }

    public static void setData(Promedio[] array) {
        for (int i = 0; i < array.length; i++) {
            String studentName = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
            String course = JOptionPane.showInputDialog("Ingrese el nombre del curso: ");
            String teacherName = JOptionPane.showInputDialog("Ingrese el nombre del profesor: ");
            int grade = Integer.parseInt(JOptionPane.showInputDialog("Digite la nota que obtuvo el estudiante: "));
            array[i] = new Promedio(studentName, course, teacherName, grade);
        }
    }

    public static void printData(Promedio[] array) {
        for (int i = 0; i < array.length; i++) {
            JOptionPane.showMessageDialog(null, "Se presentaran los datos del estudiante #" + (i + 1) + " \n"
                    + "Nombre: " + array[i].getStudentName() + " \n"
                    + "Curso: " + array[i].getCourse() + " \n"
                    + "Nombre del profesor: " + array[i].getTeacherName() + " \n"
                    + "Nota: " + array[i].getGrade());
        }
    }
    
    public static void numMayor(Promedio[] array){
        int mayor = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getGrade() > mayor) {
                mayor = array[i].getGrade();
            }
        }
    }
    
    public static void numMenor(Promedio[] array){
        int menor = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getGrade() < menor) {
                menor = array[i].getGrade();
            }
        }
    }

    public static void promedio(Promedio[] array) {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i].getGrade();
        }
        JOptionPane.showMessageDialog(null, "El promedio de las calificaciones es = " + (total / array.length) );
        
        for (int i = 0; i < array.length; i++) {
            if (array[i].getGrade() > (total / array.length)) {
                JOptionPane.showMessageDialog(null, "Calificacion por encima del promedio: " + array[i].getStudentName() + " = " + array[i].getGrade());
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].getGrade() < (total / array.length)) {
                JOptionPane.showMessageDialog(null, "Nota por debajo del promedio: " + array[i].getStudentName() + " = " + array[i].getGrade());
            }
        }
    }
    


}
