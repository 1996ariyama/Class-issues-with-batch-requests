
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.10.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv;

import java.util.Map;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperByKey;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.selectable.ProductionOrderItemsSelectable;


/**
 * Fluent helper to fetch a single {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderItems ProductionOrderItems} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class ProductionOrderItemsByKeyFluentHelper
    extends FluentHelperByKey<ProductionOrderItemsByKeyFluentHelper, ProductionOrderItems, ProductionOrderItemsSelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderItems ProductionOrderItems} entity with the provided key field values. To perform execution, call the {@link #executeRequest executeRequest} method on the fluent helper object.
     * 
     * @param entityCollection
     *     Entity Collection to be used to fetch a single {@code ProductionOrderItems}
     * @param servicePath
     *     Service path to be used to fetch a single {@code ProductionOrderItems}
     * @param manufacturingOrderItem
     *     Manufacturing Order Item ID<p>Constraints: Not nullable, Maximum length: 4</p>
     * @param productionOrder
     *     Production Order<p>Constraints: Not nullable, Maximum length: 12</p>
     */
    public ProductionOrderItemsByKeyFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final String entityCollection, final String productionOrder, final String manufacturingOrderItem) {
        super(servicePath, entityCollection);
        this.key.put("ManufacturingOrder", productionOrder);
        this.key.put("ManufacturingOrderItem", manufacturingOrderItem);
    }

    @Override
    @Nonnull
    protected Class<ProductionOrderItems> getEntityClass() {
        return ProductionOrderItems.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}