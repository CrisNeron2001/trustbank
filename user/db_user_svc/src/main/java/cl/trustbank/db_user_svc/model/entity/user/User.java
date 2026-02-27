package cl.trustbank.db_user_svc.model.entity.user;

import java.time.Instant;

import org.hibernate.annotations.ColumnDefault;

import com.fasterxml.jackson.annotation.JsonBackReference;

import cl.trustbank.db_user_svc.model.entity.role.Role;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(
	name = "user_trustbank",
	indexes = {
		@Index(columnList = "rut_code", name = "idx_user_rut_code", unique = true),
		@Index(columnList = "pass_code", name = "idx_user_pass_code")
	}
)
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id", nullable = false)
	private int userId; 

	@Basic
	@Column(name = "first_name", nullable = false, length = 30)
	private String firstName;

	@Basic
	@Column(name = "middle_name", nullable = true, length = 30)
	private String middleName;

	@Basic
	@Column(name = "last_name", nullable = false, length = 60)
	private String lastName;

	@Basic
	@Column(name = "rut_code", nullable = false, length = 12, unique = true)
	private String rutCode;

	@Basic
	@Column(name = "email", nullable = false, length = 60)
	private String email;

	@Basic
	@Column(name = "phone", nullable = true, length = 12)
	private String phone;

	@Basic
	@Column(name = "pass_code", nullable = false, length = 4)
	private String passCode;

	@Basic
	@Column(name = "is_enabled", nullable = false)
	private boolean isEnabled;

	@Basic
	@Column(name = "failed_attempts", nullable = true)
	private int failedAttempts;

	@Basic
	@Column(name = "role_id", nullable = false, insertable = false, updatable = false)
	private int roleId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(
		name = "role_id",
		referencedColumnName = "role_id",
		nullable = false,
		foreignKey = @ForeignKey(name = "fk_role_user_role_id")
	)
	@JsonBackReference
	private Role role;

	@Basic
	@ColumnDefault(value = "now()")
	@Column(name = "created_at", nullable = false)
	private Instant createdAt;

	@Basic
	@Column(name = "updated_at", nullable = true)
	private Instant updatedAt;
}
