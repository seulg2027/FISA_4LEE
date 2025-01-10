package team_42.model.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import team_42.model.ConsumeDAO;
import team_42.model.dto.ConsumeDTO;


public class ExcelFileInputUtil {
	
	// 파일 읽어오기
	@Test
	public void readCSV() {
		ConsumeDTO consumeDto = new ConsumeDTO();
		
		try {
			File file = new File("C:\\01.lab\\FISA_4LEE\\team_42\\card_consume_pattern.csv");
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "EUC-KR"));
			
			String line = br.readLine();
			
			while ((line = br.readLine())!=null) {
				List<String> aLine = new ArrayList<String>();
				String[] lineArr = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)",-1);
				aLine = Arrays.asList(lineArr);
				
				String industry = aLine.get(0).replace("\"", "");
				String dateStr = aLine.get(1).replace("\"", "");
				int timeLine = Integer.parseInt(aLine.get(2).replace("\"", ""));
				double totalAmount = Double.parseDouble(aLine.get(4).replace("\"", ""));
				int usageCnt = Integer.parseInt(aLine.get(5).replace("\"", ""));
				LocalDate registerDate = LocalDate.now();
				
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
				LocalDate date = LocalDate.parse(dateStr, formatter);
				
				consumeDto.setIndustry(industry);
				consumeDto.setTransactionDate(Date.valueOf(date));
				consumeDto.setTimeLine(timeLine);
				consumeDto.setTotalAmount(totalAmount);
				consumeDto.setUsageCnt(usageCnt);
				consumeDto.setRegisterDate(Date.valueOf(registerDate));

				System.out.println(consumeDto.toString());
				
				ConsumeDAO.createRecord(consumeDto);
				
				//System.out.println(aLine);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
