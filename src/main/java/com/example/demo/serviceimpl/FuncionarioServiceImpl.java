package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Funcionario;
import com.example.demo.repository.FuncionarioRepository;
import com.example.demo.service.FuncionarioService;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	
	
	
	@Override
	public List<Funcionario> obterTodos() {
		
		return this.funcionarioRepository.findAll();
	}

	@Override
	public Funcionario obterPorCodigo(String codigo) {
		
		return this.funcionarioRepository.findById(codigo)
				.orElseThrow(()-> new IllegalArgumentException("Funcionario Não Existe!"));
	}

	@Override
	public Funcionario criar(Funcionario funcionario) {
		
		return this.funcionarioRepository.save(funcionario);
	}
	@Override
	public List<Funcionario> obterFuncionariosPorRangeDeIdade(Integer de, Integer ate) {
			return this.funcionarioRepository.obterFuncionariosPorRangeDeIdade(de,ate);
	}

	@Override
	public List<Funcionario> obterFuncionariosPorNome(String nome) {
		
		return this.funcionarioRepository.findByNome(nome);
	}
	

}
