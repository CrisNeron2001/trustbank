package cl.trustbank.db_user_svc.model.entity.permit_role_id;

import java.io.Serializable;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
public class PermitRoleId implements Serializable {
	
	@Basic
	@Column(name = "permit_id", nullable = false)
	private int permitId;

	@Basic
	@Column(name = "role_id", nullable = false, unique = true)
	private int roleId;
}
