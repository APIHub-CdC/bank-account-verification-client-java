package io.bavs.client.api;

import io.bavs.api.BankAccountVerificationApiApi;
import io.bavs.client.ApiClient;
import io.bavs.interceptor.SignerInterceptor;
import io.bavs.model.AccountValidator;

import io.bavs.model.AccountValidatorWithPrivacyNotice;
import io.bavs.model.AckEVRequest;
import io.bavs.model.AckSuccessEVConsumption;

import okhttp3.OkHttpClient;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



import org.junit.Assert;
import org.junit.Before;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class BankAccountVerificationApiTest {
	
    private final BankAccountVerificationApiApi api = new BankAccountVerificationApiApi();
    
    private Logger logger = LoggerFactory.getLogger(BankAccountVerificationApiTest.class.getName());
    
    private String username = "your_username_otorgante";
    private String password = "your_password_otorgante";
    private String xApiKey = "your_x_Api_Key";
    private ApiClient apiClient;


    @Before()
    public void setUp() {
        this.apiClient = api.getApiClient();
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .readTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(new SignerInterceptor())
                .build();
        apiClient.setHttpClient(okHttpClient);
    }
    
    
    @Test
    public void accountValidatorAPITest() throws Exception {
        
        AccountValidatorWithPrivacyNotice request = new AccountValidatorWithPrivacyNotice();
        AccountValidator accountValidator = new AccountValidator();
        
        accountValidator.setExternalId(UUID.randomUUID());
        accountValidator.setSubscriptionId(UUID.fromString("uuid"));
        accountValidator.setBankId(null);
        accountValidator.setIdentifierType(null);
        accountValidator.setAccountType(null);
        accountValidator.setAccountIdentifier(null);
        accountValidator.setName(null);
        accountValidator.setSecondName(null);
        accountValidator.setLastName(null);
        accountValidator.setSecondLastName(null);
        accountValidator.setCitizenId(null);
        accountValidator.setTaxPayerIdentificationNumber(null);
        accountValidator.setVerifierCompany(null);

        request.setAccountValidator(accountValidator);
        
        AckEVRequest response = api.accountValidatorAPI(xApiKey, username, password, request);
        
        Assert.assertTrue(response.getInquiryId() != null);
    }
    
    
    
    @Test
    public void getAcountValidatorTest() throws Exception {
 
        String inquiryId = null;
        
        AckSuccessEVConsumption response = api.getAcountValidator(xApiKey, username, password, inquiryId);
        
        
        logger.info(response.toString());
        
        Assert.assertNotNull(response);
        
        
    }
    
    
    
}
