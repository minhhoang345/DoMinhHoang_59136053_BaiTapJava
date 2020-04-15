/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author DELL
 */
public class BaiTap3Main 
{
    public static void main(String[] args) {
        SinhVienPoly svIT = new SinhVienIT(8, 7.5, 6, "Đỗ Minh Hoàng", "Công Nghệ Thông Tin");
        SinhVienPoly svPoly = new SinhVienIT(10, 8, 7.5, "Thái Thành Đạt", "Công Nghệ Thông Tin");
        SinhVienPoly svBiz = new SinhVienBiz(10, 9, "Phan Văn Vương", "Kế Toán");
        svIT.xuat();
        svPoly.xuat();
        svBiz.xuat();
    }
    
    
  
   
            
 
    
}
