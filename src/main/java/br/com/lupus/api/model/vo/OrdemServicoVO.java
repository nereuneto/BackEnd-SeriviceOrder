package br.com.lupus.api.model.vo;

import java.io.Serializable;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrdemServicoVO implements Serializable {
private static final long serialVersionUID = 1L;
	private Long id;
	
	private String descricao;
	private List<String> tarefas; 
	

}
