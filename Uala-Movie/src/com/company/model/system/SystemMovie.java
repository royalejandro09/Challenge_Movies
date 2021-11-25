package com.company.model.system;

import com.company.model.product.Product;
import com.company.model.user.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * SystemMovie.
 * This class represents the SystemMovie business classs.
 *
 * @author Roy Alejandro Martinez Valderrama, roymartinezv@gmail.com
 * @since 1.0.0-SNAPSHOT
 */
public class SystemMovie {

    /**
     * The listProducts attribute refers to the list of products from System Movies.
     */
    private List<Product> listProducts;

    /**
     * The listUsers attribute refers to the list of Users from System Movies.
     */
    private List<User> listUsers;

    /**
     * The userSessions attribute refers to the number of sessions that the user has.
     */
    private Map<String, Integer> userSessions;

    /**
     * Constructor.
     *
     * @param listProducts
     * @param listUsers
     */
    public SystemMovie(List<Product> listProducts, List<User> listUsers) {
        this.listProducts = listProducts;
        this.listUsers = listUsers;
        this.userSessions = new HashMap<>();
    }

    /**
     * User Login.
     *
     * @param user
     * @return a msg indicates if the user logged in.
     */
    public String userLogin(User user) {

        String successfuLogin = "Login not successful for user: " + user.getId();

        if (listUsers.contains(user)) {

            int numberOfScreens = user.getSubscription().getNumberOfScreens();

            int numberOfActiveSessions =
                    userSessions.get(user.getId()) == null ? 0 : userSessions.get(user.getId());

            if (numberOfScreens > numberOfActiveSessions) {
                userSessions.put(user.getId(), numberOfActiveSessions + 1);
                successfuLogin = "Login successful for user: " + user.getId();
            }
        }
        return successfuLogin;
    }

    /**
     * User LogOut
     *
     * @param user
     * @return a msg indicates if the user logged out.
     */
    public String userLogOut(User user) {

        String successfuLogin = "LogOut not succesful for user: " + user.getId();

        if (listUsers.contains(user)) {

            int numberOfActiveSessions =
                    userSessions.get(user.getId()) == null ? 0 : userSessions.get(user.getId());

            userSessions.put(user.getId(), numberOfActiveSessions - 1);
            successfuLogin = "LogOut succesful for user: " + user.getId();
        }
        return successfuLogin;
    }

    /**
     * Recommendation according User Status
     *
     * @param user an {@link User} object.
     * @return a Product List.
     */
    public List<Product> recommendationAccordingUserStatus(User user) {
        return user.getStatus().recommendationAccordingUserStatus(listProducts);

    }

    /**
     * Charge the user depending on the subscription.
     *
     * @param user an {@link User} object.
     * @return a double with the charge.
     */
    public double chargeSubscriptionUser(User user) {
        return user.getSubscription().chargeSubscription();
    }

    /**
     * Getter & Setter
     */
    public List<Product> getListProducts() {
        return listProducts;
    }

    public void setListProducts(List<Product> listProducts) {
        this.listProducts = listProducts;
    }

    public List<User> getListUsers() {
        return listUsers;
    }

    public void setListUsers(List<User> listUsers) {
        this.listUsers = listUsers;
    }

    public Map<String, Integer> getUserSessions() {
        return userSessions;
    }

    public void setUserSessions(Map<String, Integer> userSessions) {
        this.userSessions = userSessions;
    }
}
