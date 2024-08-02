
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.10.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.apiproductionorder2srv;

import java.util.Map;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperByKey;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.apiproductionorder2srv.selectable.ProductionOrderStatusSelectable;


/**
 * Fluent helper to fetch a single {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.apiproductionorder2srv.ProductionOrderStatus ProductionOrderStatus} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class ProductionOrderStatusByKeyFluentHelper
    extends FluentHelperByKey<ProductionOrderStatusByKeyFluentHelper, ProductionOrderStatus, ProductionOrderStatusSelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.apiproductionorder2srv.ProductionOrderStatus ProductionOrderStatus} entity with the provided key field values. To perform execution, call the {@link #executeRequest executeRequest} method on the fluent helper object.
     * 
     * @param entityCollection
     *     Entity Collection to be used to fetch a single {@code ProductionOrderStatus}
     * @param servicePath
     *     Service path to be used to fetch a single {@code ProductionOrderStatus}
     * @param productionOrder
     *     Production Order<p>Constraints: Not nullable, Maximum length: 12</p>
     * @param status
     *     Object status<p>Constraints: Not nullable, Maximum length: 5</p>
     */
    public ProductionOrderStatusByKeyFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final String entityCollection, final String productionOrder, final String status) {
        super(servicePath, entityCollection);
        this.key.put("ManufacturingOrder", productionOrder);
        this.key.put("StatusCode", status);
    }

    @Override
    @Nonnull
    protected Class<ProductionOrderStatus> getEntityClass() {
        return ProductionOrderStatus.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}