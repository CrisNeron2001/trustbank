package cl.trustbank.db_user_svc.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cl.trustbank.db_user_svc.model.entity.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	@Query(value = "SELECT u FROM User u WHERE u.rutCode = ?1")
	User findByRut(String rutCode);

	@Query(value = "SELECT u FROM User u WHERE u.rutCode = ?1 AND u.passCode = ?2")
	User findByRutAndPasscode(String rutCode, String passCode);
}