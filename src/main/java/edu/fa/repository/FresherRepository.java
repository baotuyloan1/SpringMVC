package edu.fa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.fa.model.Fresher;

@Repository
public interface FresherRepository extends JpaRepository<Fresher, Integer> {

	Fresher findByUsernameAndPassword(String username, String password);

//	public boolean authenticate(Fresher fresher) {
//		if (fresher.getUsername().equals(fresher.getPassword())) {
//			return false;
//		}
//
//		return true;
//	}
//
//	public boolean register(Fresher fresher) {
//		if (fresher.getUsername().equals(fresher.getPassword())) {
//			return false;
//		}
//
//		return true;
//	}

}
