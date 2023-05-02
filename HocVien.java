package lap4_4;

import java.util.Scanner;

public abstract class  HocVien  {
public String Ten;
public String diaChi;
public String loaiCT;
public int uuTien;
public int giaUuTien;
public double hocPhi;

public abstract void hocphi();

public HocVien(String ten, String diaChi, String loaiChuongtrinh, int uuTien, double hocPhi) {
	super();
	Ten = ten;
	this.diaChi = diaChi;
	this.loaiCT = loaiChuongtrinh;
	this.uuTien = uuTien;
	this.hocPhi = hocPhi;
	this.giaUuTien = giaUuTien;
}


public HocVien() {
	super();
}


Scanner sc = new Scanner(System.in);
public void nhapThongTin(String ct) {
	System.out.println("nhap thong tin hoc vien "+ct);
	System.out.println("nhap ten hoc vien");
	Ten = sc.next();
	System.out.println("nhap dia chi hoc vien");
	diaChi = sc.next();
	System.out.println("Chọn loại chương trình đăng ký (1 - DH; 2 - LT");
	if (sc.nextInt() == 1) {
		this.loaiCT = "Đồ họa";
	} else if (sc.nextInt() == 2) {
		this.loaiCT = "Lập trình";
	} else {
		System.out.println("Vui lòng chọn loại chương trình đăng ký (1 - DH; 2 - LT)");
	}
	System.out.println("Chọn đối tượng ưu tiên (1 hoặc 2)");
	uuTien = sc.nextInt();
	this.giaUuTien = checkUutien(ct, uuTien);
}
public void inThongTin(String ct) {
 System.out.println("ho ten:"+this.Ten);
 System.out.println("diachi:"+this.diaChi);
 System.out.println("loai  chuong trinh dang ki hoc:"+ct);
 System.out.println("loai uu tien:"+this.uuTien);
 System.out.println("hoc phi"+this.hocPhi);
}


public int checkUutien(String ct, int loaiUuTien) {
	if (ct == "lap trinh") {
		return (loaiUuTien == 1)?1000000:800000;
	} else if (ct == "do hoa") {
		return (loaiUuTien == 1)?1000000:500000;
	} else {
		return 0;
	}
}
}




//class Hocvien {
//  constructor(hoTen, diaChi, loaiChuongTrinh) {
//    this.hoTen = hoTen;
//    this.diaChi = diaChi;
//    this.loaiChuongTrinh = loaiChuongTrinh;
//  }
//
//  nhapThongTin() {
//    console.log('Nhap thong tin hoc vien:');
//    this.hoTen = prompt('Ho va ten: ');
//    this.diaChi = prompt('Dia chi: ');
//    this.loaiUuTien = prompt('Loai uu tien (1 hoac 2): ');
//    this.loaiChuongTrinh = prompt('Loai chuong trinh (Do hoa hoac Lap trinh): ');
//  }
//
//  hocPhi() {}
//
//  inThongTin() {
//    console.log(`Ho ten: ${this.hoTen}`);
//    console.log(`Dia chi: ${this.diaChi}`);
//    console.log(`Loai uu tien: ${this.loaiUuTien}`);
//    console.log(`Loai chuong trinh: ${this.loaiChuongTrinh}`);
//    console.log(`Hoc phi: ${this.hocPhi()}`);
//  }
//}
//
//class HocvienDH extends Hocvien {
//  constructor(hoTen, diaChi, loaiChuongTrinh) {
//    super(hoTen, diaChi, loaiChuongTrinh);
//    this.donGia = 500000;
//    this.soBuoi = 0;
//  }
//
//  khoiTao() {
//    this.donGia = 500000;
//    this.soBuoi = 30;
//  }
//
//  hocPhi() {
//    let uuTien = this.loaiUuTien === '1' ? 1000000 : 500000;
//    return this.soBuoi * this.donGia - uuTien;
//  }
//
//  nhapThongTin() {
//    super.nhapThongTin();
//    this.soBuoi = prompt('So buoi hoc: ');
//  }
//}
//
//class HocvienLT extends Hocvien {
//  constructor(hoTen, diaChi, loaiChuongTrinh) {
//    super(hoTen, diaChi, loaiChuongTrinh);
//    this.donGia = 800000;
//    this.soBuoi = 0;
//  }
//
//  khoiTao() {
//    this.donGia = 800000;
//    this.soBuoi = 20;
//  }
//
//  hocPhi() {
//    let uuTien = this.loaiUuTien === '1' ? 1000000 : 500000;
//    return this.soBuoi * this.donGia - uuTien;
//  }
//
//  nhapThongTin() {
//    super.nhapThongTin();
//    this.soBuoi = prompt('So buoi hoc: ');
//  }
//}
//
//// Khoi tao doi tuong va in thong tin
//const hocVienDH = new HocvienDH();
//hocVienDH.khoiTao();
//hocVienDH.nhapThongTin();
//hocVienDH.inThongTin();
//
//const hocVienLT = new HocvienLT();
//hocVienLT.khoiTao();
//hocVienLT.nhapThongTin();
//hocVienLT.inThongTin();