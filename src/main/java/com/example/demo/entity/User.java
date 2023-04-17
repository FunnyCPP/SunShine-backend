package com.example.demo.entity;

import com.example.demo.service.UserDetails;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.secure.spi.GrantedPermission;


import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "user")

public class User implements UserDetails {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;

    @Override
    public Collection<? extends GrantedPermission> getAuthotities() {
        return null;
    }
}

