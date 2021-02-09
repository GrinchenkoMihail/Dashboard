package com.luxoft.upskilling.dashboard.rest;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/dashboard")
public class Controllers {

    @PreAuthorize("hasAuthority('user:read')")
    @GetMapping("/people")
    public void toPeopleDir(){

    }

    public void toVacations(){

    }

    public void toPayroll(){

    }


}
