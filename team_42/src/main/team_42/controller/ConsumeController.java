package main.team_42.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import main.team_42.model.ConsumeDAO;
import main.team_42.model.dto.ConsumeDTO;

@RestController("/api")
public class ConsumeController {
	/*
	 * 모든 데이터 조회
	 */
	@GetMapping("/getall")
	public ResponseEntity getAllCardConsume(@RequestBody String req) throws SQLException {
		List<ConsumeDTO> list = ConsumeDAO.readAllRecords();
		System.out.println(req);
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	/*
	 * 생성
	 */
	@PostMapping("/create")
	public ResponseEntity getCategoryCardConsume(@RequestParam ConsumeDTO consumeDto) throws Exception {
		boolean result = ConsumeDAO.createRecord(consumeDto);
		
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
}