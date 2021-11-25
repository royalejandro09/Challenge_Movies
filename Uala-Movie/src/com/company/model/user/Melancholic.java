package com.company.model.user;

import com.company.model.product.Product;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Melancholic.
 * This class represents the Melancholic object.
 *
 * @author Roy Alejandro Martinez Valderram, roymartinezv@gmail.com
 * @since 1.0.0-SNAPSHOT
 */
public class Melancholic implements IUserStatus {

    /**
     * An User instance.
     */
    private User user;

    /**
     * Constructor.
     *
     * @param user
     */
    public Melancholic(User user) {
        this.user = user;
    }

    /**
     * Recommendation according to user status ( Happy, Sad and Melancholic).
     *
     * @param listProduct with all products from Uala-Movies.
     * @return a list of {@link Product} with Series, Mocies and Documentaries.
     */
    @Override
    public List<Product> recommendationAccordingUserStatus(List<Product> listProduct) {

        List<Product> filterListProduct = listProduct.stream()
                .filter(product -> LocalDate.now().getYear() - product.getReleaseYear() > 10)
                .collect(Collectors.toList());
        return filterListProduct;
    }
}
