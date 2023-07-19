package com.coffeepay.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Customer.class)
public abstract class Customer_ extends com.coffeepay.model.DataEntity_ {

	public static volatile SetAttribute<Customer, CreditCard> creditCards;
	public static volatile SingularAttribute<Customer, String> phone;
	public static volatile SingularAttribute<Customer, String> surname;
	public static volatile SingularAttribute<Customer, String> name;
	public static volatile SingularAttribute<Customer, Long> id;
	public static volatile SingularAttribute<Customer, User> user;
	public static volatile SingularAttribute<Customer, String> email;

	public static final String CREDIT_CARDS = "creditCards";
	public static final String PHONE = "phone";
	public static final String SURNAME = "surname";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String USER = "user";
	public static final String EMAIL = "email";

}

