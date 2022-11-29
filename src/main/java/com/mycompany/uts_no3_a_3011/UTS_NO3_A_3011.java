/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no3_a_3011;

/**
 *
 * @author Lenovo
 */
public class UTS_NO3_A_3011 {

    public static void main(String[] args) {
        StudentStaff ss = new StudentStaff();
        AsistenPraktikum ap = new AsistenPraktikum();
        
        ss.nim = "111";
        ss.nama = "Esa";
        ss.jurusan = "Sistem Informasi";
        ss.ipk = "3.55"
        
        ap.nim = "112";
        ap.nama = "Harvey";
        ap.jurusan = "Sistem Informasi";
        ap.ipk = "3.54";
        
        ss.tampilDataStudentStaff();
        ss.pendapatan(0);
        ap.tampilDataAsistenPraktikum();
        ap.pendapatan(0);
    }
}
