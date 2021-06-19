package com.company;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws Exception {


        Customer customer1 = new Customer();
        customer1.setId(1);
        customer1.setFirstName("Hakan");
        customer1.setLastName("Sandal");
        customer1.setNationalityId("15002004574");
        customer1.setDateOfBirth(LocalDate.of(1996,3,13));

        BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        starbucksCustomerManager.save(customer1);





    }
}
