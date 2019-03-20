package entity;

public class Student extends Person implements HanhDongTieuCuc, HanhDongTichCuc {

    private String rollNumber;

    // hàm đặc biệt
    // tên trùng với tên class.
    // Không có kiểu dữ liệu trả về.
    // Dùng để khởi tạo đối tượng cụ thể của một class.
    public Student() {

    }

    public Student(String rollNumber, String name, int age, String address) {
        this.rollNumber = rollNumber;
        this.setName(name);
        this.setAge(age);
        this.setAddress(address);
    }

    @Override
    public void eat(String foodNameSponsorByParent) {
        System.out.println("Tôi, một sinh viên, đang ăn " + foodNameSponsorByParent);
    }

    @Override
    public void diTrenConDuongDoi() {
        System.out.println("đi lên trường rồi đi nhà, và cứ thế, cho đến khi không ra nổi trường.");
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public void docSach() {
        System.out.println("Vào thư viện đọc sách, đọc thì ít mà ngắm gái thì nhiều.");
    }

    @Override
    public void ngheNhac() {
        System.out.println("Vừa nghe vừa lắc lư.");
    }

    @Override
    public void tapTheThao() {
        System.out.println("Tập 1, chụp 10, ngắm 20.");
    }

    @Override
    public void capheBuoiSang() {
        System.out.println("Cà phê gói || Xin tiền bố mẹ.");
    }

    @Override
    public void choiGame() {
        System.out.println("Thâu đêm suốt sáng.");
    }

    @Override
    public void uongRuou() {
        System.out.println("Chú lại không nể anh.");
    }

    @Override
    public void hutThuoc() {
        System.out.println("Như phim hàn.");
    }

    @Override
    public void coBac() {
        System.out.println("Chắc là ít thôi.");
    }
}
