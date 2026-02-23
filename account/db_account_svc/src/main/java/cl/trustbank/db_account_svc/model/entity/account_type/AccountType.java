package cl.trustbank.db_account_svc.model.entity.account_type;

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
@Table(name = "account_type")
public class AccountType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "account_type_id", nullable = false)
	private int accountTypeId;

	@Basic
	@Column(name = "name", nullable = false, length = 30)
	private String name;
}
