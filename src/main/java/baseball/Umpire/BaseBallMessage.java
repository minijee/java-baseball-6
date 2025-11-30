package baseball.Umpire;

public enum BaseBallMessage {
    BALL("볼"),
    STRIKE("스트라이크"),
    NOTHING("낫싱");

    private final String text;

    BaseBallMessage(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
