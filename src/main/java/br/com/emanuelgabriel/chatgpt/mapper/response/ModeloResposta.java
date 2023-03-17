package br.com.emanuelgabriel.chatgpt.mapper.response;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 
 * @author emanuel.sousa
 *
 */

@Data
@AllArgsConstructor
public class ModeloResposta<T> {

	private Integer codigo;
	private String mensagem;
	private T resposta;

	public static <T> ModeloResposta<T> sucesso(T resposta) {
		return new ModeloResposta<>(200, "sucesso", resposta);
	}

	public static <T> ModeloResposta<T> falha(T resposta) {
		return new ModeloResposta<>(400, "falha", resposta);
	}

}
