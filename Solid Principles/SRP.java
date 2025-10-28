public class GameResult {
    int guesses;
    int magicNumber;
    GameResult(int numberOfGuesses, int theNumber) {
        guesses = numberOfGuesses;
        magicNumber = theNumber;
    }
}
// GameResult's sole responsibility is storing the outcome of a single game.
