package com.example.demo.service;

import org.hibernate.secure.spi.GrantedPermission;

import java.io.Serializable;
import java.util.Collection;

public interface UserDetails extends Serializable {

    Collection<? extends GrantedPermission> getAuthotities();
}
