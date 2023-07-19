package com.coffeepay.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ModelMachine.class)
public abstract class ModelMachine_ extends com.coffeepay.model.DataEntity_ {

	public static volatile SingularAttribute<ModelMachine, String> nameModel;
	public static volatile SingularAttribute<ModelMachine, Long> id;
	public static volatile SingularAttribute<ModelMachine, String> brand;

	public static final String NAME_MODEL = "nameModel";
	public static final String ID = "id";
	public static final String BRAND = "brand";

}

