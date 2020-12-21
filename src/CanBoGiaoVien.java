public class CanBoGiaoVien extends CanBo {
        int luongCung;
        int thuong;
        int phat;
        int tongLuong;

    public int getTongLuong() {
        return (luongCung + thuong - phat);
    }

    public void setTongLuong(int tongLuong) {
        this.tongLuong = tongLuong;
    }

    public CanBoGiaoVien(String name, String birthday, String homeTown, int luongCung, int thuong, int phat, int tongLuong) {
        super(name, birthday, homeTown);
        this.luongCung = luongCung;
        this.thuong = thuong;
        this.phat = phat;
        this.tongLuong = tongLuong;
    }

    public CanBoGiaoVien(int luongCung, int thuong, int phat, int tongLuong) {
        this.luongCung = luongCung;
        this.thuong = thuong;
        this.phat = phat;
        this.tongLuong = tongLuong;
    }

    public CanBoGiaoVien(String name, String birthday, String homeTown, int luongCung, int thuong, int phat) {
        super(name, birthday, homeTown);
        this.luongCung = luongCung;
        this.thuong = thuong;
        this.phat = phat;
    }

    public CanBoGiaoVien(int luongCung, int thuong, int phat) {
        this.luongCung = luongCung;
        this.thuong = thuong;
        this.phat = phat;
    }

    public int getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(int luongCung) {
        this.luongCung = luongCung;
    }

    public int getThuong() {
        return thuong;
    }

    public void setThuong(int thuong) {
        this.thuong = thuong;
    }

    public int getPhat() {
        return phat;
    }

    public void setPhat(int phat) {
        this.phat = phat;
    }

    @Override
    public String toString() {
        return "CanBoGiaoVien{" +
                "luongCung=" + luongCung +
                ", thuong=" + thuong +
                ", phat=" + phat +
                ", tongLuong=" + getTongLuong() +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", homeTown='" + homeTown + '\'' +
                '}';
    }
}
