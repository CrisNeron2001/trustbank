package cl.trustbank.db_user_svc.model.dto.permit_role;

import com.fasterxml.jackson.annotation.JsonProperty;

import cl.trustbank.db_user_svc.model.dto.permit.PermitDTO;
import cl.trustbank.db_user_svc.model.dto.role.RoleDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PermitRoleDTO {
	private int permitRoleId;
	@JsonProperty(value = "permission")
	private PermitDTO permitDTO;
	@JsonProperty(value = "role")
	private RoleDTO roleDTO;
}
