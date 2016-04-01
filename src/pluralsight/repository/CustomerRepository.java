package pluralsight.repository;


import pluralsight.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
