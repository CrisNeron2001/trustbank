package cl.trustbank.db_user_svc.model.dto.permit_role_id;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PermitRoleIdDTO implements Serializable {
	private int permitId;
	private int roleId;
}
