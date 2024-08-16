package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the coffees database table.
 * 
 */
@Entity
@Table(name="coffees")
@NamedQuery(name="Coffee.findAll", query="SELECT c FROM Coffee c")
public class Coffee implements Serializable {
	private static final long serialVersionUID = 123L;
	@Id
	@Column(name="cofName")
	private String cofName;
	private BigDecimal price;
	private int sales;
	private int total;

	//bi-directional many-to-one association to Supplier
	@ManyToOne
	@JoinColumn(name="supplier_ID")
	private Supplier supplier;
	
	@Column(name="sup_ID")
	private int supId;

	public Coffee() {super();}


	public Coffee(String cofName, BigDecimal price, int sales, int total, Supplier supplier, int supId) {
		this.cofName=cofName;
		this.price=price;
		this.sales=sales;
		this.total=total;
		this.supplier=supplier;
		this.supId=supId;
	}

	public String getCofName() {
		return this.cofName;
	}
	public void setCofName(String cofName) {
		this.cofName = cofName;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getSales() {
		return this.sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public int getTotal() {
		return this.total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getSupId() {
		return supId;
	}

	public void setSupId(int supId) {
		this.supId = supId;
	}

	public Supplier getSupplier() {
		return this.supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

}