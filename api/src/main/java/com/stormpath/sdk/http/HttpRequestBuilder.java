/*
 * Copyright 2014 Stormpath, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stormpath.sdk.http;

import java.util.Map;

/**
 * A <a href="http://en.wikipedia.org/wiki/Builder_pattern">Builder design pattern</a> used to
 * construct {@link HttpRequest} instances.
 *
 * <p>The {@link HttpRequestBuilder} is useful to build {@link HttpRequest} instances for developers that don't
 * have access to the Servlet container, and therefore, cannot execute operations using implementations
 * of the {@code javax.servlet.HttpServlet} api.</p>
 *
 * @see HttpRequest
 * @see HttpRequests
 * @see com.stormpath.sdk.application.Application#authenticateApiRequest(Object)
 * @see com.stormpath.sdk.application.Application#authenticateOauthRequest(Object)
 * @since 1.0.RC
 */
public interface HttpRequestBuilder {

    /**
     * Sets the HTTP Headers that will be present in the resulting request instance.
     *
     * @param headers the HTTP Headers that will be present in the resulting built request instance.
     * @return the builder instance for method chaining.
     * @throws IllegalArgumentException if the method argument is {@code null}.
     */
    public HttpRequestBuilder headers(Map<String, String[]> headers) throws IllegalArgumentException;

    /**
     * Sets the request parameters that will be present in the resulting request instance.
     *
     * @param parameters the request parameters that will be present in the resulting request instance.
     * @return the builder instance for method chaining.
     */
    public HttpRequestBuilder parameters(Map<String, String[]> parameters);

    /**
     * Sets the query parameters that will be present in the resulting request instance.
     *
     * @param queryParameters the query parameters that will be present in the resulting request instance.
     * @return the builder instance for method chaining.
     */
    public HttpRequestBuilder queryParameters(String queryParameters);

    /**
     * Returns a new {@code HttpRequest} instance reflecting the current builder state.
     *
     * @return a new {@code HttpRequest} instance reflecting the current builder state.
     */
    public HttpRequest build();
}
