package cl.trustbank.db_transfer_svc.model.dto.ledger;

import com.fasterxml.jackson.annotation.JsonProperty;

import cl.trustbank.db_transfer_svc.model.dto.operation.OperationDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LedgerDTO {
	private int ledgerId;
	private float amount;
	private String directionType;
	private int accountId;
	private int operationId;
	@JsonProperty(value = "operation")
	private OperationDTO operationDTO;
}
