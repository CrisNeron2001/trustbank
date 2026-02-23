package cl.trustbank.db_account_svc.model.dto.account;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonProperty;

import cl.trustbank.db_account_svc.model.dto.account_type.AccountTypeDTO;
import cl.trustbank.db_account_svc.model.dto.currency.CurrencyDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AccountDTO {
	private int accountId;
	private int accountNumber;
	private int userId;
	private int accountTypeId;
	@JsonProperty(value = "account_type")
	private AccountTypeDTO accountTypeDTO;
	private float balance;
	private int currencyId;
	@JsonProperty(value = "currency")
	private CurrencyDTO currencyDTO;
	private String status;
	private Instant createdAt;
	private Instant updatedAt;
}
