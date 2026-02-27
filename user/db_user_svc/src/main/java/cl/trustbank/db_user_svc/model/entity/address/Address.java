package cl.trustbank.db_user_svc.model.entity.address;

import java.time.Instant;

import org.hibernate.annotations.ColumnDefault;

import com.fasterxml.jackson.annotation.JsonBackReference;

import cl.trustbank.db_user_svc.model.entity.user.User;
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
@Table(name = "address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id", nullable = false)
	private int addressId;
	
	@Basic
	@Column(name = "street", nullable = false, length = 100)
	private String street;

	@Basic
	@Column(name = "house_number", nullable = true)
	private int houseNumber;

	@Basic
	@Column(name = "depto_number", nullable = true)
	private int deptoNumber;

	@Basic
	@Column(name = "comune", nullable = false, length = 100)
	private String comune;

	@Basic
	@Column(name = "city", nullable = false, length = 100)
	private String city;

	@Basic
	@Column(name = "region", nullable = false, length = 100)
	private String region;

	@Basic
	@Column(name = "user_id", nullable = false, insertable = false, updatable = false)
	private int userId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(
		name = "user_id",
		nullable = false,
		referencedColumnName = "user_id",
		foreignKey = @ForeignKey(name = "fk_user_address_user_id")
	)
	@JsonBackReference
	private User user;
	
	@Basic
	@ColumnDefault(value = "now()")
	@Column(name = "created_at", nullable = false)
	private Instant createdAt;

	@Basic
	@Column(name = "updated_at", nullable = true)
	private Instant updatedAt;
}
