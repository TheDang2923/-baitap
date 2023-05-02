package lap4_4;

import java.util.Scanner;

public class HocvienLT extends HocVien{
	private int sobuoi;
	private int giaLT;
//	
	public HocvienLT(String ten, String diaChi, String loaiChuongtrinh, int uuTien, double hocPhi, int sobuoi,int giaLT) {
		super(ten, diaChi, loaiChuongtrinh, uuTien, hocPhi);
		this.sobuoi = sobuoi;
		this.giaLT = giaLT;
	}
	public HocvienLT() {
		super();
	}
	public int getSobuoi() {
		return sobuoi;
	}
	public void setSobuoi(int sobuoi) {
		this.sobuoi = sobuoi;
	}
	public int getGiaLT() {
		return giaLT;
	}
	public void setGiaLT(int giaLT) {
		this.giaLT = giaLT;
	
	}
	Scanner sc =  new Scanner(System.in);
	public void sobuoi() {
		System.out.println("nhap so buoi hoc");
		sobuoi = sc.nextInt();
	}
	public void gia() {
		System.out.println("nhap gia hoc");
		giaLT = sc.nextInt();
	}
	@Override
	public String toString() {
		return "HocvienLT [sobuoi=" + sobuoi + ", giaLT=" + giaLT + "]";
	}
	
//	public int checkUuTien(int loaiUuTien) {
//		return this.uuTien = loaiUuTien == 1 ? 1000000 : 800000;
//	}
	
	public void hocphi() {
		this.hocPhi = this.sobuoi*this.giaLT-this.giaUuTien;
	}
	
}
