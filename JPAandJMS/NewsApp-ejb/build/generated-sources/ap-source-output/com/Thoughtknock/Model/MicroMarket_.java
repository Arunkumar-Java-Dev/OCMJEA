package com.Thoughtknock.Model;

import com.Thoughtknock.Model.Customer;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-08T11:31:53")
@StaticMetamodel(MicroMarket.class)
public class MicroMarket_ { 

    public static volatile SingularAttribute<MicroMarket, Double> areaLength;
    public static volatile SingularAttribute<MicroMarket, String> zipCode;
    public static volatile SingularAttribute<MicroMarket, Double> areaWidth;
    public static volatile CollectionAttribute<MicroMarket, Customer> customerCollection;
    public static volatile SingularAttribute<MicroMarket, Double> radius;

}