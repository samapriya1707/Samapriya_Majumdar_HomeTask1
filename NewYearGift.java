import java.util.ArrayList;

class Candy {
    String name;
    String flavour;
    String color;
    int weight;

    Candy(String n, String f, String t, int w) {
        name = n;
        flavour = f;
        color = t;
        weight = w;
    }
}

class Gift {
    ArrayList<Candy> candies = new ArrayList<Candy>();

    void addCandy(Candy item) {
        candies.add(item);
    }

    void Sort(String option) {
        if (option == "Flavour") {
            for (Candy item : candies) {
                if (item.flavour == "Chocolate")
                    System.out.println(item.name);
            }
            for (Candy item : candies) {
                if (item.flavour == "Caramel")
                    System.out.println(item.name);
            }
        } else if (option == "Color") {
            for (Candy item : candies) {
                if (item.color == "Brown")
                    System.out.println(item.name);
            }
            for (Candy item : candies) {
                if (item.color == "Dark Brown")
                    System.out.println(item.name);
            }
        }
    }

    void findByFlavour(String category) {
        for (Candy item : candies) {
            if (item.flavour == category)
                System.out.println(item.name);
        }
    }

    void findByColor(String category) {
        for (Candy item : candies) {
            if (item.color == category)
                System.out.println(item.name);
        }
    }
}

class Child {
    Gift gift;
    int totalWeight = 0;

    void collect(Gift g) {
        gift = g;
        for (Candy item : gift.candies) {
            totalWeight += item.weight;
        }
        System.out.println("Gift total Weight :" + totalWeight);
    }
}

class NewYearGift {
    public static void main(String[] args) {
        Candy c1 = new Candy("Atkinsons", "Chocolate", "Brown", 10);
        Candy c2 = new Candy("Brachs", "Caramel", "Dark Brown", 20);
        Candy c3 = new Candy("Bournville", "Chocolate", "Dark Brown", 15);
        Candy c4 = new Candy("Goeltze", "Caramel", "Brown", 25);

        Gift g1 = new Gift();
        g1.addCandy(c1);
        g1.addCandy(c2);

        Gift g2 = new Gift();
        g2.addCandy(c3);
        g2.addCandy(c4);

        Child child1 = new Child();
        child1.collect(g1);

        Child child2 = new Child();
        child2.collect(g2);

        child1.gift.Sort("Flavour");
        child1.gift.Sort("Color");

        child1.gift.findByFlavour("Flavour");
        child1.gift.findByColor("Color");

    }
}