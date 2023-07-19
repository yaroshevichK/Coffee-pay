package com.coffeepay.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CreditCard.class)
public abstract class CreditCard_ extends com.coffeepay.model.DataEntity_ {

	public static volatile SingularAttribute<CreditCard, String> number;
	public static volatile SingularAttribute<CreditCard, Long> id;
	public static volatile SingularAttribute<CreditCard, Customer> customer;

	public static final String NUMBER = "number";
	public static final String ID = "id";
	public static final String CUSTOMER = "customer";

}

