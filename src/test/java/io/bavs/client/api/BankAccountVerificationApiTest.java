package io.bavs.client.api;

import io.bavs.api.BankAccountVerificationApiApi;
import io.bavs.client.ApiClient;
import io.bavs.model.AccountValidator;
import io.bavs.model.AccountValidator.AccountTypeEnum;
import io.bavs.model.AccountValidator.IdentifierTypeEnum;
import io.bavs.model.AccountValidatorWithPrivacyNotice;
import io.bavs.model.AckEVRequest;
import io.bavs.model.AckSuccessEVConsumption;
import io.bavs.model.CatalogBank;
import okhttp3.OkHttpClient;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cdc.apihub.signer.manager.interceptor.SignerInterceptor;

import org.junit.Assert;
import org.junit.Before;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class BankAccountVerificationApiTest {
	
    private final BankAccountVerificationApiApi api = new BankAccountVerificationApiApi();
    
    private Logger logger = LoggerFactory.getLogger(BankAccountVerificationApiTest.class.getName());
    
    private String keystoreFile = "your_path_for_your_keystore/keystore.jks";
    private String cdcCertFile = "your_path_for_certificate_of_cdc/cdc_cert.pem";
    private String keystorePassword = "your_super_secure_keystore_password";
    private String keyAlias = "your_key_alias";
    private String keyPassword = "your_super_secure_password";
    
    private String username = "your_username_otorgante";
    private String password = "your_password_otorgante";
    
    private String url = "the_url";
    private String xApiKey = "your_x_Api_Key";
    
    
    @Before()
    public void setUp() {
    	 
    	ApiClient apiClient = api.getApiClient();
        apiClient.setBasePath(url);
		OkHttpClient okHttpClient = new OkHttpClient().newBuilder().readTimeout(30, TimeUnit.SECONDS)
				.addInterceptor(new SignerInterceptor(keystoreFile, cdcCertFile, keystorePassword, keyAlias, keyPassword)).build();
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
