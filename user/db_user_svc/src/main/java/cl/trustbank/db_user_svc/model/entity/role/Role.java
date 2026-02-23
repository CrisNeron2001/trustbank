package cl.trustbank.db_user_svc.model.entity.role;

import java.time.Instant;

import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "role")
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "role_id", nullable = false, unique = true)
	private int roleId;
	
	@Basic
	@Column(name = "name", nullable = false, length = 30)
	private String name;

	@Basic
	@ColumnDefault(value = "now()")
	@Column(name = "created_at", nullable = false)
	private Instant createdAt;

	@Basic
	@Column(name = "updated_at", nullable = true)
	private Instant updatedAt;
}
