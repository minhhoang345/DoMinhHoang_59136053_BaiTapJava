/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author DELL
 */
public class BaiTap1Main 
{
    public static void main(String[] args) 
    {
        System.out.println("--Nhân viên 1--");
        NhanVien nv1 = new NhanVien("Đỗ Minh Hoàng", 21, "15/12 Quốc Tuấn", 7000000, 300);
        System.out.println(nv1.getThongTin());
        System.out.println("--Nhân viên 2--");
        NhanVien nv2 = new NhanVien("Phạm Văn Pháp", 21, "213 New York", 3500000, 100);
        System.out.println(nv2.getThongTin());
    }
}
