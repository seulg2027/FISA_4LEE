package main.team42.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import main.team42.model.ConsumeDAO;
import main.team42.model.dto.ConsumeDTO;
import main.team42.model.util.RequestUtil;

@RestController
public class ConsumeController {
	/*
	 * 모든 데이터 조회
	 */
	@GetMapping("/getall")
	public ResponseEntity<?> getAllCardConsume(@RequestParam(required=false) Map<String, String> req) throws SQLException {
		List<ConsumeDTO> list = null;
		String params = RequestUtil.getParams(req);
		list = ConsumeDAO.readAllRecords(params);
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	/*
	 * 생성
	 */
	@PostMapping("/create")
	public ResponseEntity<?> getCategoryCardConsume(@RequestParam(required=true) Map<String, String> req) throws Exception{
		boolean result = false;
		ConsumeDTO consumeDto = RequestUtil.getConsumeDTO(req);
		result = ConsumeDAO.createRecord(consumeDto);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	/*
	 * 삭제
	 */
	@PostMapping("/delete")
	public ResponseEntity<?> delCategoryCardConsume(@RequestParam(required=true) String id) throws Exception{
		boolean result = false;
		result = ConsumeDAO.deleteRecord(id);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	@ExceptionHandler(SQLException.class)
	public ResponseEntity<String> handleSQLException(SQLException e) {
		return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(e.getMessage());
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleRuntimeException(Exception e) {
		return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(e.getMessage());
	}
}