package entity;

public class Employee extends Person implements HanhDongTichCuc, HanhDongTieuCuc {

    private String employeeId;
    private String taxId;
    private String joinedAt;

    @Override // annotation
    public void eat(String foodNameSponsorByParent) {
        System.out.println("Tôi, một nhân viên, đang ăn " + foodNameSponsorByParent);
    }

    @Override
    public void diTrenConDuongDoi() {
        System.out.println("Đi đến chỗ làm rồi lại đi về, và cứ thế cho đến khi không biết mình đang làm gì.");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getJoinedAt() {
        return joinedAt;
    }

    public void setJoinedAt(String joinedAt) {
        this.joinedAt = joinedAt;
    }

    @Override
    public void docSach() {
        System.out.println("Theo yêu cầu của sếp.");
    }

    @Override
    public void ngheNhac() {
        System.out.println("Tai nghe từ sáng đến tối.");
    }

    @Override
    public void tapTheThao() {
        System.out.println("Ngắm thì nhiều, tập chả được bao nhiêu.");
    }

    @Override
    public void capheBuoiSang() {
        System.out.println("Cà phê đều đặn đến tận trưa.");
    }

    @Override
    public void choiGame() {
        System.out.println("Lăm lăm cái điện thoại.");
    }

    @Override
    public void uongRuou() {
        System.out.println("Rảnh là uống.");
    }

    @Override
    public void hutThuoc() {
        System.out.println("Ngày 2 bao. là ít.");
    }

    @Override
    public void coBac() {
        System.out.println("Nghỉ là chơi.");
    }
}
