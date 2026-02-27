package cl.trustbank.db_user_svc.repository.role;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.trustbank.db_user_svc.model.entity.role.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	
}
