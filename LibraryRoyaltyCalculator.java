public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {
        Author author = new Author("Daniel Ahmad");

        PrintedBook printedBook = new PrintedBook("KlovneSkræk", "SKØN", 140, 166);
        AudioBook audioBook = new AudioBook("Måneskin", "SKØN", 140, 192);
        PrintedBook poetryBook = new PrintedBook("FalkeFolket", "FAG", 10, 40);

        author.addTitle(printedBook);
        author.addTitle(audioBook);

        double royalties = author.calculateRoyalties();
        System.out.println(author.getName() + ": " + royalties + " kr.");
    }
}
