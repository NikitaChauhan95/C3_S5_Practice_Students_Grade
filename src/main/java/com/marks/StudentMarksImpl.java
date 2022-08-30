/*
 *Author Name: Nikita Chauhan
 *Date: 30-08-2022
 *Created With: IntelliJ IDEA Community Edition
 */


package com.marks;

public class StudentMarksImpl {
    public static void main(String[] args) {

        StudentMarks studentMarks = new StudentMarks();
        int totalMarksForMedicalPathway = studentMarks.calculateMarks(76, 67, 85, 78);
        System.out.println("totalMarksForMedicalPathway = " + totalMarksForMedicalPathway);
       /* int totalMarksForNonMedicalPathway = studentMarks.calculateMarks(66, 14, 77);
        System.out.println("totalMarksForNonMedicalPathway = " + totalMarksForNonMedicalPathway);
        double totalMarksForBusinessPathway = studentMarks.calculateMarks(54.5, 76.5, 45.5);
        System.out.println("totalMarksForBusinessPathway = " + totalMarksForBusinessPathway);
        
        */


    }

}
