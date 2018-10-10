package com.kazale.pontointeligente.api.utils;

import org.slf4j.Logger;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtils {
	private final static Logger log = org.slf4j.LoggerFactory.getLogger(PasswordUtils.class);

	public PasswordUtils() {
		super();
	}
	
	/**
	 * Gera um hash utilizando o BCrypt.
	 * @param senha
	 * @return String
	 */
	public static String gerarBCrypt(String senha ) {
		if ( senha == null) {
			return senha;
		}
		
		log.info("Gerando hash com o BCrypt.");
		
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		return bCryptPasswordEncoder.encode(senha);
	}
	
}
