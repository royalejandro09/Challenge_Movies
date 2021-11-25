package com.company.model.user;

import com.company.model.subscription.Subscription;

import java.util.Objects;

/**
 * User.
 * This class represent the user object.
 *
 * @author Roy Alejandro Martinez Valderrama, roymartinezv@gmail.com
 * @since 1.0.0-SNAPSHOT
 */
public class User {

    /**
     * The id attribute refers to the id of user.
     */
    private String id;

    /**
     * The name attribute refers to the name of user.
     */
    private String name;

    /**
     * The Subscription attribute refers to the {@link Subscription} of user.
     */
    private Subscription subscription;

    /**
     * The StrategyUserStatus attribute refers to the status of user.
     */
    private IUserStatus status;

    /**
     * Getter & Setter
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public IUserStatus getStatus() {
        return status;
    }

    public void setStatus(IUserStatus status) {
        this.status = status;
    }

    /**
     * equals
     *
     * @param o
     * @return true or false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(name, user.name);
    }

    /**
     * hashCode
     *
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
