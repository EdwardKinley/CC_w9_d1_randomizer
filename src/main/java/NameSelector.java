import java.util.ArrayList;
import java.util.Random;

public class NameSelector {

    private ArrayList<String> names;

    public NameSelector() {
        ArrayList<String> names = new ArrayList<String>();

        String name1 = "Ben";
        String name2 = "Can";
        String name3 = "Chris";
        String name4 = "Dan";
        String name5 = "David";
        String name6 = "Edward";
        String name7 = "Gary";
        String name8 = "Greg";
        String name9 = "Helen";
        String name10 = "Iona";
        String name11 = "James A";
        String name12 = "James H";
        String name13 = "Jesus";
        String name14 = "Lee";
        String name15 = "Magda";
        String name16 = "Shaun";
        String name17 = "Stephen";
        String name18 = "Stuart";
        String name19 = "Wil";

        names.add(name1);
        names.add(name2);
        names.add(name3);
        names.add(name4);
        names.add(name5);
        names.add(name6);
        names.add(name7);
        names.add(name8);
        names.add(name9);
        names.add(name10);
        names.add(name11);
        names.add(name12);
        names.add(name13);
        names.add(name14);
        names.add(name15);
        names.add(name16);
        names.add(name17);
        names.add(name18);
        names.add(name19);

        this.names = names;
    }

    public int getInt() {
        return 3;
    }

    public ArrayList<String> getNames() {
        return names;
    }

    public String getFirstName() {
        return names.get(0);
    }

    public int getNameListLength() {
        return names.size();
    }

    public String getRandomName() {
        int quantity = names.size();
        Random random = new Random();
        int index = random.nextInt(quantity);
        return names.get(index);
    }

    public ArrayList<String> getRandomNames(int numberOfNames) {
        ArrayList<String> namesToReturn = new ArrayList<String>();
        int nameListLength = this.getNameListLength();
        while (names.size() > nameListLength - numberOfNames) {
            int quantity = names.size();
            Random random = new Random();
            int index = random.nextInt(quantity);
            String additionalName = names.remove(index);
            namesToReturn.add(additionalName);
        }
        return namesToReturn;
    }



}
