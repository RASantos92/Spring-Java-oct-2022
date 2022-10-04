package com.robert.mvcdemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.robert.mvcdemo.models.Donation;
import com.robert.mvcdemo.repositories.DonationRepository;

@Service
public class DonationService {

	public final DonationRepository donationRepo;
	
	
	public DonationService(DonationRepository donationRepo) {
		this.donationRepo = donationRepo;
	}
	
	public List<Donation> findAll(){
		return (List<Donation>) donationRepo.findAll();
	}
	
	public Donation create(Donation donation) {
		return donationRepo.save(donation);
	}
	
	public Donation update(Donation donation) {
		return donationRepo.save(donation);
	}
	
	public void delete(Long id) {
		donationRepo.deleteById(id);
	}
	
	public Donation getOne(Long id) {
		 return donationRepo.findById(id).isPresent() ? donationRepo.findById(id).get() : null;
		
//		if(optionalDonation.isPresent()) {
//			Donation foundDonation = optionalDonation.get();
//			return foundDonation;
//		} else {
//			return null;
//		}
	}

}
