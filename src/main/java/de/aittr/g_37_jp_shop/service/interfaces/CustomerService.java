package de.aittr.g_37_jp_shop.service.interfaces;

import de.aittr.g_37_jp_shop.domain.entity.Customer;

import java.util.List;



public interface CustomerService {

    Customer save(Customer customer);

    List<Customer> getAll();

    Customer getById(Long id);

    void update(Customer customer);

    void deleteById(Long id);

    void deleteByEmail(String email);

    void restoreById(Long id);


}
