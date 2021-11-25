package com.company.data;


import com.company.model.factory.ProductFactory;
import com.company.model.factory.SubscriptionFactory;
import com.company.model.product.Product;
import com.company.model.product.ProductDocumentary;
import com.company.model.product.ProductMovie;
import com.company.model.product.ProductSerie;
import com.company.model.subscription.SubscriptionClassic;
import com.company.model.subscription.SubscriptionGold;
import com.company.model.subscription.SubscriptionPlatinum;
import com.company.model.user.Happy;
import com.company.model.user.Melancholic;
import com.company.model.user.Sad;
import com.company.model.user.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Data.
 * This class represents the Data Class.
 *
 * @author Roy Alejandro Martinez Valderrama, roymartinezv@gmail.com
 * @since 1.0.0-SNAPSHOT
 */
public class Data {

    /**
     * Create an user
     *
     * @return a {@link User} object.
     */
    public static User createUser() {

        SubscriptionGold gold = (SubscriptionGold) SubscriptionFactory.getInstance().createSubscription("Gold");

        gold.setPrice(3500.0);
        gold.setSubscriptionStartDate(LocalDate.of(2019, 11, 1));
        gold.setNumberOfScreens(3);
        gold.setPaymentMethod("Paypal");

        User user2 = new User();
        user2.setId("user2");
        user2.setName("nameUser2");
        user2.setSubscription(gold);
        user2.setStatus(new Sad(user2));

        return user2;
    }

    /**
     * Create List Users.
     *
     * @return a list of {@link User}
     */
    public static List<User> createListUsers() {

        SubscriptionClassic classic = (SubscriptionClassic) SubscriptionFactory.getInstance().createSubscription("Classic");
        classic.setPrice(3000.0);
        classic.setSubscriptionStartDate(LocalDate.now());
        classic.setNumberOfScreens(1);
        classic.setPaymentMethod("Credit card");

        User user1 = new User();
        user1.setId("user1");
        user1.setName("nameUser1");
        user1.setSubscription(classic);
        user1.setStatus(new Happy(user1));

        SubscriptionGold gold = (SubscriptionGold) SubscriptionFactory.getInstance().createSubscription("Gold");
        gold.setPrice(9000.0);
        gold.setSubscriptionStartDate(LocalDate.of(2020, 11, 1));
        gold.setNumberOfScreens(3);
        gold.setPaymentMethod("Paypal");

        User user2 = new User();
        user2.setId("user2");
        user2.setName("nameUser2");
        user2.setSubscription(gold);
        user2.setStatus(new Sad(user2));

        SubscriptionPlatinum platinum = (SubscriptionPlatinum) SubscriptionFactory.getInstance().createSubscription("Platinum");
        platinum.setPrice(15000.0);
        platinum.setSubscriptionStartDate(LocalDate.of(2019, 11, 9));
        platinum.setNumberOfScreens(3);
        platinum.setPaymentMethod("Credit card");


        User user3 = new User();
        user3.setId("user3");
        user3.setName("nameUser3");
        user3.setSubscription(platinum);
        user3.setStatus(new Melancholic(user3));

        List<User> listUser = new ArrayList<>();
        listUser.add(user1);
        listUser.add(user2);
        listUser.add(user3);
        return listUser;

    }

    /**
     * Create List Products.
     *
     * @returna list of  {@link Product}
     */
    public static List<Product> createListProducts() {

        ProductSerie mySerie1 = (ProductSerie) ProductFactory.getInstance().createProduct("Serie");
        mySerie1.setTitle("Lupan");
        mySerie1.setReleaseYear(2020);
        mySerie1.setNumberOfSeasons(2);
        mySerie1.setDuration(1);

        ProductSerie mySerie2 = (ProductSerie) ProductFactory.getInstance().createProduct("Serie");
        mySerie2.setTitle("The Hundred");
        mySerie2.setReleaseYear(2015);
        mySerie2.setNumberOfSeasons(7);
        mySerie2.setDuration(2);

        ProductSerie mySeries3 = (ProductSerie) ProductFactory.getInstance().createProduct("Serie");
        mySeries3.setTitle("StrangerThings");
        mySeries3.setReleaseYear(2016);
        mySeries3.setDuration(3);
        mySeries3.setNumberOfSeasons(4);

        ProductMovie movie1 = (ProductMovie) ProductFactory.getInstance().createProduct("Movie");
        movie1.setTitle("Venom");
        movie1.setReleaseYear(2021);
        movie1.setDuration(1);
        movie1.setNumberOfAwards(2);

        ProductMovie movie2 = (ProductMovie) ProductFactory.getInstance().createProduct("Movie");
        movie2.setTitle("Parasitos");
        movie2.setReleaseYear(2020);
        movie2.setDuration(2);
        movie2.setNumberOfAwards(1);

        ProductMovie movie3 = (ProductMovie) ProductFactory.getInstance().createProduct("Movie");
        movie3.setTitle("Eternals");
        movie3.setReleaseYear(2021);
        movie3.setDuration(3);
        movie3.setNumberOfAwards(1);

        ProductDocumentary myDocumentary1 = (ProductDocumentary) ProductFactory.getInstance().createProduct("Documentary");
        myDocumentary1.setTitle("unofficial La Sal de la Tierra");
        myDocumentary1.setReleaseYear(2014);
        myDocumentary1.setDuration(1);

        ProductDocumentary myDocumentary2 = (ProductDocumentary) ProductFactory.getInstance().createProduct("Documentary");
        myDocumentary2.setTitle("Apolo 11");
        myDocumentary2.setReleaseYear(2019);
        myDocumentary2.setDuration(2);

        ProductDocumentary myDocumentary3 = (ProductDocumentary) ProductFactory.getInstance().createProduct("Documentary");
        myDocumentary3.setTitle("Inside Job");
        myDocumentary3.setReleaseYear(2010);
        myDocumentary3.setDuration(3);


        List<Product> listProducts = new ArrayList<>();
        listProducts.add(mySerie1);
        listProducts.add(mySerie2);
        listProducts.add(mySeries3);

        listProducts.add(movie2);
        listProducts.add(movie3);
        listProducts.add(movie1);

        listProducts.add(myDocumentary1);
        listProducts.add(myDocumentary2);
        listProducts.add(myDocumentary3);

        return listProducts;
    }
}