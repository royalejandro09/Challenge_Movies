package com.company.model.factory;

import com.company.model.product.Product;
import com.company.model.product.ProductDocumentary;
import com.company.model.product.ProductMovie;
import com.company.model.product.ProductSerie;

/**
 * ProductFcatory
 * This class represents the ProductFcatory to create product instances.
 *
 * @author Roy Alejandro Martinez Valderrama, roymartinezv@gmail.com
 * @since 1.0.0-SNAPSHOT
 */
public class ProductFactory {

    /**
     * Attribute Instance
     */
    private static ProductFactory instance;

    /**
     * ProductFactory constructor by default.
     */
    private ProductFactory() {
    }

    /**
     * Get instance ProductFactory.
     *
     * @return an instance from {@link ProductFactory}
     */
    public static ProductFactory getInstance() {
        if (instance == null) {
            instance = new ProductFactory();
        }
        return instance;
    }

    /**
     * CreateProduct.
     *
     * @param type
     * @return
     */
    public Product createProduct(String type) {

        Product prod;
        switch (type) {
            case "Serie":
                prod = new ProductSerie();
                break;
            case "Movie":
                prod = new ProductMovie();
                break;
            case "Documentary":
                prod = new ProductDocumentary();
                break;
            default:
                prod = null;
        }
        return prod;
    }


}
