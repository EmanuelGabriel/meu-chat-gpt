package br.com.emanuelgabriel.chatgpt.mapper;

import java.util.List;

/**
 * @author emanuel.sousa
 *
 */
public interface IGenericMapper {

	/**
	 * Responsável em converter um objeto para outro tipo
	 *
	 * @param <T>
	 * @param obj
	 * @param clazz
	 * @return <T>
	 * @author emanuel.sousa
	 */
	<T> T paraObjeto(Object obj, Class<T> clazz);

	/**
	 * @param <T>
	 * @param dto
	 * @param clazz
	 * @return <T>
	 * @author emanuel.sousa
	 */
	<T> T dtoParaEntidade(Object dto, Class<T> clazz);

	/**
	 * Responsável em converter uma lista de objeto
	 *
	 * @param <T>
	 * @param list
	 * @param clazz
	 * @return <T>
	 * @author emanuel.sousa
	 */
	<T> List<T> paraLista(List<?> list, Class<T> clazz);

}
