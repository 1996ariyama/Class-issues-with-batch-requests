
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.10.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.link;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.datamodel.odata.helper.EntityLink;
import com.sap.cloud.sdk.datamodel.odata.helper.VdmObject;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderOperations;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.selectable.ProductionOrderOperationsSelectable;


/**
 * Template class to represent entity navigation links of {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderOperations ProductionOrderOperations} to other entities. Instances of this object are used in query modifier methods of the entity
 * fluent helpers. Contains methods to compare a field's value with a provided value.
 * 
 * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData
 * field names, so use the constructor with caution.
 * 
 * @param <ObjectT>
 * Entity type of subclasses from {@link com.sap.cloud.sdk.datamodel.odata.helper.VdmObject VdmObject}.
 * 
 */
public class ProductionOrderOperationsLink<ObjectT extends VdmObject<?> >
    extends EntityLink<ProductionOrderOperationsLink<ObjectT> , ProductionOrderOperations, ObjectT>
    implements ProductionOrderOperationsSelectable
{


    /**
     * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData field names, so use with caution.
     * 
     * @param fieldName
     *     OData navigation field name. Must match the field returned by the underlying OData service.
     */
    public ProductionOrderOperationsLink(final String fieldName) {
        super(fieldName);
    }

    private ProductionOrderOperationsLink(final EntityLink<ProductionOrderOperationsLink<ObjectT> , ProductionOrderOperations, ObjectT> toClone) {
        super(toClone);
    }

    @Nonnull
    @Override
    protected ProductionOrderOperationsLink<ObjectT> translateLinkType(final EntityLink<ProductionOrderOperationsLink<ObjectT> , ProductionOrderOperations, ObjectT> link) {
        return new ProductionOrderOperationsLink<ObjectT>(link);
    }

}
