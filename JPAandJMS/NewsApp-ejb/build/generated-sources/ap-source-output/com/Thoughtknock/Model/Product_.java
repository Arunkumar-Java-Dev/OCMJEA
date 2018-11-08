package com.Thoughtknock.Model;

import com.Thoughtknock.Model.Manufacturer;
import com.Thoughtknock.Model.ProductCode;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-08T11:31:53")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, BigDecimal> purchaseCost;
    public static volatile SingularAttribute<Product, ProductCode> productCode;
    public static volatile SingularAttribute<Product, Integer> productId;
    public static volatile SingularAttribute<Product, BigDecimal> markup;
    public static volatile SingularAttribute<Product, Integer> quantityOnHand;
    public static volatile SingularAttribute<Product, String> available;
    public static volatile SingularAttribute<Product, Manufacturer> manufacturerId;
    public static volatile SingularAttribute<Product, String> description;

}