package com.tutiempolibro.manageshoppingcart.entity;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ShoppingType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-10-30T01:26:36.216-05:00")

public class ShoppingType {
    @JsonProperty("title")
    private String title = null;

    @JsonProperty("autor")
    private String autor = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("urlimage")
    private String urlimage = null;

    @JsonProperty("price")
    private String price = null;

    @JsonProperty("quantity")
    private Integer quantity = null;

    @JsonProperty("subtotal")
    private String subtotal = null;

    @JsonProperty("stock")
    private String stock = null;

    @JsonProperty("shoppingid")
    private String shoppingid = null;

    @JsonProperty("bookid")
    private String bookid = null;
    
    @JsonProperty("type")
    private String type = null;

    public ShoppingType title(String title) {
	this.title = title;
	return this;
    }

    /**
     * title of the book
     * 
     * @return title
     **/
    @ApiModelProperty(required = true, value = "title of the book")
    @NotNull

    public String getTitle() {
	return title;
    }

    public void setTitle(String title) {
	this.title = title;
    }

    public ShoppingType autor(String autor) {
	this.autor = autor;
	return this;
    }

    /**
     * Autor of the book
     * 
     * @return autor
     **/
    @ApiModelProperty(required = true, value = "Autor of the book")
    @NotNull

    public String getAutor() {
	return autor;
    }

    public void setAutor(String autor) {
	this.autor = autor;
    }

    public ShoppingType description(String description) {
	this.description = description;
	return this;
    }

    /**
     * Description of Book
     * 
     * @return description
     **/
    @ApiModelProperty(required = true, value = "Description of Book")
    @NotNull

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public ShoppingType urlimage(String urlimage) {
	this.urlimage = urlimage;
	return this;
    }

    /**
     * Url Image
     * 
     * @return urlimage
     **/
    @ApiModelProperty(required = true, value = "Url Image")
    @NotNull

    public String getUrlimage() {
	return urlimage;
    }

    public void setUrlimage(String urlimage) {
	this.urlimage = urlimage;
    }

    public ShoppingType price(String price) {
	this.price = price;
	return this;
    }

    /**
     * price Rental or Sales of the book
     * 
     * @return price
     **/
    @ApiModelProperty(required = true, value = "price Rental or Sales of the book")
    @NotNull

    public String getPrice() {
	return price;
    }

    public void setPrice(String price) {
	this.price = price;
    }

    public ShoppingType quantity(Integer quantity) {
	this.quantity = quantity;
	return this;
    }

    /**
     * Indentity of Book
     * 
     * @return quantity
     **/
    @ApiModelProperty(required = true, value = "Indentity of Book")
    @NotNull

    public Integer getQuantity() {
	return quantity;
    }

    public void setQuantity(Integer quantity) {
	this.quantity = quantity;
    }

    public ShoppingType subtotal(String subtotal) {
	this.subtotal = subtotal;
	return this;
    }

    /**
     * subtotal of shipping cart
     * 
     * @return subtotal
     **/
    @ApiModelProperty(required = true, value = "subtotal of shipping cart")
    @NotNull

    public String getSubtotal() {
	return subtotal;
    }

    public void setSubtotal(String subtotal) {
	this.subtotal = subtotal;
    }

    public ShoppingType stock(String stock) {
	this.stock = stock;
	return this;
    }

    /**
     * Stock Rental or Sales Book
     * 
     * @return stock
     **/
    @ApiModelProperty(required = true, value = "Stock Rental or Sales Book")
    @NotNull

    public String getStock() {
	return stock;
    }

    public void setStock(String stock) {
	this.stock = stock;
    }

    public ShoppingType shoppingid(String shoppingid) {
	this.shoppingid = shoppingid;
	return this;
    }

    /**
     * Shopping id value
     * 
     * @return shoppingid
     **/
    @ApiModelProperty(required = true, value = "Shopping id value")
    @NotNull

    public String getShoppingid() {
	return shoppingid;
    }

    public void setShoppingid(String shoppingid) {
	this.shoppingid = shoppingid;
    }
    
    
    
    public ShoppingType type(String type) {
   	this.type = type;
   	return this;
       }

       /**
        * Shopping id value
        * 
        * @return shoppingid
        **/
       @ApiModelProperty(required = true, value = "type value A=Alquiler / V=Venta")
       @NotNull

       public String getType() {
   	return type;
       }

       public void setType(String type) {
   	this.type = type;
       }
    
    

    public ShoppingType bookid(String bookid) {
	this.bookid = bookid;
	return this;
    }

    /**
     * Shopping id value
     * 
     * @return bookid
     **/
    @ApiModelProperty(required = true, value = "Book id value")
    @NotNull

    public String getBookid() {
	return bookid;
    }

    public void setBookid(String bookid) {
	this.bookid = bookid;
    }

    @Override
    public boolean equals(java.lang.Object o) {
	if (this == o) {
	    return true;
	}
	if (o == null || getClass() != o.getClass()) {
	    return false;
	}
	ShoppingType shoppingType = (ShoppingType) o;
	return Objects.equals(this.title, shoppingType.title) && Objects.equals(this.autor, shoppingType.autor)
		&& Objects.equals(this.description, shoppingType.description) && Objects.equals(this.urlimage, shoppingType.urlimage)
		&& Objects.equals(this.price, shoppingType.price) && Objects.equals(this.quantity, shoppingType.quantity)
		&& Objects.equals(this.subtotal, shoppingType.subtotal) && Objects.equals(this.stock, shoppingType.stock)
		&& Objects.equals(this.shoppingid, shoppingType.shoppingid);
    }

    @Override
    public int hashCode() {
	return Objects.hash(title, autor, description, urlimage, price, quantity, subtotal, stock, shoppingid);
    }

    @Override
    public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append("class ShoppingType {\n");

	sb.append("    title: ").append(toIndentedString(title)).append("\n");
	sb.append("    autor: ").append(toIndentedString(autor)).append("\n");
	sb.append("    description: ").append(toIndentedString(description)).append("\n");
	sb.append("    urlimage: ").append(toIndentedString(urlimage)).append("\n");
	sb.append("    price: ").append(toIndentedString(price)).append("\n");
	sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
	sb.append("    subtotal: ").append(toIndentedString(subtotal)).append("\n");
	sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
	sb.append("    shoppingid: ").append(toIndentedString(shoppingid)).append("\n");
	sb.append("}");
	return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
	if (o == null) {
	    return "null";
	}
	return o.toString().replace("\n", "\n    ");
    }
}
