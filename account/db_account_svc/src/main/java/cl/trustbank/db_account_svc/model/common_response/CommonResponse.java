package cl.trustbank.db_account_svc.model.common_response;

import lombok.Data;

@Data
public class CommonResponse {
	private String codeResponse;
	private String messageResponse;
	private Object data;
}
