package com.hs.eai.monitor.order.model;


// Generated 22-aug-2012 9:41:49 by Hibernate Tools 3.4.0.CR1


/**
 * OrderDetail generated by hbm2java
 */
public class OrderDetail implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private OrderHdr orderHdr;
	private String itemcode;
	private Integer quantity;
	private String uom;
	private Double unitprice;
	private Integer lineItemId;
	private String invoiceType;
	private String promoCode;
	
	public OrderDetail() {
	}

	public OrderDetail(Integer id, OrderHdr orderHdr, String itemcode, Integer quantity, Double unitprice) {
		this.id = id;
		this.orderHdr = orderHdr;
		this.itemcode = itemcode;
		this.quantity = quantity;
		this.unitprice = unitprice;
	}

	public OrderDetail(Integer id, OrderHdr orderHdr, Integer lineItemId, String itemcode, Integer quantity, String uom, Double unitprice) {
		this.id = id;
		this.orderHdr = orderHdr;
		this.lineItemId = lineItemId;
		this.itemcode = itemcode;
		this.quantity = quantity;
		this.uom = uom;
		this.unitprice = unitprice;
	}
	
	public Integer getLineItemId() {
		return lineItemId;
	}

	public void setLineItemId(Integer lineItemId) {
		this.lineItemId = lineItemId;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public OrderHdr getOrderHdr() {
		return this.orderHdr;
	}

	public void setOrderHdr(OrderHdr orderHdr) {
		this.orderHdr = orderHdr;
	}

	public String getItemcode() {
		return this.itemcode;
	}

	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getUom() {
		return this.uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public Double getUnitprice() {
		return this.unitprice;
	}

	public void setUnitprice(Double unitprice) {
		this.unitprice = unitprice;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}

	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getPromoCode() {
		return this.promoCode;
	}

	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}

}