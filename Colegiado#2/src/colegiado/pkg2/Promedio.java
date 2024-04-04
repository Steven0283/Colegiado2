/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colegiado.pkg2;

/**
 *
 * @author Aulas Heredia
 */
public class Promedio {

    private String studentName;
    private String course;
    private String teacherName;
    private int grade;

    public Promedio() {
    }

    public Promedio(String studentName, String course, String teacherName, int grade) {
        this.studentName = studentName;
        this.course = course;
        this.teacherName = teacherName;
        this.grade = grade;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Promedio{" + "studentName=" + studentName + ", course=" + course + ", teacherName=" + teacherName + ", grade=" + grade + '}';
    }

    
}
