import java.util.ArrayList;

public class Author {
    private String name;
    private ArrayList<Title> titles;

    public Author(String name) {
        this.name = name;
        titles = new ArrayList<>();
    }

    public void addTitle(Title title) {
        titles.add(title);
    }

    public double calculateRoyalties() {
        double total = 0;

        for (Title title : titles) {
            total = total + title.calculateRoyalty();
        }

        double totalInOere = total * 100;
        double roundedOere = Math.round(totalInOere);
        return roundedOere / 100;
    }

    public String getName() {
        return name;
    }
}
