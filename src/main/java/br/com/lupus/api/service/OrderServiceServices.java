package br.com.lupus.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lupus.api.converter.DozerConverter;
import br.com.lupus.api.model.OrdemServico;
import br.com.lupus.api.model.vo.OrdemServicoVO;
import br.com.lupus.api.repository.IOrderServiceRepository;

@Service
public class OrderServiceServices {
	
	@Autowired
	private IOrderServiceRepository repo;
	
	public OrdemServicoVO saveOrderService(OrdemServicoVO order) {
		var entity = DozerConverter.parseObject(order, OrdemServico.class);
		var vo = DozerConverter.parseObject(repo.save(entity), OrdemServicoVO.class);
		
		return vo;
	}

	public List<OrdemServicoVO> getAllOrderService() {
		var vo = DozerConverter.parseListObjects(repo.findAll(), OrdemServicoVO.class);
		return vo;
	}
	
}
