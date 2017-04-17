package com.example.controller;

import com.example.Service.OrganizationService;
import com.example.model.Organizations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by poojitha.nelluri on 3/30/2017.
 */


@RestController
@RequestMapping("/tcfj/")
public class OrganizationController {
    @Autowired
    public OrganizationController(OrganizationService service) {
        this.service = service;
    }




    private OrganizationService service;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(path = "/organizations/", method = RequestMethod.GET)
    public List<Organizations> getAllOrganizations() {
        return service.getAllOrganizations();

    }

     @ResponseStatus(HttpStatus.ACCEPTED)
     @RequestMapping(path = "/organizations/", method = RequestMethod.POST)
     public Organizations createOrganization(){

        return null;
     }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping(path = "/organizations/", method = RequestMethod.PUT)
    public Organizations updateOrganization() {

         return null;
    }


    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping(path = "/organizations/", method = RequestMethod.DELETE)
    public Organizations deleteOrganization() {
        return null;

    }

}
