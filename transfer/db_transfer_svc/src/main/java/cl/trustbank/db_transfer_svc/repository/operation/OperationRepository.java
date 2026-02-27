package cl.trustbank.db_transfer_svc.repository.operation;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.trustbank.db_transfer_svc.model.entity.operation.Operation;

public interface OperationRepository extends JpaRepository<Operation, Integer> {
	
}
