/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The git component is used for working with git repositories.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface GitEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Git component.
     */
    public interface GitEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        public default AdvancedGitEndpointConsumerBuilder advanced() {
            return (AdvancedGitEndpointConsumerBuilder) this;
        }
        /**
         * Local repository path.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default GitEndpointConsumerBuilder localPath(String localPath) {
            setProperty("localPath", localPath);
            return this;
        }
        /**
         * The branch name to work on.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default GitEndpointConsumerBuilder branchName(String branchName) {
            setProperty("branchName", branchName);
            return this;
        }
        /**
         * Remote repository password.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default GitEndpointConsumerBuilder password(String password) {
            setProperty("password", password);
            return this;
        }
        /**
         * The remote repository name to use in particular operation like pull.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default GitEndpointConsumerBuilder remoteName(String remoteName) {
            setProperty("remoteName", remoteName);
            return this;
        }
        /**
         * The remote repository path.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default GitEndpointConsumerBuilder remotePath(String remotePath) {
            setProperty("remotePath", remotePath);
            return this;
        }
        /**
         * The tag name to work on.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default GitEndpointConsumerBuilder tagName(String tagName) {
            setProperty("tagName", tagName);
            return this;
        }
        /**
         * Remote repository username.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default GitEndpointConsumerBuilder username(String username) {
            setProperty("username", username);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * The option is a <code>boolean</code> type.
         * @group consumer
         */
        public default GitEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * The option will be converted to a <code>boolean</code> type.
         * @group consumer
         */
        public default GitEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * The consumer type.
         * The option is a
         * <code>org.apache.camel.component.git.consumer.GitType</code> type.
         * @group consumer
         */
        public default GitEndpointConsumerBuilder type(GitType type) {
            setProperty("type", type);
            return this;
        }
        /**
         * The consumer type.
         * The option will be converted to a
         * <code>org.apache.camel.component.git.consumer.GitType</code> type.
         * @group consumer
         */
        public default GitEndpointConsumerBuilder type(String type) {
            setProperty("type", type);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Git component.
     */
    public interface AdvancedGitEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        public default GitEndpointConsumerBuilder basic() {
            return (GitEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * The option is a <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * @group consumer (advanced)
         */
        public default AdvancedGitEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * @group consumer (advanced)
         */
        public default AdvancedGitEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public default AdvancedGitEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public default AdvancedGitEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedGitEndpointConsumerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedGitEndpointConsumerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedGitEndpointConsumerBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedGitEndpointConsumerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Git component.
     */
    public static interface GitEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        public default AdvancedGitEndpointProducerBuilder advanced() {
            return (AdvancedGitEndpointProducerBuilder) this;
        }
        /**
         * Local repository path.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default GitEndpointProducerBuilder localPath(String localPath) {
            setProperty("localPath", localPath);
            return this;
        }
        /**
         * The branch name to work on.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default GitEndpointProducerBuilder branchName(String branchName) {
            setProperty("branchName", branchName);
            return this;
        }
        /**
         * Remote repository password.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default GitEndpointProducerBuilder password(String password) {
            setProperty("password", password);
            return this;
        }
        /**
         * The remote repository name to use in particular operation like pull.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default GitEndpointProducerBuilder remoteName(String remoteName) {
            setProperty("remoteName", remoteName);
            return this;
        }
        /**
         * The remote repository path.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default GitEndpointProducerBuilder remotePath(String remotePath) {
            setProperty("remotePath", remotePath);
            return this;
        }
        /**
         * The tag name to work on.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default GitEndpointProducerBuilder tagName(String tagName) {
            setProperty("tagName", tagName);
            return this;
        }
        /**
         * Remote repository username.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default GitEndpointProducerBuilder username(String username) {
            setProperty("username", username);
            return this;
        }
        /**
         * The flag to manage empty git commits.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        public default GitEndpointProducerBuilder allowEmpty(boolean allowEmpty) {
            setProperty("allowEmpty", allowEmpty);
            return this;
        }
        /**
         * The flag to manage empty git commits.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        public default GitEndpointProducerBuilder allowEmpty(String allowEmpty) {
            setProperty("allowEmpty", allowEmpty);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        public default GitEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        public default GitEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The operation to do on the repository.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public default GitEndpointProducerBuilder operation(String operation) {
            setProperty("operation", operation);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Git component.
     */
    public interface AdvancedGitEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        public default GitEndpointProducerBuilder basic() {
            return (GitEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedGitEndpointProducerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedGitEndpointProducerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedGitEndpointProducerBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedGitEndpointProducerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Git component.
     */
    public static interface GitEndpointBuilder
            extends
                GitEndpointConsumerBuilder, GitEndpointProducerBuilder {
        public default AdvancedGitEndpointBuilder advanced() {
            return (AdvancedGitEndpointBuilder) this;
        }
        /**
         * Local repository path.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default GitEndpointBuilder localPath(String localPath) {
            setProperty("localPath", localPath);
            return this;
        }
        /**
         * The branch name to work on.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default GitEndpointBuilder branchName(String branchName) {
            setProperty("branchName", branchName);
            return this;
        }
        /**
         * Remote repository password.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default GitEndpointBuilder password(String password) {
            setProperty("password", password);
            return this;
        }
        /**
         * The remote repository name to use in particular operation like pull.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default GitEndpointBuilder remoteName(String remoteName) {
            setProperty("remoteName", remoteName);
            return this;
        }
        /**
         * The remote repository path.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default GitEndpointBuilder remotePath(String remotePath) {
            setProperty("remotePath", remotePath);
            return this;
        }
        /**
         * The tag name to work on.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default GitEndpointBuilder tagName(String tagName) {
            setProperty("tagName", tagName);
            return this;
        }
        /**
         * Remote repository username.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default GitEndpointBuilder username(String username) {
            setProperty("username", username);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Git component.
     */
    public static interface AdvancedGitEndpointBuilder
            extends
                AdvancedGitEndpointConsumerBuilder, AdvancedGitEndpointProducerBuilder {
        public default GitEndpointBuilder basic() {
            return (GitEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedGitEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedGitEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedGitEndpointBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedGitEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.git.consumer.GitType</code> enum.
     */
    public static enum GitType {
        COMMIT, TAG, BRANCH;
    }
    /**
     * The git component is used for working with git repositories. Creates a
     * builder to build endpoints for the Git component.
     */
    public default GitEndpointBuilder git(String path) {
        class GitEndpointBuilderImpl extends AbstractEndpointBuilder implements GitEndpointBuilder, AdvancedGitEndpointBuilder {
            public GitEndpointBuilderImpl(String path) {
                super("git", path);
            }
        }
        return new GitEndpointBuilderImpl(path);
    }
}