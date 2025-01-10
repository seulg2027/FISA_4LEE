package team_42.controller;

import team_42.view.EndView;
import team_42.view.StartView;

public class ConsumeController {

	public void startApplication() {
		StartView startView = new StartView();
		startView.displayStartMessage("START");

		try {
			System.out.println("데이터 조회 중...");
			EndView endView = new EndView();
			endView.displayEndMessage("데이터가 성공적으로 조회 됐습니다.");
		} catch (Exception e) {
			EndView endView = new EndView();
			endView.displayEndMessage("데이터 조회에 실패했습니다.");
		}

		try {
			System.out.println("데이터 수정 중...");
			EndView endView = new EndView();
			endView.displayEndMessage("데이터가 성공적으로 수정 됐습니다.");
		} catch (Exception e) {
			EndView endView = new EndView();
			endView.displayEndMessage("데이터 수정에 실패했습니다.");
		}

		try {
			System.out.println("데이터 삭제 중...");
			EndView endView = new EndView();
			endView.displayEndMessage("데이터가 성공적으로 삭제 됐습니다.");
		} catch (Exception e) {
			EndView endView = new EndView();
			endView.displayEndMessage("데이터 삭제에 실패했습니다.");
		}

		try {
			System.out.println("데이터 추가 중...");
			EndView endView = new EndView();
			endView.displayEndMessage("데이터가 성공적으로 추가 됐습니다.");
		} catch (Exception e) {
			EndView endView = new EndView();
			endView.displayEndMessage("데이터 추가에 실패했습니다.");
		}
	}
}