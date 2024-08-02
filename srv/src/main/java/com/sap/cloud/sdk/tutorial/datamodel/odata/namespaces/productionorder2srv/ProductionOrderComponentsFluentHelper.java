
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.10.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperRead;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.selectable.ProductionOrderComponentsSelectable;


/**
 * Fluent helper to fetch multiple {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents ProductionOrderComponents} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class ProductionOrderComponentsFluentHelper
    extends FluentHelperRead<ProductionOrderComponentsFluentHelper, ProductionOrderComponents, ProductionOrderComponentsSelectable>
{


    /**
     * Creates a fluent helper using the specified service path and entity collection to send the read requests.
     * 
     * @param entityCollection
     *     The entity collection to direct the requests to.
     * @param servicePath
     *     The service path to direct the read requests to.
     */
    public ProductionOrderComponentsFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final String entityCollection) {
        super(servicePath, entityCollection);
    }

    @Override
    @Nonnull
    protected Class<ProductionOrderComponents> getEntityClass() {
        return ProductionOrderComponents.class;
    }

}