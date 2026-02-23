package cl.trustbank.db_account_svc.model.dto.account_type;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AccountTypeDTO {
	private int accountTypeId;
	private String name;
}