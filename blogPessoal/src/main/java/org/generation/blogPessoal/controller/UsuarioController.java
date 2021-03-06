package org.generation.blogPessoal.controller;

import java.util.List;
import java.util.Optional;

import org.generation.blogPessoal.model.UserLogin;
import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin (origins ="*", allowedHeaders ="*")
public class UsuarioController {
	
	/*O login é o unico endpoint q vai passar pelo filtro de segurança,
	 * ou seja ele sera liberado pelo filtro.
	 * Isso esta definido la na classe BasicSecurityConfig
	 * Então esses dois métodos são suficientes para atender as necessidades de cadastro e login
	 */
	
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/all")
    public ResponseEntity <List<Usuario>> getAll(){

        return ResponseEntity.ok(usuarioService.listarUsuarios());
    }
	
	@PutMapping("/atualizar")
    public ResponseEntity<Usuario> putUsuario(@RequestBody Usuario usuario){

        return usuarioService.atualizarUsuario(usuario)
            .map(resp -> ResponseEntity.status(HttpStatus.OK).body(resp))
            .orElse(ResponseEntity.status(HttpStatus.BAD_REQUEST).build());
    }
	
	@PostMapping("/logar")
	public ResponseEntity<UserLogin> Autentication (@RequestBody Optional <UserLogin> user){
		return usuarioService.Logar(user).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build()); //o build serve pra montar toda a body
	}
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Usuario> Post(@RequestBody Usuario usuario){
		return usuarioService.CadastrarUsuario(usuario).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.status(HttpStatus.CONFLICT).build());
	}


}
