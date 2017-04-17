package com.example.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by poojitha.nelluri on 3/30/2017.
 */
@Entity
@Table(name = "Organizations")
public class Organizations implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Iterable Organizations;
    private Integer organization_id;
    private String organization_name;
    private Date created_date;

   // protected Organizations(){
        //this.organization_name = organization_name;
       // this.created_date = created_date;

        public Integer getOrganization_id() {
            return organization_id;
        }

        public void setOrganization_id(Integer organization_id) {
            this.organization_id = organization_id;
        }

        public String getOrganization_name() {
            return organization_name;
        }

        public void setOrganization_name(String organization_name) {
            this.organization_name = organization_name;
        }

        public Date getCreated_date() {
            return created_date;
        }

        public void setCreated_date(Date created_date) {
            this.created_date = created_date;
        }


}
