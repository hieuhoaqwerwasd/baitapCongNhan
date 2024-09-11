package baitap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class DanhSachCongNhan {
	private List<CongNhan> danhSach;
    private int kichThuocMax;

    public DanhSachCongNhan(int kichThuocMax) {
        this.kichThuocMax = kichThuocMax;
        this.danhSach = new ArrayList<>(kichThuocMax);
    }

    public boolean themCongNhan(CongNhan congNhan) {
        if (danhSach.size() < kichThuocMax) {
            danhSach.add(congNhan);
            return true;
        }
        return false;
    }

    public void xuatToanBoThongTin() {
        for (CongNhan cn : danhSach) {
            System.out.println(cn);
        }
    }

    public int soLuongCongNhan() {
        return danhSach.size();
    }

    public void xuatCongNhanTren200SP() {
        for (CongNhan cn : danhSach) {
            if (cn.getmSoSP() > 200) {
                System.out.println(cn);
            }
        }
    }

    public void sapXepTheoSoSP() {
        Collections.sort(danhSach, new Comparator<CongNhan>() {
            @Override
            public int compare(CongNhan cn1, CongNhan cn2) {
                return Integer.compare(cn2.getmSoSP(), cn1.getmSoSP());
            }
        });
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap so luong cong nhan: ");
        int soLuongMax = scanner.nextInt();
        scanner.nextLine();

        DanhSachCongNhan ds = new DanhSachCongNhan(soLuongMax);

        System.out.print("Nhap so luong cong nhan can them: ");
        int soLuongCN = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < soLuongCN; i++) {
            System.out.println("Nhap thong tin cong nhan thu " + (i + 1) + ":");
            System.out.print("Ma cong nhan: ");
            String maCN = scanner.nextLine();
            System.out.print("Ho: ");
            String ho = scanner.nextLine();
            System.out.print("Ten: ");
            String ten = scanner.nextLine();
            System.out.print("So san pham: ");
            int soSP = scanner.nextInt();
            scanner.nextLine();

            CongNhan cn = new CongNhan(maCN, ho, ten, soSP);
            ds.themCongNhan(cn);
        }

        System.out.println("\nToan bo thong tin cong nhan:");
        ds.xuatToanBoThongTin();

        System.out.println("\nSo luong cong nhan: " + ds.soLuongCongNhan());

        System.out.println("\nThong tin cong nhan lam tren 200 san pham:");
        ds.xuatCongNhanTren200SP();

        ds.sapXepTheoSoSP();
        System.out.println("\nDanh sach cong nhan sau khi sap xep theo so san pham giam dan:");
        ds.xuatToanBoThongTin();

        scanner.close();
    }
}
