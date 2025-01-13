package main.team_42.model.util;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import main.team_42.model.dto.ConsumeDTO;

public class RequestUtil {
	/*
	 * Request -> DB 조건절로 변환
	 */
	public static String getParams(Map<String, String> req) {
		String params = "";
        if (req.size() > 0) {
        	params += "WHERE ";
            for (String key: req.keySet()) {
            	params += key + "=" + "\'";
            	params += req.get(key) + "\' AND ";
            }
            params += "1=1";
        }
        return params;
	}
	
	public static ConsumeDTO getConsumeDTO(Map<String, String> req) {
		ConsumeDTO consumeDto = new ConsumeDTO();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		System.out.println("transaction_date : " + req.get("transaction_date"));
		LocalDate date = LocalDate.parse(req.get("transaction_date"), formatter);
		
		consumeDto.setIndustry(req.get("industry"));
		consumeDto.setTransactionDate(Date.valueOf(date));
		consumeDto.setTotalAmount(Double.parseDouble(req.get("total_amount")));
		consumeDto.setTimeLine(Integer.parseInt(req.get("time_line")));
		consumeDto.setUsageCnt(Integer.parseInt(req.get("usage_cnt")));
		consumeDto.setRegisterDate(Date.valueOf(LocalDate.now()));		
		
		return consumeDto;
	}
}
