package main.team_42.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import main.team_42.model.ConsumeDAO;
import main.team_42.model.dto.ConsumeDTO;
import main.team_42.model.util.RequestUtil;

@RestController
public class ConsumeController {
	/*
	 * 모든 데이터 조회
	 */
	@GetMapping("/getall")
	public ResponseEntity<?> getAllCardConsume(@RequestParam(required=false) Map<String, String> req) {
		List<ConsumeDTO> list = null;
		try {
			String params = RequestUtil.getParams(req);
			list = ConsumeDAO.readAllRecords(params);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	/*
	 * 생성
	 */
	@PostMapping("/create")
	public ResponseEntity<?> getCategoryCardConsume(@RequestParam(required=true) Map<String, String> req) {
		boolean result = false;
		try {
			ConsumeDTO consumeDto = RequestUtil.getConsumeDTO(req);
			result = ConsumeDAO.createRecord(consumeDto);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	/*
	 * 삭제
	 */
	@PostMapping("/delete")
	public ResponseEntity<?> delCategoryCardConsume(@RequestParam(required=true) String id) {
		boolean result = false;
		try {
			result = ConsumeDAO.deleteRecord(id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
}