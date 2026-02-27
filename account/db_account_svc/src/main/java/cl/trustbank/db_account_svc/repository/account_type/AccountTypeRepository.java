package cl.trustbank.db_account_svc.repository.account_type;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.trustbank.db_account_svc.model.entity.account_type.AccountType;

public interface AccountTypeRepository extends JpaRepository<AccountType, Integer> {
	
}
