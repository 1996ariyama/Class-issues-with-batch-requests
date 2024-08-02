
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.10.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.apiproductionorder2srv.link;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.datamodel.odata.helper.EntityLink;
import com.sap.cloud.sdk.datamodel.odata.helper.VdmObject;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.apiproductionorder2srv.ProductionOrderComponentsExtended;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.apiproductionorder2srv.selectable.ProductionOrderComponentsExtendedSelectable;


/**
 * Template class to represent entity navigation links of {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.apiproductionorder2srv.ProductionOrderComponentsExtended ProductionOrderComponentsExtended} to other entities. Instances of this object are used in query modifier methods of the entity
 * fluent helpers. Contains methods to compare a field's value with a provided value.
 * 
 * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData
 * field names, so use the constructor with caution.
 * 
 * @param <ObjectT>
 * Entity type of subclasses from {@link com.sap.cloud.sdk.datamodel.odata.helper.VdmObject VdmObject}.
 * 
 */
public class ProductionOrderComponentsExtendedLink<ObjectT extends VdmObject<?> >
    extends EntityLink<ProductionOrderComponentsExtendedLink<ObjectT> , ProductionOrderComponentsExtended, ObjectT>
    implements ProductionOrderComponentsExtendedSelectable
{


    /**
     * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData field names, so use with caution.
     * 
     * @param fieldName
     *     OData navigation field name. Must match the field returned by the underlying OData service.
     */
    public ProductionOrderComponentsExtendedLink(final String fieldName) {
        super(fieldName);
    }

    private ProductionOrderComponentsExtendedLink(final EntityLink<ProductionOrderComponentsExtendedLink<ObjectT> , ProductionOrderComponentsExtended, ObjectT> toClone) {
        super(toClone);
    }

    @Nonnull
    @Override
    protected ProductionOrderComponentsExtendedLink<ObjectT> translateLinkType(final EntityLink<ProductionOrderComponentsExtendedLink<ObjectT> , ProductionOrderComponentsExtended, ObjectT> link) {
        return new ProductionOrderComponentsExtendedLink<ObjectT>(link);
    }

}