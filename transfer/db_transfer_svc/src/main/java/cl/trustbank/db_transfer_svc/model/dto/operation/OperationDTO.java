package cl.trustbank.db_transfer_svc.model.dto.operation;

import java.time.Instant;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OperationDTO {
	private int operationId;
	private String type;
	private String status;
	private Instant createdAt;
	private Instant updatedAt;
}
