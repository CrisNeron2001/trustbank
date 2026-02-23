package cl.trustbank.db_user_svc.model.entity.permit;

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
@Table(name = "permit")
public class Permit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "permit_id", nullable = false)
	private int permitId;

	@Basic
	@Column(name = "name", nullable = false, length = 20)
	private String name;

	@Basic
	@ColumnDefault(value = "now()")
	@Column(name = "created_at", nullable = false)
	private Instant createdAt;

	@Basic
	@Column(name = "updated_at", nullable = true)
	private Instant updatedAt;
}
