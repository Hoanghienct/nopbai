import java.util.*;
public class QuanLyDanhBa {
        private List<DanhBa> danhBaList = new ArrayList<>();
        // Thêm mới danh bạ
        public void themDanhBa(DanhBa danhBa) {
            danhBaList.add(danhBa);
            System.out.println(" Đã thêm danh bạ thành công!");
        }
        // Hiển thị danh sách
        public void hienThiDanhBa() {
            if (danhBaList.isEmpty()) {
                System.out.println(" Danh bạ trống.");
            } else {
                for (int i = 0; i < danhBaList.size(); i++) {
                    System.out.println("Mục #" + (i + 1));
                    System.out.println(danhBaList.get(i));
                }
            }
        }
        // Cập nhật danh bạ
        public void capNhatDanhBa(String soDienThoai, DanhBa danhBaMoi) {
            for (DanhBa danhBa : danhBaList) {
                if (danhBa.getSoDienThoai().equals(soDienThoai)) {
                    danhBaList.set(danhBaList.indexOf(danhBa), danhBaMoi);
                    System.out.println("Cập nhật thành công!");
                    return;
                }
            }
            System.out.println(" Không tìm thấy số điện thoại!");
        }

        // Xóa danh bạ
        public void xoaDanhBa(String soDienThoai) {
            danhBaList.removeIf(danhBa -> danhBa.getSoDienThoai().equals(soDienThoai));
            System.out.println(" Đã xóa danh bạ thành công!");
        }

        // Tìm kiếm danh bạ
        public void timKiemDanhBa(String keyword) {
            boolean found = false;
            for (DanhBa danhBa : danhBaList) {
                if (danhBa.getHoTen().toLowerCase().contains(keyword.toLowerCase())) {
                    System.out.println(danhBa);
                    found = true;
                }
            }
            if (!found) System.out.println(" Không tìm thấy kết quả!");
        }

        // Trả về danh sách hiện tại
        public List<DanhBa> getDanhBaList() {
            return danhBaList;
        }
    }


