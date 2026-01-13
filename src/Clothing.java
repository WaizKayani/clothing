import components.map.Map;
import components.map.Map2;
import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Clothing component.
 * 
 * @author Waiz Kayani
 */
public class Clothing {

    /**
     * Using map as underlying data structure.
     */
    private Map<String, Double> outfit;

    /**
     * Declared as public.
     */
    public Clothing() {
        this.outfit = new Map2<>();

    }

    /**
     * Adds item and price.
     * 
     * @param item
     * @param price
     */
    public void add(String item, double price) {
        this.outfit.add(item, price);

    }

    /**
     * Removes item from the outfit.
     * 
     * @param item
     */
    public void remove(String item) {
        if (this.outfit.hasKey(item)) {
            this.outfit.remove(item);
        }

    }

    /**
     * Clears all items from the outfit.
     */
    public void clearOutfit() {
        this.outfit.clear();

    }

    /**
     * Calculates the total cost of the outift.
     * 
     * @return total cost.
     */
    public double outfitCost() {

        double cost = 0;
        for (Map.Pair<String, Double> pair : this.outfit) {
            cost += pair.value();
        }
        return cost;

    }

    /**
     * Prints a summary of all the items and its price possibly could be used as
     * a reciept.
     */
    public void outFitSummary() {
        SimpleWriter out = new SimpleWriter1L();

        for (Map.Pair<String, Double> pair : this.outfit) {
            out.println("Item: " + pair.key() + " Cost: $" + pair.value());

        }
        out.close();
    }

    /**
     * Main method.
     * 
     * @param args
     */
    public static void main(String[] args) {
        SimpleWriter out = new SimpleWriter1L();
        SimpleReader in = new SimpleReader1L();

        Clothing c = new Clothing();
        c.add("Shirt", 20);
        c.add("pants", 30);
        c.outFitSummary();
        out.println("Cost: " + c.outfitCost());

        out.close();
        in.close();

    }
}
