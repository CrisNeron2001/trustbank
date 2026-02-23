package cl.trustbank.db_account_svc.model.dto.currency;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CurrencyDTO {
	private int currencyId;
	private String code;
	private String name;
}
