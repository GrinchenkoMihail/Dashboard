package com.luxoft.upskilling.dashboard.model;

import javassist.Loader;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import javax.mail.search.SearchTerm;
import java.util.Set;
import java.util.stream.Collectors;

public enum Role {
    USER(Set.of(Permission.USER_READ)),
    ADMIN(Set.of(Permission.USER_READ, Permission.USER_ADD));

    private final Set<Permission> permissions;

    Role(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public Set<SimpleGrantedAuthority> getAuthorities(){
        return getPermissions().stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toSet());
    }
}
