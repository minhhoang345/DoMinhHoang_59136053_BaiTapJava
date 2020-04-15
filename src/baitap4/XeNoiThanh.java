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
public class XeNoiThanh extends ChuyenXe
{
    int soTuyen;
    int soKM;

    public XeNoiThanh(int soTuyen, int soKM, String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu)
    {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKM = soKM;
    }

    @Override
    public void inThongTinChuyenXe() {
    //    super.inThongTinChuyenXe(); //To change body of generated methods, choose Tools | Templates.
        super.inThongTinChuyenXe();
        System.out.println("Số Tuyến: "+soTuyen+"\n"+
                           "Số KM Đi Được: "+soKM+"\n"+
                           "Doanh Thu: "+doanhThu);     
    }
    
    
}
