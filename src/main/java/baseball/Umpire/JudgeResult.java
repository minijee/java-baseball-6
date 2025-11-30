package baseball.Umpire;

public class JudgeResult {
    private final int ballCount;
    private final int strikeCount;

    public JudgeResult(int ballCount, int strikeCount) {
        this.ballCount = ballCount;
        this.strikeCount = strikeCount;
    }

    public int getBallCount() {
        return ballCount;
    }

    public int getStrikeCount() {
        return strikeCount;
    }
}
