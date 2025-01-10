package team_42.model.dto;

import java.sql.Date;

public class ConsumeDTO  {
    private String id;
    private String industry;
    private Date transactionDate;
    private int totalAmount;
    private int timeLine;
    private int usageCnt;
    private Date registerDate;
    
    public ConsumeDTO() {}

    public ConsumeDTO(String id, String industry, Date transactionDate, int totalAmount, int timeLine, int usageCnt, Date registerDate) {
        this.id = id;
        this.industry = industry;
        this.transactionDate = transactionDate;
        this.totalAmount = totalAmount;
        this.timeLine = timeLine;
        this.usageCnt = usageCnt;
        this.registerDate = registerDate;
        
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getTimeLine() {
        return timeLine;
    }

    public void setTimeLine(int timeLine) {
        this.timeLine = timeLine;
    }

    public int getUsageCnt() {
        return usageCnt;
    }

    public void setUsageCnt(int usageCnt) {
        this.usageCnt = usageCnt;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }
}