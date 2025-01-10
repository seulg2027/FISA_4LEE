package main.team_42.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import main.team_42.model.ConsumeDAO;
import main.team_42.model.dto.ConsumeDTO;

@RestController("/api")
public class ConsumeController {
	/*
	 * 모든 데이터 조회
	 */
	@GetMapping("/getall")
	public static ResponseEntity getAllCardConsume() throws SQLException {
		List<ConsumeDTO> list = ConsumeDAO.readAllRecords();
		System.out.println(list.toString());
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
}