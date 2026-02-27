package cl.trustbank.db_user_svc.repository.permit_role;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.trustbank.db_user_svc.model.entity.permit_role.PermitRole;

public interface PermitRoleRepository extends JpaRepository<PermitRole, Integer>{
	
}
