package lap4_4;

import java.util.Scanner;

public class HocvienDH extends HocVien{
	
	private int sobuoi;
	private int giaDH;
	public HocvienDH(String ten, String diaChi, String loaiChuongtrinh, int uuTien, double hocPhi, int sobuoi,
			int giaDH) {
		super(ten, diaChi, loaiChuongtrinh, uuTien, hocPhi);
		this.sobuoi = sobuoi;
		this.giaDH = giaDH;
	}
	
	public HocvienDH() {
		super();
	}

	public int getSobuoi() {
		return sobuoi;
	}
	public void setSobuoi(int sobuoi) {
		this.sobuoi = sobuoi;
	}
	public int getGiaDH() {
		return giaDH;
	}
	public void setGiaDH(int giaDH) {
		this.giaDH = giaDH;
	}
	Scanner sc =  new Scanner(System.in);
	public void sobuoi() {
		System.out.println("nhap so buoi hoc");
		sobuoi = sc.nextInt();
	}
	public void gia() {
		System.out.println("nhap gia hoc");
		giaDH = sc.nextInt();
	}
	@Override
	public String toString() {
		return "HocvienDH [sobuoi=" + sobuoi + ", giaDH=" + giaDH + "]";
	}
	
//	public int checkUuTien(int loaiUuTien) {
//		return loaiUuTien == 1 ? 1000000 : 500000;
//	}
	
	public void hocphi() {
		this.hocPhi =  this.sobuoi*this.giaDH-this.giaUuTien;
	}
	
	}



