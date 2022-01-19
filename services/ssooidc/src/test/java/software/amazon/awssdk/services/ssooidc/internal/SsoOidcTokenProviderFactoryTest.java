/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package software.amazon.awssdk.services.ssooidc.internal;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import software.amazon.awssdk.auth.token.SsoOidcTokenProviderFactoryProperties;
import software.amazon.awssdk.services.ssooidc.SsoOidcTokenProviderFactory;

public class SsoOidcTokenProviderFactoryTest {
    @Test
    public void create_usesStartUrlFromProperties() {
        String startUrl = "https://my-start-url.com";
        SsoOidcTokenProviderFactoryProperties props = SsoOidcTokenProviderFactoryProperties.builder().
                                                                                           startUrl(startUrl)
                                                                                           .build();

        SsoTokenProvider provider = (SsoTokenProvider) new SsoOidcTokenProviderFactory().create(props);

        Assertions.assertThat(provider.startUrl()).isEqualTo(startUrl);
    }
}
