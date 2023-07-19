package com.coffeepay.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Machine.class)
public abstract class Machine_ extends com.coffeepay.model.DataEntity_ {

	public static volatile SingularAttribute<Machine, String> serialNumber;
	public static volatile SingularAttribute<Machine, Address> address;
	public static volatile SingularAttribute<Machine, ModelMachine> model;
	public static volatile SingularAttribute<Machine, Long> id;
	public static volatile SetAttribute<Machine, Product> products;

	public static final String SERIAL_NUMBER = "serialNumber";
	public static final String ADDRESS = "address";
	public static final String MODEL = "model";
	public static final String ID = "id";
	public static final String PRODUCTS = "products";

}

