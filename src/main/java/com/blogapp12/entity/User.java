package com.blogapp12.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private String username;
    private String password;

    @ManyToMany(fetch =FetchType.EAGER ,cascade = CascadeType.ALL)
    @JoinTable(name ="user_roles",
    joinColumns = @JoinColumn(name ="user_id",referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name="role_id",referencedColumnName = "id"))
    private Set<Role> roles;

}
