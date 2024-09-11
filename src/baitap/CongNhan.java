package baitap;

public class CongNhan {
	private String MaCN, mHo, mTen;
	private int mSoSP;
	
	
	public String getMaCN() {
		return MaCN;
	}
	public void setMaCN(String maCN) {
		MaCN = maCN;
	}
	public String getmHo() {
		return mHo;
	}
	public void setmHo(String mHo) {
		this.mHo = mHo;
	}
	public String getmTen() {
		return mTen;
	}
	public void setmTen(String mTen) {
		this.mTen = mTen;
	}
	public int getmSoSP() {
		return mSoSP;
	}
	public void setmSoSP(int mSoSP) {
		this.mSoSP = mSoSP;
	}
	public CongNhan(String MaCN, String mHo, String mTen, int mSoSP) {
	        this.MaCN = MaCN;
	        this.mHo = mHo;
	        this.mTen = mTen;
	        this.mSoSP = mSoSP;
	    }
	 public double tinhLuong() {
	        double donGia;
	        if (mSoSP >= 600) {
	            donGia = 0.65;
	        } else if (mSoSP >= 400) {
	            donGia = 0.60;
	        } else if (mSoSP >= 200) {
	            donGia = 0.55;
	        } else {
	            donGia = 0.50;
	        }
	        return mSoSP * donGia;
	    }

	    @Override
	    public String toString() {
	        return "CongNhan{" +
	                "maCN='" + MaCN + '\'' +
	                ", ho='" + mHo + '\'' +
	                ", ten='" + mTen + '\'' +
	                ", soSP=" + mSoSP +
	                ", luong=" + tinhLuong() +
	                '}';
	    }
}
