package com.robert.mvcdemo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.robert.mvcdemo.models.Donation;

@Repository
public interface DonationRepository extends CrudRepository<Donation, Long> {
//	List<Donation> findAll(); // they need to follow jpa documentation. we will get more in depth tomorrow.
}
