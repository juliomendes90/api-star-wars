package br.com.juliomendes90.crud.api.responses;

import java.util.List;

/**
 * @author Julio Mendes
 * @version 1.0 (22/04/2018)
 *
 */
public class Response<T> {

	private T data;
	
	private List<String> erros;
	
	public Response(T data) {
		this.data = data;
	}
	
	public Response(List<String> erros) {
		this.erros = erros;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<String> getErros() {
		return erros;
	}

	public void setErros(List<String> erros) {
		this.erros = erros;
	}
}
