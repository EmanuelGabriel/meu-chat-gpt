/**
 * 
 */
package br.com.emanuelgabriel.chatgpt.service;

import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import br.com.emanuelgabriel.chatgpt.mapper.response.ModeloResposta;
import io.github.flashvayne.chatgpt.service.ChatgptService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author emanuel.sousa
 *
 */

@Slf4j
@Service
@RequiredArgsConstructor
public class ChatGptService {

	private final ChatgptService chatGptService;

	public ModeloResposta<String> enviarMensagemParaChatGpt(String requestMensagem) {
		log.info("Enviar mensagem para o ChatGPT - mensagem: {}", requestMensagem);

		String requestId = UUID.randomUUID().toString();
		if (!StringUtils.hasText(requestMensagem)) {
			return ModeloResposta.falha("A mensagem não pode ficar em branco ou está vazia!");
		}

		try {

			String resposta = chatGptService.sendMessage(requestMensagem);
			log.info("RequestId: {}; RespostaDoChatGPT: {}", requestId, resposta);

			String respostaFormatada = formatarTextoDaResposta(resposta);

			return ModeloResposta.sucesso(respostaFormatada);

		} catch (Exception e) {
			log.error("Erro: {}", e.getMessage());
			return new ModeloResposta<String>(500, "erro", e.getMessage());
		}

	}

	private String formatarTextoDaResposta(String resposta) {
		return resposta.replaceAll("\n\n", " ");
	}

}
