package cl.trustbank.db_user_svc.model.dto.address;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonProperty;

import cl.trustbank.db_user_svc.model.dto.user.UserDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddressDTO {
	private int addressId;
	private String street;
	private int houseNumber;
	private int deptoNumber;
	private String comune;
	private String city;
	private String region;
	private int userId;
	@JsonProperty(value = "user")
	private UserDTO userDTO;
	private Instant createdAt;
	private Instant updatedAt;
}
