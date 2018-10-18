package com.kazale.pontointeligente.api.services.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.kazale.pontointeligente.api.entities.Empresa;
import com.kazale.pontointeligente.api.repositories.EmpresaRepository;
import com.kazale.pontointeligente.api.services.EmpresaService;

public class EmpresaServiceImpl implements EmpresaService {
	
	private static final Logger log = org.slf4j.LoggerFactory.getLogger(EmpresaServiceImpl.class);
	
	@Autowired
	private EmpresaRepository empresaRepository;

	@Override
	public Optional<Empresa> buscaPorCnpj(String cnpj) {
		log.info("Buscando uma empresa para o CNPJ {}", cnpj);
		
		return Optional.ofNullable(empresaRepository.findByCnpj(cnpj));
	}

	@Override
	public Empresa persistir(Empresa empresa) {
		log.info("Persistindo uma empresa {}", empresa);
		
		return empresaRepository.save(empresa);
	}

}
