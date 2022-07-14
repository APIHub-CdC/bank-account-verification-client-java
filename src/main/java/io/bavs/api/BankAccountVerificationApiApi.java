package io.bavs.api;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.bavs.client.ApiCallback;
import io.bavs.client.ApiClient;
import io.bavs.client.ApiException;
import io.bavs.client.ApiResponse;
import io.bavs.client.Configuration;
import io.bavs.client.Pair;
import io.bavs.client.ProgressRequestBody;
import io.bavs.client.ProgressResponseBody;
import io.bavs.model.AccountValidatorWithPrivacyNotice;
import io.bavs.model.AckEVRequest;
import io.bavs.model.AckSuccessEVConsumption;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankAccountVerificationApiApi {
    private ApiClient apiClient;
    public BankAccountVerificationApiApi() {
        this(Configuration.getDefaultApiClient());
    }
    public BankAccountVerificationApiApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    
    public okhttp3.Call accountValidatorAPICall( String xApiKey, String username, String password, AccountValidatorWithPrivacyNotice request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;
        String localVarPath = "";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (username != null)
        localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
        localVarHeaderParams.put("password", apiClient.parameterToString(password));
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private okhttp3.Call accountValidatorAPIValidateBeforeCall( String xApiKey, String username, String password, AccountValidatorWithPrivacyNotice request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling accountValidatorAPI(Async)");
        }
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling accountValidatorAPI(Async)");
        }
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling accountValidatorAPI(Async)");
        }
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling accountValidatorAPI(Async)");
        }
        
        okhttp3.Call call = accountValidatorAPICall( xApiKey, username, password, request, progressListener, progressRequestListener);
        return call;
    }
    
    public AckEVRequest accountValidatorAPI(String xApiKey, String username, String password, AccountValidatorWithPrivacyNotice request) throws ApiException {
        ApiResponse<AckEVRequest> resp = accountValidatorAPIWithHttpInfo( xApiKey, username, password, request);
        return resp.getData();
    }
    
    public ApiResponse<AckEVRequest> accountValidatorAPIWithHttpInfo(String xApiKey, String username, String password, AccountValidatorWithPrivacyNotice request) throws ApiException {
        okhttp3.Call call = accountValidatorAPIValidateBeforeCall( xApiKey, username, password, request, null, null);
        Type localVarReturnType = new TypeToken<AckEVRequest>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call accountValidatorAPIAsync(String xSignature, String xApiKey, String username, String password, AccountValidatorWithPrivacyNotice request, final ApiCallback<AckEVRequest> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = accountValidatorAPIValidateBeforeCall(xApiKey, username, password, request, progressListener, progressRequestListener);
        
        return call;
    }
    
    public okhttp3.Call getAcountValidatorCall(String xApiKey, String username, String password, String inquiryId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        String localVarPath = "/accountValidator/{inquiryId}"
            .replaceAll("\\{" + "inquiryId" + "\\}", apiClient.escapeString(inquiryId.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (username != null)
        localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
        localVarHeaderParams.put("password", apiClient.parameterToString(password));
        
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private okhttp3.Call getAcountValidatorValidateBeforeCall(String xApiKey, String username, String password, String inquiryId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling getAcountValidator(Async)");
        }
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling getAcountValidator(Async)");
        }
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling getAcountValidator(Async)");
        }
        if (inquiryId == null) {
            throw new ApiException("Missing the required parameter 'inquiryId' when calling getAcountValidator(Async)");
        }
        
        okhttp3.Call call = getAcountValidatorCall(xApiKey, username, password, inquiryId, progressListener, progressRequestListener);
        return call;
    }
    
    public AckSuccessEVConsumption getAcountValidator(String xApiKey, String username, String password, String inquiryId) throws ApiException {
        ApiResponse<AckSuccessEVConsumption> resp = getAcountValidatorWithHttpInfo(xApiKey, username, password, inquiryId);
        return resp.getData();
    }
    
    public ApiResponse<AckSuccessEVConsumption> getAcountValidatorWithHttpInfo(String xApiKey, String username, String password, String inquiryId) throws ApiException {
        okhttp3.Call call = getAcountValidatorValidateBeforeCall(xApiKey, username, password, inquiryId, null, null);
        Type localVarReturnType = new TypeToken<AckSuccessEVConsumption>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call getAcountValidatorAsync(String xApiKey, String username, String password, String xSignature, String inquiryId, final ApiCallback<AckSuccessEVConsumption> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = getAcountValidatorValidateBeforeCall(xApiKey, username, password, inquiryId, progressListener, progressRequestListener);
        
        return call;
    }
}
