package main.team_42.model;

//?
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.team_42.model.dto.ConsumeDTO;
import main.team_42.model.util.DriverUtil;

public class ConsumeDAO {

    // 'Create' 기능
    public static boolean createRecord(ConsumeDTO consumeDto) throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            con = DriverUtil.getConnection();
            String sql = "INSERT INTO card_consume (id, industry, transaction_date, total_amount, time_line, usage_cnt, register_date) VALUES (?, ?, ?, ?, ?, ?, ?)";
            pstmt = con.prepareStatement(sql);

            pstmt.setString(1, consumeDto.getId()); 
            pstmt.setString(2, consumeDto.getIndustry()); 
            pstmt.setDate(3, consumeDto.getTransactionDate());
            pstmt.setDouble(4, consumeDto.getTotalAmount()); 
            pstmt.setInt(5, consumeDto.getTimeLine()); 
            pstmt.setInt(6, consumeDto.getUsageCnt()); 
            pstmt.setDate(7, consumeDto.getRegisterDate()); 

            int result = pstmt.executeUpdate();
            return result == 1; 
        } finally {
        	DriverUtil.close(con, pstmt); 
        }
    }

    // 'Read' 기능
    public static List<ConsumeDTO> readAllRecords() throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<ConsumeDTO> records = new ArrayList<>(); 

        try {
            con = DriverUtil.getConnection();
            String sql = "SELECT * FROM card_consume";
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                records.add(new ConsumeDTO(
                    rs.getString("id"), 
                    rs.getString("industry"), 
                    rs.getDate("transaction_date"), 
                    rs.getDouble("total_amount"), 
                    rs.getInt("time_line"), 
                    rs.getInt("usage_cnt"), 
                    rs.getDate("register_date") 
                ));
            }
        } finally {
        	DriverUtil.close(con, pstmt, rs); 
        }
        return records; 
    }

 // 'Update' 기능
    public static boolean updateRecord(ConsumeDTO consumeDto) throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            con = DriverUtil.getConnection();
            String sql = "UPDATE card_consume SET industry = ?, total_amount = ?, time_line = ?, usage_cnt = ?, register_date = ? WHERE id = ?";
            pstmt = con.prepareStatement(sql);

            pstmt.setString(1, consumeDto.getIndustry()); 
            pstmt.setDouble(2, consumeDto.getTotalAmount());
            pstmt.setInt(3, consumeDto.getTimeLine()); 
            pstmt.setInt(4, consumeDto.getUsageCnt());
            pstmt.setDate(5, consumeDto.getRegisterDate()); 
            pstmt.setString(6, consumeDto.getId());
//          pstmt.setDate(7, consumeDto.getTransactionDate());

            int result = pstmt.executeUpdate();
            return result == 1; 
        } finally {
            DriverUtil.close(con, pstmt); 
        }
    }

    // 'Delete' 기능
    public static boolean deleteRecord(String id) throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            con = DriverUtil.getConnection();
            String sql = "DELETE FROM card_consume WHERE id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, id); 

            int result = pstmt.executeUpdate();
            return result == 1; 
        } finally {
        	DriverUtil.close(con, pstmt); 
        }
    }


}