package baseball.dto;

public enum BaseBall {
    BALL("볼"),
    STRIKE("스트라이크"),
    NOTHING("낫싱");

    private final String text;

    BaseBall(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
