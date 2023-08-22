package project.second.trytwo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.second.trytwo.entity.ContactUsENTITY;

public interface contactUsRepository extends JpaRepository<ContactUsENTITY, Integer> {

}
