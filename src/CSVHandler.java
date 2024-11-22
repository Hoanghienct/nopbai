import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
public class CSVHandler {
        private static final String DEFAULT_CSV_PATH = "src/data/contacts.csv";
        // Đọc danh bạ từ file CSV
        public static List<DanhBa> docFileCSV() {
            List<DanhBa> danhBaList = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader(DEFAULT_CSV_PATH))) {
                String line;
                br.readLine();
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");
                    if (values.length == 7) {
                        danhBaList.add(new DanhBa(
                                values[0].trim(),
                                values[1].trim(),
                                values[2].trim(),
                                values[3].trim(),
                                values[4].trim(),
                                values[5].trim(),
                                values[6].trim()
                        ));
                    }
                }
                System.out.println(" Đọc danh bạ từ CSV thành công!");
            } catch (IOException e) {
                System.out.println(" Lỗi khi đọc file CSV: " + e.getMessage());
            }
            return danhBaList;
        }

        // Ghi danh bạ vào file CSV
        public static void ghiFileCSV(List<DanhBa> danhBaList) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(DEFAULT_CSV_PATH))) {

                bw.write("SoDienThoai,Nhom,HoTen,GioiTinh,DiaChi,NgaySinh,Email");
                bw.newLine();

                for (DanhBa danhBa : danhBaList) {
                    bw.write(String.join(",", Arrays.asList(
                            danhBa.getSoDienThoai(),
                            danhBa.getNhom(),
                            danhBa.getHoTen(),
                            danhBa.getGioiTinh(),
                            danhBa.getDiaChi(),
                            danhBa.getNgaySinh(),
                            danhBa.getEmail()
                    )));
                    bw.newLine();
                }
                System.out.println("Lưu danh bạ vào CSV thành công!");
            } catch (IOException e) {
                System.out.println(" Lỗi khi ghi file CSV: " + e.getMessage());
            }
        }
    }


