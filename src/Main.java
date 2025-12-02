public class Main {
    public static void main(String[] args) {
        CoinFlip coin = new CoinFlip();
        for (int i = 1; i <= 50; i++) {
            System.out.println("flip " + i + ": " + coin.flip());
        }

        for (int i = 100; i <= 1000; i += 100) {
            System.out.println("simulation with " + i + " coin flips: percent heads = " + coin.simulate(i));
        }
    }
}