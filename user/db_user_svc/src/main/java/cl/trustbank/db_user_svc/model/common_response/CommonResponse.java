package cl.trustbank.db_user_svc.model.common_response;

import lombok.Data;

@Data
public class CommonResponse {
	private String codeResponse;
	private String messageResponse;
	private Object data;
}
