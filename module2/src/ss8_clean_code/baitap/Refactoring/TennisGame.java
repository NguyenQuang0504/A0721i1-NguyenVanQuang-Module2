package ss8_clean_code.baitap.Refactoring;

public class TennisGame {
    public static final char ONE = 1;
    public static final char ZERO = 0;
    public static final char TWO = 2;
    public static final char THREE = 3;
    public static final char FOUR = 4;
    public static String getScore(String player1Name, String player2Name, int mScore1, int mScore2) {
        String score = "";
        int tempScore = ZERO;
        if (mScore1 == mScore2) {
            switch (mScore1) {
                case ZERO:
                    score = "Love-All";
                    break;
                case ONE:
                    score = "Fifteen-All";
                    break;
                case TWO:
                    score = "Thirty-All";
                    break;
                case THREE:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else if (mScore1 >= FOUR || mScore2 >= FOUR) {
            int minusResult = mScore1 - mScore2;
            if (minusResult == ONE) score = "Advantage player1";
            else if (minusResult == -ONE) score = "Advantage player2";
            else if (minusResult >= TWO) score = "Win for player1";
            else score = "Win for player2";
        } else {
        for (int i = ONE; i < THREE; i++) {
                if (i == ONE) tempScore = mScore1;
                else {
                    score += "-";
                    tempScore = mScore2;
                }
                switch (tempScore) {
                    case ZERO:
                        score += "Love";
                        break;
                    case ONE:
                        score += "Fifteen";
                        break;
                    case TWO:
                        score += "Thirty";
                        break;
                    case THREE:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }
}
