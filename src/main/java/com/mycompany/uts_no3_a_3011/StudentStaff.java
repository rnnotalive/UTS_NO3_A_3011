/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no3_a_3011;

/**
 *
 * @author Lenovo
 */
public class StudentStaff extends Mahasiswa{
    int unitKerja;
    int jamKerja;
    
    public void pendapatan(double pendapatan){
        pendapatan = jamKerja * 30.000;
        System.out.println(pendapatan);
    }
    
    public void tampilDataStudentStaff(){
        System.out.println("NIM                 : " + nim);
        System.out.println("Nama                : " + nama);
        System.out.println("Jurusan             : " + jurusan);
        System.out.println("IPK                 : " + ipk);
    }
}
