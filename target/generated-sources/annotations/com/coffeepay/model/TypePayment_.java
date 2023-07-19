package com.coffeepay.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TypePayment.class)
public abstract class TypePayment_ extends com.coffeepay.model.DataEntity_ {

	public static volatile SingularAttribute<TypePayment, Boolean> useCreditCard;
	public static volatile SingularAttribute<TypePayment, String> name;
	public static volatile SingularAttribute<TypePayment, Integer> id;
	public static volatile SingularAttribute<TypePayment, Boolean> usePhoneNumber;

	public static final String USE_CREDIT_CARD = "useCreditCard";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String USE_PHONE_NUMBER = "usePhoneNumber";

}

