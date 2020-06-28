package com.kobdan.vault;

import org.springframework.context.annotation.Configuration;
import org.springframework.vault.authentication.ClientAuthentication;
import org.springframework.vault.authentication.TokenAuthentication;
import org.springframework.vault.client.VaultEndpoint;
import org.springframework.vault.config.AbstractVaultConfiguration;

@Configuration
public class VaultConfig extends AbstractVaultConfiguration {

    @Override
    public ClientAuthentication clientAuthentication() {
        return new TokenAuthentication("00000000-0000-0000-0000-000000000000");
    }

    @Override
    public VaultEndpoint vaultEndpoint() {
    	VaultEndpoint endpoint = new VaultEndpoint();
    	endpoint.setHost("127.0.0.1");
    	endpoint.setPort(8200);
    	endpoint.setScheme("http");
        return endpoint;
    }

}
