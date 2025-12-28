/**
 * Clothing abstract class.
 */
public abstract class Clothingabstactclass {

    /**
     * Would represent the brand of the clothing.
     */
    private String brand;
    /**
     * Would represent the size of the clothing.
     */
    private String size;
    /**
     * Would represent the color of the clothing.
     */
    private String color;

    /**
     * Would represent the material of the clothing.
     */
    private String material;

    /**
     * Clothing component with brand size and color.
     *
     * @param brand
     *            the brand of the clothing
     * @param size
     *            size of the clothing item
     * @param color
     *            color of the clothing item
     * @param material
     *            material of the clothing item
     */
    public Clothingabstactclass(String brand, String size, String color,
            String material) {
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.material = material;
    }

    /**
     * Gets the brand.
     *
     * @return the brand.
     */
    public final String getBrand() {
        return this.brand;
    }

    /**
     * Gets the size.
     *
     * @return the size.
     */
    public final String getSize() {
        return this.size;
    }

    /**
     * Gets the color.
     *
     * @return the color.
     */
    public final String getColor() {
        return this.color;
    }

    /**
     * Gets the material.
     *
     * @return the material.
     */
    public final String getMaterial() {
        return this.material;
    }

}
