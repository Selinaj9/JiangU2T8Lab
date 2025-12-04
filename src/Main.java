public class Main {
    public static void main(String[] args) {
        StringLoops loops = new StringLoops();
        System.out.println(loops.replaceCharacterV1("a", "canned beans and bananas", "*"));
        System.out.println(loops.replaceCharacterV1(" ", "canned beans and bananas", ""));
        System.out.println(loops.replaceCharacterV1("t", "Ratatattat", "p"));
        System.out.println(loops.replaceCharacterV1("!", "Nice! Day today!", "?"));
        System.out.println(loops.replaceCharacterV1("i", "it’s the brain drain pain train", "I"));
        System.out.println(loops.replaceCharacterV1("i", "it’s the brain drain pain train", " "));
        System.out.println(loops.replaceCharacterV1("A", "ABABABABABC", "D"));
        System.out.println(loops.replaceCharacterV1("a", "ABABABABABC", "D"));
    }
}