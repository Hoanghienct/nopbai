import java.io.Serializable;

public class DanhBa implements Serializable{
        private String soDienThoai;
        private String nhom;
        private String hoTen;
        private String gioiTinh;
        private String diaChi;
        private String ngaySinh;
        private String email;

        // Constructor
        public DanhBa(String soDienThoai, String nhom, String hoTen, String gioiTinh, String diaChi, String ngaySinh, String email) {
            this.soDienThoai = soDienThoai;
            this.nhom = nhom;
            this.hoTen = hoTen;
            this.gioiTinh = gioiTinh;
            this.diaChi = diaChi;
            this.ngaySinh = ngaySinh;
            this.email = email;
        }

    // Các getter để lấy dữ liệu
    public String getSoDienThoai() {
        return soDienThoai;
    }

    public String getNhom() {
        return nhom;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getEmail() {
        return email;
    }

        // ToString hiển thị danh bạ
        @Override
        public String toString() {
            return "Số điện thoại: " + soDienThoai + "\n" +
                    "Nhóm: " + nhom + "\n" +
                    "Họ tên: " + hoTen + "\n" +
                    "Giới tính: " + gioiTinh + "\n" +
                    "Địa chỉ: " + diaChi + "\n" +
                    "Ngày sinh: " + ngaySinh + "\n" +
                    "Email: " + email + "\n";
        }
    }

