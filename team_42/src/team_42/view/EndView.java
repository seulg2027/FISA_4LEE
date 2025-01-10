package team_42.view;

import java.io.DataOutputStream;


public class EndView {
    private DataOutputStream dos = null;
    
    
    public static void showError(String message) {
        System.out.println(message);
    }

    public DataOutputStream getDos() {
        return dos;
    }
}