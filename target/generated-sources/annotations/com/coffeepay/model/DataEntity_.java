package com.coffeepay.model;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DataEntity.class)
public abstract class DataEntity_ {

	public static volatile SingularAttribute<DataEntity, LocalDateTime> updateDate;
	public static volatile SingularAttribute<DataEntity, LocalDateTime> createDate;

	public static final String UPDATE_DATE = "updateDate";
	public static final String CREATE_DATE = "createDate";

}

