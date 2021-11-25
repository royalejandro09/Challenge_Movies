package com.company.model.product;

/**
 * Product.
 * This class represents the Product object.
 *
 * @author Roy Alejandro Martinez Valderrama, roymartinezv@gmail.com
 * @since 1.0.0-SNAPSHOT
 */
public abstract class Product {

    /**
     * The title attribute refers to the name of the product be it series, film or Documentary.
     */
    private String title;

    /**
     * The releaseYear attribute refers to the year of release.
     */
    private int releaseYear;

    /**
     * The duration attribute refers to the duration in time.
     */
    private int duration;

    /**
     * Validate if it is Interesting Content.
     *
     * @return true or false
     */
    public abstract boolean validateInterestingContent();

    /**
     * Getter & Setter
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * ToString
     */
    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", duration=" + duration +
                '}';
    }

}
