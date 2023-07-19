package com.coffeepay.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Purchase.class)
public abstract class Purchase_ extends com.coffeepay.model.DataEntity_ {

	public static volatile SingularAttribute<Purchase, Product> product;
	public static volatile SingularAttribute<Purchase, Float> summ;
	public static volatile SingularAttribute<Purchase, Machine> machine;
	public static volatile SingularAttribute<Purchase, Float> price;
	public static volatile SingularAttribute<Purchase, Discount> discount;
	public static volatile SingularAttribute<Purchase, Long> id;
	public static volatile SingularAttribute<Purchase, CreditCard> creditCard;
	public static volatile SingularAttribute<Purchase, Customer> customer;
	public static volatile SingularAttribute<Purchase, TypePayment> typePayment;

	public static final String PRODUCT = "product";
	public static final String SUMM = "summ";
	public static final String MACHINE = "machine";
	public static final String PRICE = "price";
	public static final String DISCOUNT = "discount";
	public static final String ID = "id";
	public static final String CREDIT_CARD = "creditCard";
	public static final String CUSTOMER = "customer";
	public static final String TYPE_PAYMENT = "typePayment";

}

