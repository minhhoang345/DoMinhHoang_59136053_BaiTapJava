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
public class XeNgoaiThanh extends ChuyenXe
{
    String noiDen;
    int soNgay;

    public XeNgoaiThanh(String noiDen, int soNgay, String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgay = soNgay;
    }
    
    @Override
    public void inThongTinChuyenXe() 
    {
    //    super.inThongTinChuyenXe(); //To change body of generated methods, choose Tools | Templates.
        super.inThongTinChuyenXe();
        System.out.println("Số Tuyến: "+noiDen+"\n"+
                           "Số Ngày Đi Được: "+soNgay+"\n"+
                           "Doanh Thu: "+doanhThu);
    }
    
}
