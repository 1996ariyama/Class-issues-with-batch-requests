
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.10.0
 */

package com.sap.cloud.sdk.tutorial.datamodel.odata.namespaces.productionorder2srv;

import java.net.URI;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.sap.cloud.sdk.cloudplatform.connectivity.Destination;
import com.sap.cloud.sdk.datamodel.odata.helper.SingleValuedFluentHelperFunction;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;


/**
 * Fluent helper for the <b>TechlyCmpltOrder</b> OData function import.
 * 
 */
public class TechlyCmpltOrderFluentHelper
    extends SingleValuedFluentHelperFunction<TechlyCmpltOrderFluentHelper, FunctionMessage, FunctionMessage>
{

    private final Map<String, Object> values = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will execute the <b>TechlyCmpltOrder</b> OData function import with the provided parameters. To perform execution, call the {@link #executeRequest executeRequest} method on the fluent helper object.
     * 
     * @param servicePath
     *     Service path to be used to call the functions against.
     * @param manufacturingOrder
     *     Constraints: Not nullable, Maximum length: 12<p>Original parameter name from the Odata EDM: <b>ManufacturingOrder</b></p>
     */
    public TechlyCmpltOrderFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final String manufacturingOrder) {
        super(servicePath);
        values.put("ManufacturingOrder", manufacturingOrder);
    }

    @Override
    @Nonnull
    protected Class<FunctionMessage> getEntityClass() {
        return FunctionMessage.class;
    }

    @Override
    @Nonnull
    protected String getFunctionName() {
        return "TechlyCmpltOrder";
    }

    @Override
    @Nullable
    protected JsonElement refineJsonResponse(
        @Nullable
        JsonElement jsonElement) {
        if ((jsonElement instanceof JsonObject)&&((JsonObject) jsonElement).has(getFunctionName())) {
            jsonElement = ((JsonObject) jsonElement).get(getFunctionName());
        }
        return super.refineJsonResponse(jsonElement);
    }

    @Override
    @Nonnull
    protected Map<String, Object> getParameters() {
        return values;
    }

    @Override
    @Nonnull
    protected HttpUriRequest createRequest(
        @Nonnull
        final URI uri) {
        return new HttpPost(uri);
    }

    /**
     * Execute this function import.
     * 
     */
    @Override
    @Nullable
    public FunctionMessage executeRequest(
        @Nonnull
        final Destination destination) {
        return super.executeSingle(destination);
    }

}
