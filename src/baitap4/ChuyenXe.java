/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

/**
 *
 * @author DELL
 */
public abstract class ChuyenXe 
{
    String maSoChuyen;
    String hoTenTaiXe;
    String soXe;
    double doanhThu;

    public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void inThongTinChuyenXe()
    {
        System.out.println("Mã Số Chuyến Xe: " +maSoChuyen+"\n"+
                           "Họ Tên Tài Xế: "+hoTenTaiXe+"\n"+
                           "Số xe: "+soXe);
    }

            
}
