package br.com.emanuelgabriel.chatgpt;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import io.github.flashvayne.chatgpt.service.ChatgptService;

/**
 * 
 * @author emanuel.sousa
 *
 */

@SpringBootTest
class MeuchatGptApplicationTests {
	
	
	@Autowired
	private ChatgptService chatgptService;

	@Test
	void iniciarChatGpt() {
		
		String respostaMensagem = chatgptService.sendMessage("Explique como funciona o core da linguagem do Java como se estivesse explicando pra um jovem de 18 anos");
		System.out.println(respostaMensagem);
		
		
	}

}
