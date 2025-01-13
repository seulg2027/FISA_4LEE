package main.team42.model.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class ConsumeDTO  {
    private String id;
    private String industry;
    private Date transactionDate;
    private double totalAmount;
    private int timeLine;
    private int usageCnt;
    private Date registerDate;
}