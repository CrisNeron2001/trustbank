package cl.trustbank.db_account_svc.model.entity.currency;

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
@Table(name = "currency")
public class Currency {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "currency_id", nullable = false)
	private int currencyId;

	@Basic
	@Column(name = "code", nullable = false)
	private String code;

	@Basic
	@Column(name = "name", nullable = false)
	private String name;
}
