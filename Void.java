/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author Dhimaz Nur Ramadhan
 */
public class Void {
    String nama,makan,berkembangbiak;
    int pilihan;
    
    
    void isi(){
        System.out.println("Berikut adalah program untuk mengidentifikasi hewan");
        System.out.println("====================================================");
        Scanner in = new Scanner(System.in);
        
        System.out.print("1) Masukkan nama hewan : ");
        nama = in.nextLine();
        
        System.out.print("2) Hewan tersebut adalah pemakan : ");
        makan = in.nextLine();
        
        if(makan.equals("daging")){
            System.out.println(   nama+ " termasuk jenis Karnivora");
        }
        else if(makan.equals("sayuran")){
            System.out.println(   nama+ " termasuk jenis Herbivora");
        }   
        else{
            System.out.println(   nama+ " termasuk jenis Omnivora");}
    }

    void tampil(){
        Scanner input = new Scanner (System.in);
        System.out.println("3) Pilhlah fakta yang sesusai dengan "+nama);
        String[]fakta ={"Beranak","Bertelur","Beranak dan Bertelur"};
        
        for (int a=0; a<fakta.length;a++){
            System.out.println(  (a+1) + ". " +fakta[a]); 
        }
        System.out.println("Pilih fakta diatas yang benar : ");
        pilihan = input.nextInt();
        if(pilihan==1){
            System.out.println(   nama+ " termasuk jenis Vivipar");
        }
        else if(pilihan==2){
            System.out.println(   nama+ " termasuk jenis Ovipar");
        }   
        else if(pilihan==3){
            System.out.println(   nama+ " termasuk jenis Ovovivipar");
        }
    }
}

