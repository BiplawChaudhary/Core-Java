package com.may9.CRUDPractice.repository;

import com.may9.CRUDPractice.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AddressRepo extends JpaRepository<Address, Integer> {
    @Query(
            nativeQuery = true,
            value = "SELECT * from address_2 where id=?1"
    )
    Address getById(Integer id);
}
