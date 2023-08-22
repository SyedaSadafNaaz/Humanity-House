package project.second.trytwo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.second.trytwo.entity.DonationENTITY;

@Repository
public interface donationRepository extends JpaRepository<DonationENTITY, Integer> {

}
