package baseball;

import baseball.controller.InputController;

public class Application {
    public static void main(String[] args) {
        InputController inputController = new InputController();
        System.out.println("숫자 야구 게임을 시작합니다.");
        inputController.requireAnswer();
    }
}
