package cl.trustbank.db_transfer_svc.model.entity.ledger;

import com.fasterxml.jackson.annotation.JsonBackReference;

import cl.trustbank.db_transfer_svc.model.entity.operation.Operation;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "ledger")
public class Ledger {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ledger_id", nullable = false)
	private int ledgerId;

	@Basic
	@Column(name = "amount", nullable = false)
	private float amount;

	@Basic
	@Column(name = "direction_type", nullable = false, length = 20)
	private String directionType;

	@Basic
	@Column(name = "account_id", nullable = false)
	private int accountId;

	@Basic
	@Column(name = "operation_id", nullable = false, insertable = false, updatable = false)
	private int operationId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(
		name = "operation_id",
		nullable = false,
		referencedColumnName = "operation_id",
		foreignKey = @ForeignKey(name = "fk_operation_ledger_operation_id")
	)
	@JsonBackReference
	private Operation operation;
}
