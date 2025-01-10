package team_42.model.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ConsumeDTO  {
    private String id;
    private String industry;
    private Date transactionDate;
    private int totalAmount;
    private int timeLine;
    private int usageCnt;
    private Date registerDate;
}