public class Abstraction_Interfaces {
    public static void main(String[] args) {
        Plants indianBanyan = new Banyan();
        indianBanyan.performPhotosynthesis();
        indianBanyan.adaptToEnvironment();

        System.out.println();

        Plants sacredLotus = new Lotus();
        sacredLotus.performPhotosynthesis();
        sacredLotus.adaptToEnvironment();
    }
}

abstract class Plants {
    String name;

    Plants(String name) {
        this.name = name;
    }

    void performPhotosynthesis() {
        System.out.println(name + ": Converting CO2 and sunlight into glucose.");
    }

    abstract void adaptToEnvironment();
}

class Banyan extends Plants {
    Banyan() {
        super("Ficus benghalensis");
    }

    @Override
    void adaptToEnvironment() {
        System.out.println(name + ": Grows aerial prop roots that thicken into trunks.");
    }
}

class Lotus extends Plants {
    Lotus() {
        super("Nelumbo nucifera");
    }

    @Override
    void adaptToEnvironment() {
        System.out.println(name + ": Uses hydrophobic leaf nanostructures to repel muddy water.");
    }
}

interface Recycler {
    void cleanUpForest(); // A job/role in nature
}

interface BreadMaker {
    void puffUpDough(); // A job/role in the kitchen
}

// Button Mushroom does the Recycler job
class ButtonMushroom implements Recycler {
    @Override
    public void cleanUpForest() {
        // Hides enzyme chemistry
        System.out.println("Agaricus bisporus (Button Mushroom) turns dead leaves into rich soil.");
    }
}

// Baker's Yeast does the BreadMaker job
class BakersYeast implements BreadMaker {
    @Override
    public void puffUpDough() {
        // Hides fermentation chemistry
        System.out.println("Saccharomyces cerevisiae (Yeast) releases tiny gas bubbles to make dough fluffy.");
    }
}
