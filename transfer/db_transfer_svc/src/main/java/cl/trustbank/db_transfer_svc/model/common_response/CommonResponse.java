package cl.trustbank.db_transfer_svc.model.common_response;

import lombok.Data;

@Data
public class CommonResponse {
	private String codeResponse;
	private String messageResponse;
	private Object data;
}
