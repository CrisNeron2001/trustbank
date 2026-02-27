package cl.trustbank.db_account_svc.model.entity.account;

import java.time.Instant;

import org.hibernate.annotations.ColumnDefault;

import com.fasterxml.jackson.annotation.JsonBackReference;

import cl.trustbank.db_account_svc.model.entity.account_type.AccountType;
import cl.trustbank.db_account_svc.model.entity.currency.Currency;
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
@Table(name = "account")
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "account_id", nullable = false)
	private int accountId;

	@Basic
	@Column(name = "account_number", nullable = false, unique = true)
	private int accountNumber;

	@Basic
	@Column(name = "user_id", nullable = false)
	private int userId;

	@Basic
	@Column(name = "account_type_id", nullable = false, insertable = false, updatable = false)
	private int accountTypeId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn( 
		name = "account_type_id",
		nullable = false,
		referencedColumnName = "account_type_id",
		foreignKey = @ForeignKey(name = "fk_account_type_account_account_type_id")
	)
	@JsonBackReference
	private AccountType accountType;
	
	@Basic
	@Column(name = "balance", nullable = false)
	private float balance;

	@Basic
	@Column(name = "currency_id", nullable = false, insertable = false, updatable = false)
	private int currencyId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(
		name = "currency_id",
		nullable = false,
		referencedColumnName = "currency_id",
		foreignKey = @ForeignKey(name = "fk_currency_account_currency_id")
	)
	@JsonBackReference
	private Currency currency;

	@Basic
	@Column(name = "status", nullable = false)
	private String status;

	@Basic
	@ColumnDefault(value = "now()")
	@Column(name = "created_at", nullable = false)
	private Instant createdAt;

	@Basic
	@Column(name = "updated_at", nullable = true)
	private Instant updatedAt;
}
