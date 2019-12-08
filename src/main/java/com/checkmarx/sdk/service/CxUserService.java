package com.checkmarx.sdk.service;

import com.checkmarx.sdk.config.CxProperties;
import com.checkmarx.sdk.dto.CxUser;
import com.checkmarx.sdk.exception.CheckmarxException;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CxUserService implements CxUserClient{
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(CxUserService.class);
    private final CxAuthClient authClient;
    private final CxLegacyService cxLegacyService;
    private final CxProperties cxProperties;

    public CxUserService(CxAuthClient authClient, CxLegacyService cxLegacyService, CxProperties cxProperties) {
        this.authClient = authClient;
        this.cxLegacyService = cxLegacyService;
        this.cxProperties = cxProperties;
    }

    public List<CxUser> getUsers() throws CheckmarxException{
        if(cxProperties.getVersion() < 9.0){
            String session = authClient.getLegacySession();

        }
        else{
            log.warn("getUsers for 9.0 has not been implemented");
            throw new CheckmarxException("Operation not supported in 9.x");
        }
        return null;
    }

    public CxUser getUser(Integer id){
        return null;
    }

    public void updateUser(CxUser user) throws CheckmarxException{

    }

    public void addUser(CxUser user) throws CheckmarxException{

    }

    public void addUserWS(String session, CxUser user) {

    }



}
