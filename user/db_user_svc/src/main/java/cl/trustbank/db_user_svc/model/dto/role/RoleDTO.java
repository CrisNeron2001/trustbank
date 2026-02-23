package cl.trustbank.db_user_svc.model.dto.role;

import java.time.Instant;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RoleDTO {
	private int roleId;
	private String name;
	private Instant createdAt;
	private Instant updatedAt;
}
