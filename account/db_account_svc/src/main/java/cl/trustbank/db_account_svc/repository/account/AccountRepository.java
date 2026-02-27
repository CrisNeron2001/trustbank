package cl.trustbank.db_account_svc.repository.account;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.trustbank.db_account_svc.model.entity.account.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {
	
}
