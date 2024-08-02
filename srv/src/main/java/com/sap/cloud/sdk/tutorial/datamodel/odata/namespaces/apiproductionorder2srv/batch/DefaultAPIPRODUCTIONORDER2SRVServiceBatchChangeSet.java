
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.10.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.apiproductionorder2srv.batch;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.datamodel.odata.helper.batch.BatchChangeSetFluentHelperBasic;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.apiproductionorder2srv.ProductionOrder;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.apiproductionorder2srv.ProductionOrderComponentsExtended;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.apiproductionorder2srv.ProductionOrderComponentsUsingRAPBO;
import com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.apiproductionorder2srv.ProductionOrderOperations;


/**
 * Implementation of the {@link APIPRODUCTIONORDER2SRVServiceBatchChangeSet} interface, enabling you to combine multiple operations into one changeset. For further information have a look into the {@link com.sap.cloud.sdk.tutorial.datamodel.odata.services.APIPRODUCTIONORDER2SRVService APIPRODUCTIONORDER2SRVService}.
 * 
 */
public class DefaultAPIPRODUCTIONORDER2SRVServiceBatchChangeSet
    extends BatchChangeSetFluentHelperBasic<APIPRODUCTIONORDER2SRVServiceBatch, APIPRODUCTIONORDER2SRVServiceBatchChangeSet>
    implements APIPRODUCTIONORDER2SRVServiceBatchChangeSet
{

    @Nonnull
    private final com.sap.cloud.sdk.tutorial.datamodel.odata.services.APIPRODUCTIONORDER2SRVService service;

    DefaultAPIPRODUCTIONORDER2SRVServiceBatchChangeSet(
        @Nonnull
        final DefaultAPIPRODUCTIONORDER2SRVServiceBatch batchFluentHelper,
        @Nonnull
        final com.sap.cloud.sdk.tutorial.datamodel.odata.services.APIPRODUCTIONORDER2SRVService service) {
        super(batchFluentHelper, batchFluentHelper);
        this.service = service;
    }

    @Nonnull
    @Override
    protected DefaultAPIPRODUCTIONORDER2SRVServiceBatchChangeSet getThis() {
        return this;
    }

    @Nonnull
    @Override
    public APIPRODUCTIONORDER2SRVServiceBatchChangeSet updateProductionOrderComponentsExtended(
        @Nonnull
        final ProductionOrderComponentsExtended productionOrderComponentsExtended) {
        return addRequestUpdate(service::updateProductionOrderComponentsExtended, productionOrderComponentsExtended);
    }

    @Nonnull
    @Override
    public APIPRODUCTIONORDER2SRVServiceBatchChangeSet updateProductionOrderComponentsUsingRAPBO(
        @Nonnull
        final ProductionOrderComponentsUsingRAPBO productionOrderComponentsUsingRAPBO) {
        return addRequestUpdate(service::updateProductionOrderComponentsUsingRAPBO, productionOrderComponentsUsingRAPBO);
    }

    @Nonnull
    @Override
    public APIPRODUCTIONORDER2SRVServiceBatchChangeSet deleteProductionOrderComponentsUsingRAPBO(
        @Nonnull
        final ProductionOrderComponentsUsingRAPBO productionOrderComponentsUsingRAPBO) {
        return addRequestDelete(service::deleteProductionOrderComponentsUsingRAPBO, productionOrderComponentsUsingRAPBO);
    }

    @Nonnull
    @Override
    public APIPRODUCTIONORDER2SRVServiceBatchChangeSet updateProductionOrderOperations(
        @Nonnull
        final ProductionOrderOperations productionOrderOperations) {
        return addRequestUpdate(service::updateProductionOrderOperations, productionOrderOperations);
    }

    @Nonnull
    @Override
    public APIPRODUCTIONORDER2SRVServiceBatchChangeSet createProductionOrder(
        @Nonnull
        final ProductionOrder productionOrder) {
        return addRequestCreate(service::createProductionOrder, productionOrder);
    }

    @Nonnull
    @Override
    public APIPRODUCTIONORDER2SRVServiceBatchChangeSet updateProductionOrder(
        @Nonnull
        final ProductionOrder productionOrder) {
        return addRequestUpdate(service::updateProductionOrder, productionOrder);
    }

}
