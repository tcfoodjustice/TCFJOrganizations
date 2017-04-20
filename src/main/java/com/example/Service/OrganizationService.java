package com.example.Service;

import com.example.Repository.OrganizationRepository;
import com.example.model.Organizations;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrganizationService {

    @Autowired
    OrganizationRepository repository;

    @Autowired
    public OrganizationService(OrganizationRepository repository){

        this.repository = repository;
    }

   public List<Organizations> getAllOrganizations(){


       Iterable<Organizations> result =  repository.findAll();
       List<Organizations> myList = Lists.newArrayList(result);



       return myList;
   }



}