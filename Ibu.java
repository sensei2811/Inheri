/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspln2;

/**
 *
 * @author Wahyu Ari Nugroho
 */
public class Ibu {
    String nama;
    String alamat;
    int tipe;
    int bayar;
    char blok;
    int kembali;
    public void setnama(String Nama){
    this.nama=nama;   
}
public void setalamat(String alamat){
this.alamat=alamat;
}    
public void settipe(int tipe){
this.tipe=tipe;
}
public void setblok(char blok){
this.blok=blok;
}
public void setbayar(int bayar){
this.bayar=bayar;
}
public void setkembali(int kembali){
this.kembali=kembali;
}
public String getnama(){
return nama;
}
public String getalamat(){
return alamat;
 }
public int gettipe(){
return tipe;
}
public char getblok(){
return blok;
}
public int getbayar(){
return bayar;
}
public int getkembali(){
return kembali;
}
}