package com.example.Repository;

import com.example.model.Organizations;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by poojitha.nelluri on 4/5/2017.
 */

@Repository
public interface OrganizationRepository extends CrudRepository<Organizations, Integer>{


}
