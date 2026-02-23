package cl.trustbank.db_transfer_svc.model.entity.operation;

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
@Table(name = "operation")
public class Operation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "operation_id", nullable = false)
	private int operationId;

	@Basic
	@Column(name = "type", nullable = false, length = 20)
	private String type;

	@Basic
	@Column(name = "status", nullable = false, length = 20)
	private String status;

	@Basic
	@ColumnDefault(value = "now()")
	@Column(name = "created_at", nullable = false)
	private Instant createdAt;

	@Basic
	@Column(name = "updated_at", nullable = true)
	private Instant updatedAt;
}
