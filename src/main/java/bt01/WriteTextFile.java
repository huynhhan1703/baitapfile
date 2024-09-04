/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt01;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class WriteTextFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        SanPham sp;
        ArrayList<SanPham> ds = new ArrayList<>();
        for (int i = 0; i < 3; i++)
        {
            System.out.println("Nhap san pham:"+(i+1));
            System.out.println("Nhap maso san pham:");
            String maso = sc.nextLine();
            System.out.println("Nhap ten san pham:");
            String ten = sc.nextLine();
            System.out.println("Nhap gia san pham:");
            float gia = sc.nextFloat();
            sc.nextLine();
            sp = new SanPham(maso, ten, gia);
            ds.add(sp);
        }
        try {
            FileWriter fw = new FileWriter("sanpham.txt");
            for (SanPham sv : ds) {
                fw.write(sv.getMaso() + ";" + sv.getTen() + ";" + sv.getGia() + "\n");
            }
            fw.close();
            System.out.println("Ghi file thanh công");
        } catch (Exception ex) {
            System.out.println("Loi xay ra" + ex.toString());
            System.out.println("Ghi file that bai");
        }

    }

}
