"# meu-chat-gpt" 


# API REST para uso do ChatGPT-3


## Uso da dependência Maven

```pom

<dependency>
    <groupId>io.github.flashvayne</groupId>
    <artifactId>chatgpt-spring-boot-starter</artifactId>
    <version>1.0.1</version>
</dependency>
```

##### Para uso desta demo é necessário a criação de uma api-key no sítio: https://platform.openai.com/account/api-keys


##### Documentação da OpenIA

https://platform.openai.com/overview


### Como usar:

1. Clone o projeto em sua máquina.
2. Configure o arquivo "application.properties" com a sua api-key na propriedade "CHAVE_API".
3. Execute o projeto e faça uma chamada para o endpoint abaixo:

+ request
```shell
curl --location --request GET '127.0.0.1:8080/chat?mensagemRequest==como vai você'
```

+ response
```json
{
  "code": 200,
  "mensagem": "sucesso",
  "resposta": "\n\nEu estou fazendo o bem, obrigado. E você?"
}
```


# Autor
Nome: Emanuel Gabriel Sousa
Email: emanuel.gabriel.sousa@hotmail.com


### Badges Maven
[![Maven central](https://maven-badges.herokuapp.com/maven-central/io.github.flashvayne/chatgpt-spring-boot-starter/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.github.flashvayne/chatgpt-spring-boot-starter)




