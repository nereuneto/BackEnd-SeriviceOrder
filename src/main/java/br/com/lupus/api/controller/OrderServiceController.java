package br.com.lupus.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.lupus.api.model.vo.OrdemServicoVO;
import br.com.lupus.api.service.OrderServiceServices;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/service-order/")
@Tag(name = "OrderService")
public class OrderServiceController {
	
	@Autowired
	private OrderServiceServices services;
	
	@GetMapping()
	@ResponseStatus(code = HttpStatus.OK)
	@Operation(summary = "Get all order services")
	public List<OrdemServicoVO> getAllOrderService() {
		return services.getAllOrderService();
	}
	
	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	@Operation(summary = "Create order service")
	public OrdemServicoVO saveOrderService(@RequestBody OrdemServicoVO order) {
		return services.saveOrderService(order);
	}

}
