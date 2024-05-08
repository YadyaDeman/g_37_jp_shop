package de.aittr.g_37_jp_shop.service;


import de.aittr.g_37_jp_shop.domain.entity.Customer;
import de.aittr.g_37_jp_shop.repository.CustomerRepository;
import de.aittr.g_37_jp_shop.service.interfaces.CustomerService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@ComponentScan
public class CustomerServiceImpl implements CustomerService {
   private CustomerRepository repository;

    public CustomerServiceImpl(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public Customer save(Customer customer) {
        return null;
    }

    @Override
    public List<Customer> getAll() {
        return null;
    }

    @Override
    public Customer getById(Long id) {
        if (id == null || id < 1) {
            throw new RuntimeException("Customers data is incorrect");
        }

        Customer customer = repository.findById(id).orElse(null);

        if (customer == null) {
            throw new RuntimeException("Customer not found");
        }

        return customer;
    }

    @Override
    public void update(Customer customer) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void deleteByEmail(String email) {

    }

    @Override
    public void restoreById(Long id) {

    }
}
