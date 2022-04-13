package pojos;

import lombok.Data;

@Data
public class ServiceCodeResponse {
    private String secretKey;
    private String accessKey;
    private String identityId;
    private String sessionToken;
    private String currency;
    private String region;
    private String userName;

}
