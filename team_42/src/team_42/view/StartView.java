package team_42.view;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class StartView {
    public void displayStartMessage(String message) {
        System.out.println(message);
    }
    
    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient();
        
        // JSON 요청 본문
        String json = "{\"title\":\"foo\",\"body\":\"bar\",\"userId\":1}";
        RequestBody body = RequestBody.create(json, MediaType.parse("application/json; charset=utf-8"));

        // 요청 생성
        Request request = new Request.Builder()
					                .url("https://jsonplaceholder.typicode.com/posts")
					                .post(body)
					                .build();

        // 요청 실행
        try (Response response = client.newCall(request).execute()) {
            System.out.println("Response Code: " + response.code());
            System.out.println("Response Body: " + response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}