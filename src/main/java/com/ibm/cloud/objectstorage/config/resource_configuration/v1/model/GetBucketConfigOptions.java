/*
 * Copyright 2018 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.objectstorage.config.resource_configuration.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.Validator;

/**
 * The getBucketConfig options.
 */
public class GetBucketConfigOptions extends GenericModel {

  private String bucket;

  /**
   * Builder.
   */
  public static class Builder {
    private String bucket;

    private Builder(GetBucketConfigOptions getBucketConfigOptions) {
      bucket = getBucketConfigOptions.bucket;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param bucket the bucket
     */
    public Builder(String bucket) {
      this.bucket = bucket;
    }

    /**
     * Builds a GetBucketConfigOptions.
     *
     * @return the getBucketConfigOptions
     */
    public GetBucketConfigOptions build() {
      return new GetBucketConfigOptions(this);
    }

    /**
     * Set the bucket.
     *
     * @param bucket the bucket
     * @return the GetBucketConfigOptions builder
     */
    public Builder bucket(String bucket) {
      this.bucket = bucket;
      return this;
    }
  }

  private GetBucketConfigOptions(Builder builder) {
    Validator.notEmpty(builder.bucket, "bucket cannot be empty");
    bucket = builder.bucket;
  }

  /**
   * New builder.
   *
   * @return a GetBucketConfigOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the bucket.
   *
   * Name of a bucket.
   *
   * @return the bucket
   */
  public String bucket() {
    return bucket;
  }
}

