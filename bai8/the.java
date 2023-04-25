package bai8;

public class the {
    private hocsinh student;
    private String id;
    private int borrowDate;
    private int paymentDate;
    private int bookId;

    public the(hocsinh student, String id, int borrowDate, int paymentDate, int bookId) {
        this.student = student;
        this.id = id;
        this.borrowDate = borrowDate;
        this.paymentDate = paymentDate;
        this.bookId = bookId;
    }

    public hocsinh getStudent() {
        return student;
    }

    public void setStudent(hocsinh student) {
        this.student = student;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(int borrowDate) {
        this.borrowDate = borrowDate;
    }

    public int getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(int paymentDate) {
        this.paymentDate = paymentDate;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
}
