package cl.trustbank.db_user_svc.model.entity.permit_role;

import com.fasterxml.jackson.annotation.JsonBackReference;

import cl.trustbank.db_user_svc.model.entity.permit.Permit;
import cl.trustbank.db_user_svc.model.entity.permit_role_id.PermitRoleId;
import cl.trustbank.db_user_svc.model.entity.role.Role;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Index;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(
	name = "permit_role",
	indexes = {
		@Index(columnList = "permit_id", name = "idx_permit_permit_role_permit_id"),
		@Index(columnList = "role_id", name = "idx_permit_role_role_role_id", unique = true)
	}
)
public class PermitRole {

	@EmbeddedId
	private PermitRoleId permitRoleId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(
		name = "permit_id",
		nullable = false,
		foreignKey = @ForeignKey(name = "fk_permit_permit_role_permit_id")
	)
	@JsonBackReference
	private Permit permit;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(
		name = "role_id",
		nullable = false,
		foreignKey = @ForeignKey(name = "fk_role_permit_role_role_id")
	)
	@JsonBackReference
	private Role role;
	
}