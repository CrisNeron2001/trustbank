package cl.trustbank.db_user_svc.model.dto.user;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonProperty;

import cl.trustbank.db_user_svc.model.dto.role.RoleDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDTO {
	private int userId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String rutCode;
	private String email;
	private String phone;
	private String passCode;
	private boolean isEnabled;
	private int failedAttempts;
	private int roleId;
	@JsonProperty(value = "role")
	private RoleDTO roleDTO;
	private Instant createdAt;
	private Instant updatedAt;
}
