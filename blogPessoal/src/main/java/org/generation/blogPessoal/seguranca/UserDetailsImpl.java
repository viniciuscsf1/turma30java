package org.generation.blogPessoal.seguranca;

import java.util.Collection;

import org.generation.blogPessoal.model.Usuario;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

//aplicando uma regra ja existente na UserDetails
//assim que for criado, o UserDetails ja pede pra adicionar todos os métodos da implementação
public class UserDetailsImpl implements UserDetails{
	
	//classe criada apenas para controle interno
	private static final long serialVersionUID = 1L;
	
	private String userName;
	private String password;
	
	//construtores de classe 
	
	public UserDetailsImpl(Usuario user) {
		this.userName = user.getUsuario();
		this.password = user.getSenha();
	}
	
	public UserDetailsImpl() {}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;			//passando as politicas do UserDetails para os métodos
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userName;			//passando as politicas do UserDetails para os métodos
	}

	//passando todos os metodos abaixo para true apenas como boa prática 
	//pois caso haja necessidade de utilizá-los, eles ja retornarão o resultado esperado
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;				
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
