package main.team_42.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import main.team_42.model.ConsumeDAO;
import main.team_42.model.dto.ConsumeDTO;

@RestController
public class ConsumeController {
	/*
	 * 모든 데이터 조회
	 */
	@GetMapping("/getall")
	public ResponseEntity<?> getAllCardConsume(@RequestBody(required=false) String industry
											 , @RequestBody(required=false) String date) {
		List<ConsumeDTO> list = null;
		try {
			list = ConsumeDAO.readAllRecords();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	/*
	 * 생성
	 */
	@PostMapping("/create")
	public ResponseEntity<?> getCategoryCardConsume(@RequestBody(required=true) ConsumeDTO consumeDto) {
		boolean result = false;
		try {
			result = ConsumeDAO.createRecord(consumeDto);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	/*
	 * 삭제
	 */
	@PostMapping("/delete")
	public ResponseEntity<?> delCategoryCardConsume(@RequestBody(required=true) String id) {
		boolean result = false;
		try {
			result = ConsumeDAO.deleteRecord(id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
}