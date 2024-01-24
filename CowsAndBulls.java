public class CowsAndBulls {
    private int numGuess;
    private Result result;
    private int guess;

    public final static int numDigits = 4;
    public final static int maxVal = 9876;
    public final static int minVal = 1234;
    public final static int maxGuess = 10;

    public CowsAndBulls(int seed) {
        String guess = "";
        numGuess = 0;
        NumberPicker num = new NumberPicker(seed, 1, 9);
        guess = num.nextInt()+""+num.nextInt()+""+num.nextInt()+""+num.nextInt();
        this.guess = Integer.parseInt(guess);
    }

    public int guessesRemaining(){
        return maxGuess-numGuess;
    }

    public Result guess(int guessNumber){
        numGuess++;
        int[] guess = NumberUtils.toArray(guessNumber);
        int bulls = NumberUtils.countMatches(guessNumber, this.guess);
        int cows = NumberUtils.countIntersect(guessNumber, this.guess) - bulls;
        result = new Result(cows, bulls);
        return result;
    }

    public int giveUp(){
        numGuess = 10;
        gameOver();
        return this.guess;
    }

    public boolean gameOver(){
        if(result!=null)
            if(result.isCorrect())
                return true;
        if(guessesRemaining()!=0)
            return false;
        else
            return true;
    }
}
