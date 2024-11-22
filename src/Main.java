import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        QuanLyDanhBa qldb = new QuanLyDanhBa();
        while (true) {
            try {
                System.out.println("----- CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ -----");
                System.out.println("1. Xem danh sách");
                System.out.println("2. Thêm mới");
                System.out.println("3. Cập nhật");
                System.out.println("4. Xóa");
                System.out.println("5. Tìm kiếm");
                System.out.println("6. Đọc từ File CSV");
                System.out.println("7. Lưu vào File CSV");
                System.out.println("8. Thoát");
                System.out.print("Chọn chức năng: ");
                int luaChon = scanner.nextInt();
                scanner.nextLine();
                switch (luaChon) {
                    case 1:
                        qldb.hienThiDanhBa();
                        break;
                    case 2:
                        System.out.print("Nhập số điện thoại: ");
                        String soDT = scanner.nextLine();
                        System.out.print("Nhập nhóm: ");
                        String nhom = scanner.nextLine();
                        System.out.print("Nhập họ tên: ");
                        String hoTen = scanner.nextLine();
                        System.out.print("Nhập giới tính: ");
                        String gioiTinh = scanner.nextLine();
                        System.out.print("Nhập địa chỉ: ");
                        String diaChi = scanner.nextLine();
                        System.out.print("Nhập ngày sinh: ");
                        String ngaySinh = scanner.nextLine();
                        System.out.print("Nhập email: ");
                        String email = scanner.nextLine();
                        qldb.themDanhBa(new DanhBa(soDT, nhom, hoTen, gioiTinh, diaChi, ngaySinh, email));
                        break;
                    case 3:
                        System.out.print("Nhập số điện thoại cần cập nhật: ");
                        String soDTCapNhat = scanner.nextLine();
                        System.out.print("Nhập thông tin mới (họ tên): ");
                        String hoTenMoi = scanner.nextLine();
                        qldb.capNhatDanhBa(soDTCapNhat, new DanhBa(soDTCapNhat, "Mới", hoTenMoi, "", "", "", ""));
                        break;
                    case 4:
                        System.out.print("Nhập số điện thoại cần xóa: ");
                        String soDTXoa = scanner.nextLine();
                        qldb.xoaDanhBa(soDTXoa);
                        break;
                    case 5:
                        System.out.print("Nhập từ khóa tìm kiếm: ");
                        String keyword = scanner.nextLine();
                        qldb.timKiemDanhBa(keyword);
                        break;
                    case 6:
                        System.out.println(" CẢNH BÁO: Tất cả danh bạ hiện tại sẽ bị xóa và thay thế từ file CSV.");
                        System.out.print("Bạn có chắc chắn? (y/n): ");
                        if (scanner.nextLine().equalsIgnoreCase("y")) {
                            List<DanhBa> danhBaMoi = CSVHandler.docFileCSV();
                            if (!danhBaMoi.isEmpty()) {
                                qldb.getDanhBaList().clear();
                                qldb.getDanhBaList().addAll(danhBaMoi);
                            }
                        } else {
                            System.out.println(" Hủy đọc file.");
                        }
                        break;
                    case 7:
                        System.out.println(" CẢNH BÁO: File CSV hiện tại sẽ bị ghi đè toàn bộ.");
                        System.out.print("Bạn có chắc chắn? (y/n): ");
                        if (scanner.nextLine().equalsIgnoreCase("y")) {
                            CSVHandler.ghiFileCSV(qldb.getDanhBaList());
                        } else {
                            System.out.println(" Hủy lưu file.");
                        }
                        break;
                    case 8:
                        System.out.println(" Thoát chương trình. Tạm biệt!");
                        scanner.close();
                        return;
                   default:
                      System.out.println(" Lựa chọn không hợp lệ!");
                }


            } catch (Exception e) {
                System.out.println("Mời bạn nhập lại ");
                scanner.nextLine();
            }
        }
    }

}

