package Form;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Kiki
 */
public class aksesLogin {
    private static String username;
    private static String password;
    private static String nama;
    private static String jabatan;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        aksesLogin.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        aksesLogin.password = password;
    }

    public static String getNama() {
        return nama;
    }

    public static void setNama(String nama) {
        aksesLogin.nama = nama;
    }
    public static void setJabatan(String jabatan){
        aksesLogin.jabatan=jabatan;
    }
    public static String getJabatan(){
        return jabatan;
    }
    
    public static void hapusakses(){
        username="";
        password="";
        nama="";
        jabatan="";
    }

   
}
  