
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.10.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.apiproductionorder2srv.link;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.datamodel.odata.helper.EntityLink;
import com.sap.cloud.sdk.datamodel.odata.helper.VdmObject;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.apiproductionorder2srv.ProductionOrderSerialNumbers;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.apiproductionorder2srv.selectable.ProductionOrderSerialNumbersSelectable;


/**
 * Template class to represent entity navigation links of {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.apiproductionorder2srv.ProductionOrderSerialNumbers ProductionOrderSerialNumbers} to other entities. Instances of this object are used in query modifier methods of the entity
 * fluent helpers. Contains methods to compare a field's value with a provided value.
 * 
 * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData
 * field names, so use the constructor with caution.
 * 
 * @param <ObjectT>
 * Entity type of subclasses from {@link com.sap.cloud.sdk.datamodel.odata.helper.VdmObject VdmObject}.
 * 
 */
public class ProductionOrderSerialNumbersLink<ObjectT extends VdmObject<?> >
    extends EntityLink<ProductionOrderSerialNumbersLink<ObjectT> , ProductionOrderSerialNumbers, ObjectT>
    implements ProductionOrderSerialNumbersSelectable
{


    /**
     * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData field names, so use with caution.
     * 
     * @param fieldName
     *     OData navigation field name. Must match the field returned by the underlying OData service.
     */
    public ProductionOrderSerialNumbersLink(final String fieldName) {
        super(fieldName);
    }

    private ProductionOrderSerialNumbersLink(final EntityLink<ProductionOrderSerialNumbersLink<ObjectT> , ProductionOrderSerialNumbers, ObjectT> toClone) {
        super(toClone);
    }

    @Nonnull
    @Override
    protected ProductionOrderSerialNumbersLink<ObjectT> translateLinkType(final EntityLink<ProductionOrderSerialNumbersLink<ObjectT> , ProductionOrderSerialNumbers, ObjectT> link) {
        return new ProductionOrderSerialNumbersLink<ObjectT>(link);
    }

}
