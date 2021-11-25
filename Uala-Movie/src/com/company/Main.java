package com.company;

import com.company.data.Data;
import com.company.model.product.Product;
import com.company.model.system.SystemMovie;
import com.company.model.user.User;

import java.util.List;

//Do not modify this file.
public class Main {

    public static void main(String[] args) {
        // write your code here

        /**
         * Initialize SystemMovie instance.
         */
        SystemMovie ualaMovies = new SystemMovie(Data.createListProducts(), Data.createListUsers());

        /**
         * Initialize user.
         */
        User user2 = Data.createUser();

        /**
         * User login in the System.
         */
        String loginMsg = ualaMovies.userLogin(user2);
        System.out.println(loginMsg);


        /**
         * Ask the system for recomendations based on the user's status.
         */
        List<Product> recommendedProducts = ualaMovies.recommendationAccordingUserStatus(user2);
        recommendedProducts.stream().forEach(product -> System.out.println(product.toString() + "\n"));

        /**
         * Ask the system for recommendatiosn interesting.
         */
        List<Product> recommendedProductsInteresting =
                ualaMovies.recommendationAccordingUserStatus(user2);
        recommendedProducts.stream().forEach(product -> {
            if (product.validateInterestingContent()) {
                System.out.println(product.toString());
            }
        });

        /**
         * Charge the user depending on the subscrition.
         */
        double subscriptionCharge = ualaMovies.chargeSubscriptionUser(user2);
        System.out.println("Subscription Charge to user: " + user2.getId() + " is: " + subscriptionCharge);

        /**
         * User logOut in the system
         */
        String logOutMsg = ualaMovies.userLogOut(user2);
        System.out.println(logOutMsg);

    }

}
