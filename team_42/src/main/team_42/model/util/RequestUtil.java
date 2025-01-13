package main.team_42.model.util;

import java.util.Map;

public class RequestUtil {
	/*
	 * Request -> DB 조건절로 변환
	 */
	public static String getParams(Map<String, String> req) {
		String params = "";
        if (req.size() > 0) {
        	params += "WHERE ";
            for (String key: req.keySet()) {
            	params += key + "=" + "\'";
            	params += req.get(key) + "\' AND ";
            }
            params += "1=1";
        }
        return params;
	}
}
