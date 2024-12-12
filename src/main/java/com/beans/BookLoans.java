package com.beans;

public class BookLoans {
    private int id;
    private int userId;
    private int bookId;
    private String loanDate;
    private String returnDate;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getUsersId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public String getLoanDate() {
        return loanDate;
    }
    public void setLoanDate( String loanDate) {
        this.loanDate = loanDate;
    }
    public String getREturnDate() {
        return returnDate;
    }
    public void setReturnDate( String returnDate) {
        this.returnDate = returnDate;
    }
    
    
}
