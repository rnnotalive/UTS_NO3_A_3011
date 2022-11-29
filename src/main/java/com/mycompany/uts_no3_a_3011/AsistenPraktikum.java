/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no3_a_3011;

/**
 *
 * @author Lenovo
 */
public class AsistenPraktikum extends Mahasiswa{
    String mkAsitensi;
    int jumlahPertemuan;
    
    public void pendapatan(double pendapatan){
        pendapatan = jumlahPertemuan * 50.000;
        System.out.println(pendapatan);
    }
    
    public void tampilDataAsistenPraktikum(){
        System.out.println("NIM                 : " + nim);
        System.out.println("Nama                : " + nama);
        System.out.println("Jurusan             : " + jurusan);
        System.out.println("IPK                 : " + ipk);
    }
}
