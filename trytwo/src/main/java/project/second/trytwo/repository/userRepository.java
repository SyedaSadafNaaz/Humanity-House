package project.second.trytwo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import project.second.trytwo.entity.UserENTITY;


@Repository
public interface userRepository extends JpaRepository<UserENTITY, Integer> {

	public UserENTITY findByEmail(String email);
	
	public UserENTITY findById(int id);
	
	@Query(value="select objUser from UserENTITY objUser where objUser.email=:email and objUser.password=:password")
	public UserENTITY authenticateUser(@Param("email")String email,@Param("password")String password);

	public UserENTITY findByEmailAndPassword(String email, String password);
	
	
	
	}
	
