package cl.trustbank.db_account_svc.repository.currency;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.trustbank.db_account_svc.model.entity.currency.Currency;

public interface CurrencyRepository extends JpaRepository<Currency, Integer> {
	
}
