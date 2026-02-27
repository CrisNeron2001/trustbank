package cl.trustbank.db_transfer_svc.repository.ledger;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.trustbank.db_transfer_svc.model.entity.ledger.Ledger;

public interface LedgerRepository extends JpaRepository<Ledger, Integer> {
	
}
