public class CoinFlip {

    // constructor
    public CoinFlip() {}

    // this method simulates a coin flip by randomly returning "heads"
    // or "tails"; this method should return "heads" on average 50% of
    // the time and "tails" on average 50% of the time
    public String flip() {
        /* to be implemented */
        double coin = Math.random();
        if (coin > .5) {
            return "heads";
        } else {
            return "tails";
        }
    }

    // performs a simulation that flips a coin numFlips times
    // and returns the percent of those flips that were "heads";
    // this method should make use of your flip() method.
    // for example, if numFlips is 100, then this method should flip()
    // 100 times and track how many returned "heads"; if 46 were heads,
    // this method should return 0.46
    public double simulate(int numFlips) {
        /* to be implemented */
        double count = 0;
        for (int i = 0; i < numFlips; i++) {
            String result = flip();
            if (result.equals("heads")) {
                count++;
            }
        }
        return count / numFlips;
    }
}