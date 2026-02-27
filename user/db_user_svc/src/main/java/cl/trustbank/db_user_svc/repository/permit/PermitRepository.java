package cl.trustbank.db_user_svc.repository.permit;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.trustbank.db_user_svc.model.entity.permit.Permit;

public interface PermitRepository extends JpaRepository<Permit, Integer> {
	
}
