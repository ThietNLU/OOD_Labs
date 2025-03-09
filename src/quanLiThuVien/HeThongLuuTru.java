package quanLiThuVien;

import java.time.LocalDate;

public class HeThongLuuTru {
	private int maDocGia;
	private int maSach;
	private LocalDate ngayMuon;
	private LocalDate ngayTraDuKien;
	private boolean trangThai;
	
	public HeThongLuuTru(int maDocGia, int maSach, LocalDate ngayMuon, LocalDate ngayTraDuKien, boolean trangThai) {
		this.maDocGia = maDocGia;
		this.maSach = maSach;
		this.ngayMuon = ngayMuon;
		this.ngayTraDuKien = ngayTraDuKien;
		this.trangThai = trangThai;
	}
	
	
}
