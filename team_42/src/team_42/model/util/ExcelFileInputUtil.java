package team_42.model.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import team_42.model.dto.ConsumeDTO;

public class ExcelFileInputUtil {
	
	// 파일 읽어오기
	public void readCSV() {
		ConsumeDTO consumeDto = new ConsumeDTO();
		
		try {
			File file = new File("C:\\\\01.lab\\\\FISA_4LEE\\\\team_42\\\\card_consume_pattern.csv");
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
						//consumeDto.setTransactionDate(new Date(aLine.get(i)));
					}
				}
				
				System.out.println(aLine);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
