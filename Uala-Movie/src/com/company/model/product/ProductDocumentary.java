package com.company.model.product;

/**
 * Documentary.
 * This class represents the Documentary object.
 *
 * @author Roy Alejandro Martinez Valderrama, roymartinezv@gmail.com
 * @since 1.0.0-SNAPSHOT
 */
public class ProductDocumentary extends Product {

    /**
     * Validate if it is interesting content.
     *
     * @return true or false.
     */
    @Override
    public boolean validateInterestingContent() {
        Boolean isInteresting = this.getTitle().contains("unofficial") ? true : false;
        return isInteresting;
    }

}
