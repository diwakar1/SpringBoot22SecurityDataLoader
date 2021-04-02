package com.example.demo;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name="email",nullable = false)
    private String email;

    @Column(name = "last_name")
    private String lastName;

    @Column(name="enabled")
    private boolean enabled;


    @Column(name = "user_name")
    private String userName;

    @Column(name="password")
    private String password;

   @ManyToMany(fetch = FetchType.EAGER)
   @JoinTable(joinColumns = @JoinColumn(name="user_id"),
              inverseJoinColumns = @JoinColumn(name="role_id"))

    private Collection<Role>roles;

    public User() {
    }

    public User( String firstName, String email, String lastName, boolean enabled, String userName, String password) {
        this.firstName = firstName;
        this.email = email;
        this.lastName = lastName;
        this.enabled = enabled;
        this.userName = userName;
        this.password = password;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }
}
