/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */

package software.amazon.awssdk.services.codecatalyst.endpoints;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.annotations.SdkPublicApi;
import software.amazon.awssdk.endpoints.Endpoint;
import software.amazon.awssdk.endpoints.EndpointProvider;
import software.amazon.awssdk.services.codecatalyst.endpoints.internal.DefaultCodeCatalystEndpointProvider;

/**
 * An endpoint provider for CodeCatalyst. The endpoint provider takes a set of parameters using
 * {@link CodeCatalystEndpointParams}, and resolves an {@link Endpoint} base on the given parameters.
 */
@Generated("software.amazon.awssdk:codegen")
@SdkPublicApi
public interface CodeCatalystEndpointProvider extends EndpointProvider {
    /**
     * Compute the endpoint based on the given set of parameters.
     */
    CompletableFuture<Endpoint> resolveEndpoint(CodeCatalystEndpointParams endpointParams);

    /**
     * Compute the endpoint based on the given set of parameters.
     */
    default CompletableFuture<Endpoint> resolveEndpoint(Consumer<CodeCatalystEndpointParams.Builder> endpointParamsConsumer) {
        CodeCatalystEndpointParams.Builder paramsBuilder = CodeCatalystEndpointParams.builder();
        endpointParamsConsumer.accept(paramsBuilder);
        return resolveEndpoint(paramsBuilder.build());
    }

    static CodeCatalystEndpointProvider defaultProvider() {
        return new DefaultCodeCatalystEndpointProvider();
    }
}