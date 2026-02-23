package cl.trustbank.db_user_svc.model.dto.permit;

import java.time.Instant;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PermitDTO {
	private int permitId;
	private String name;
	private Instant createdAt;
	private Instant updatedAt;
}
