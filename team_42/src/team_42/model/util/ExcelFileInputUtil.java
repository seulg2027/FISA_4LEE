package team_42.model.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Date;

import org.junit.Test;

import team_42.model.dto.ConsumeDTO;


public class ExcelFileInputUtil {
	
	// 파일 읽어오기
	@Test
	public void readCSV() {
		ConsumeDTO consumeDto = new ConsumeDTO();
		
		try {
			File file = new File("C:\\01.lab\\01.java\\team_42\\card_consume_pattern.csv");
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "EUC-KR"));
			
			String line = "";
			
			while ((line = br.readLine())!=null) {
				List<String> aLine = new ArrayList<String>();
				String[] lineArr = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)",-1);
				aLine = Arrays.asList(lineArr);
				
				for (int i=0; i<aLine.size(); i++) {
					if (i == 0) {
						consumeDto.setIndustry(aLine.get(i));
					}
					if (i == 1) {
//						consumeDto.setTransactionDate(new Date(aLine.get(i)));
					}

					String industry = aLine.get(0);
					
					String dateStr = aLine.get(1);
					SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
					Date transaction_date = null;
					transaction_date = formatter.parse(dateStr);
					
					int total_amount = Integer.parseInt(aLine.get(4));
					
					// time -> 변환 // time_line
					int timeInt = Integer.parseInt(aLine.get(2));
					if(timeInt == 01) {
						
					}
					
					
					int usage_cnt = Integer.parseInt(aLine.get(5));
					
					LocalDate register_date = LocalDate.now();
					
//					industry, transaction_date, total_amount, time_line, usage_cnt, register_date
					
				}
				
				System.out.println(aLine);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
