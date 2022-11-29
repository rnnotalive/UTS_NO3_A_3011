/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no3_a_3011;

/**
 *
 * @author Lenovo
 */
public class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    int ipk;
    
    public void tampilDataMahasiswa(){
        System.out.println("NIM                 : " + nim);
        System.out.println("Nama                : " + nama);
        System.out.println("Jurusan             : " + jurusan);
        System.out.println("IPK                 : " + ipk);
    }
}