
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.10.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.selectable;

import com.sap.cloud.sdk.datamodel.odata.helper.EntitySelectable;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents;


/**
 * Interface to enable OData entity selectors for {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents ProductionOrderComponents}. This interface is used by {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.field.ProductionOrderComponentsField ProductionOrderComponentsField} and {@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.link.ProductionOrderComponentsLink ProductionOrderComponentsLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#RESERVATION RESERVATION}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#RESERVATION_ITEM RESERVATION_ITEM}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#MATERIAL_GROUP MATERIAL_GROUP}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#MATERIAL MATERIAL}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#PLANT PLANT}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#ORDER_CATEGORY ORDER_CATEGORY}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#ORDER_TYPE ORDER_TYPE}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#PRODUCTION_ORDER PRODUCTION_ORDER}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#SEQUENCE SEQUENCE}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#OPERATION OPERATION}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#PRODUCTION_PLANT PRODUCTION_PLANT}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#ORDER_INTERNAL_ID ORDER_INTERNAL_ID}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#REQUIREMENT_DATE REQUIREMENT_DATE}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#REQUIREMENT_TIME REQUIREMENT_TIME}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#FINAL_ISSUE FINAL_ISSUE}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#MARKED_FOR_DELETION MARKED_FOR_DELETION}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#BULK_MATERIAL BULK_MATERIAL}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#BACKFLUSH BACKFLUSH}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#COSTING_RELEVNCY COSTING_RELEVNCY}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#LONG_TEXT LONG_TEXT}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#SALES_ORDER SALES_ORDER}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#SALES_ORDER_ITEM SALES_ORDER_ITEM}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#SORT_STRING SORT_STRING}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#BOM_CATEGORY BOM_CATEGORY}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#BOM_ITEM BOM_ITEM}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#BOM_ITEM_CATEGORY BOM_ITEM_CATEGORY}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#BOM_ITEM_2 BOM_ITEM_2}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#BOM_ITEM_TEXT BOM_ITEM_TEXT}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#STORAGE_LOCATION STORAGE_LOCATION}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#BATCH BATCH}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#BATCH_SPLIT_TYPE BATCH_SPLIT_TYPE}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#MOVEMENT_TYPE MOVEMENT_TYPE}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#PRODUCTION_SUPPLY_AREA PRODUCTION_SUPPLY_AREA}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#GOODS_RECIPIENT GOODS_RECIPIENT}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#UNLOADING_POINT UNLOADING_POINT}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#ALTERNATIVE_ITEM ALTERNATIVE_ITEM}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#ALTERNATIVE_ITEM_GROUP ALTERNATIVE_ITEM_GROUP}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#ALTERNATIVE_ITEM_STRATEGY ALTERNATIVE_ITEM_STRATEGY}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#ALTERNATIVE_ITEM_PRIORITY ALTERNATIVE_ITEM_PRIORITY}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#USAGE_PROBABILITY USAGE_PROBABILITY}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#PHANTOM_ITEM PHANTOM_ITEM}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#LEAD_TIME_OFFSET LEAD_TIME_OFFSET}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#QUANTITY_IS_FIXED QUANTITY_IS_FIXED}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#NET_SCRAP_INDICATOR NET_SCRAP_INDICATOR}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#COMPONENT_SCRAP COMPONENT_SCRAP}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#OPERATION_SCRAP_IN OPERATION_SCRAP_IN}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#BASE_UNIT_OF_MEASURE BASE_UNIT_OF_MEASURE}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#ISO_CODE ISO_CODE}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#INTERNAL_SAP_CODE INTERNAL_SAP_CODE}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#REQUIREMENT_QUANTITY REQUIREMENT_QUANTITY}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#WITHDRAWN_QUANTITY WITHDRAWN_QUANTITY}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#AVAILABLE_QUANTITY AVAILABLE_QUANTITY}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#ORIGINAL_QUANTITY ORIGINAL_QUANTITY}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#UNIT_OF_ENTRY UNIT_OF_ENTRY}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#ISO_CODE_2 ISO_CODE_2}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#INTERNAL_SAP_CODE_2 INTERNAL_SAP_CODE_2}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#QUANTITY_IN_UNIT_OF_ENTRY QUANTITY_IN_UNIT_OF_ENTRY}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#CURRENCY CURRENCY}</li>
 * <li>{@link com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv.ProductionOrderComponents#VALUE_WITHDRAWN VALUE_WITHDRAWN}</li>
 * </ul>
 * 
 */
public interface ProductionOrderComponentsSelectable
    extends EntitySelectable<ProductionOrderComponents>
{


}
