package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.*;

/**
 * Created by shaungould on 3/7/16.
 */

@Entity
public class Tanda {

    @Id
    @GeneratedValue
    @Column(name="TANDA_ID")
    private Long id;

    @Column(name="TANDA_CONTRIBUTIONAMOUNT")
    private int contributionAmount;

    @Column(name="TANDA_TANDAMEMBERS")
    private List<User> tandaMembers = new ArrayList<User>();

    @Column(name="TANDA_TANDATITLE")
    private String tandaTitle;

    public List<User> getTandaMembers() {
        return tandaMembers;
    }

    public void setTandaMembers(List<User> tandaMembers) {
        this.tandaMembers = tandaMembers;
    }

    public String getTandaTitle() {
        return tandaTitle;
    }

    public void setTandaTitle(String tandaTitle) {
        this.tandaTitle = tandaTitle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getContributionAmount() {
        return contributionAmount;
    }

    public void setContributionAmount(int contributionAmount) {
        this.contributionAmount = contributionAmount;
    }
}
