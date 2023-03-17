package br.com.emanuelgabriel.chatgpt.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.emanuelgabriel.chatgpt.mapper.response.ModeloResposta;
import br.com.emanuelgabriel.chatgpt.service.ChatGptService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author emanuel.sousa
 *
 */

@Slf4j
@RestController
@RequestMapping(value = "/chat", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class ChatGptController {

	private final ChatGptService service;

	@GetMapping
	public ResponseEntity<ModeloResposta<String>> obterRespostaDoChatGpt(@RequestParam String mensagemRequest) {
		log.info("GET /chat -  pergunta: {}", mensagemRequest);
		ModeloResposta<String> resposta = service.enviarMensagemParaChatGpt(mensagemRequest);
		return resposta != null ? ResponseEntity.ok().body(resposta) : ResponseEntity.badRequest().build();
	}

}
