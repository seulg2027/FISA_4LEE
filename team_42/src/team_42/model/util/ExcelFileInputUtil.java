package team_42.model.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ExcelFileInputUtil {
	
	// 파일 읽어오기
	public void readCSV() {
		try {
			File file = new File("C:\\\\01.lab\\\\FISA_4LEE\\\\team_42\\\\card_consume_pattern.csv");
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "EUC-KR"));
			
			String line = "";
			
			while ((line = br.readLine())!=null) {
				List<String> aLine = new ArrayList<String>();
				String[] lineArr = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)",-1);
				aLine = Arrays.asList(lineArr);
				System.out.println(aLine);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
