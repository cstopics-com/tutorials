package com.kobdan.vault;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.vault.core.VaultTemplate;
import org.springframework.vault.support.VaultResponseSupport;

@Service
public class CredentialsService {

	
	@Autowired
	VaultTemplate vaultTemplate;
	
	/**
	 *  To Secure Credentials
	 * @param credentials
	 * @return VaultResponse
	 * @throws URISyntaxException
	 */
	public void secureCredentials(Credentials credentials) throws URISyntaxException {
		vaultTemplate.write("secret/myapp", credentials);
	}

	/**
	 * To Retrieve Credentials
	 * @return Credentials
	 * @throws URISyntaxException
	 */
	public Credentials accessCredentials() throws URISyntaxException {
		VaultResponseSupport<Credentials> response = vaultTemplate.read("secret/myapp", Credentials.class);
		return response.getData();
	}
}
