package com.prik.orderservice.dto;

import com.prik.orderservice.model.OrderLineItems;
import lombok.AllArgsConstructor;
import lombok.Data; // Gives all default boilerplate metjods such as getters,setters etc.
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {

    private List<OrderLineItemsDto> orderLineItemsDtoList;
}
