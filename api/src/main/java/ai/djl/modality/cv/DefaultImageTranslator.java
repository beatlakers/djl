/*
 * Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance
 * with the License. A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0/
 *
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package ai.djl.modality.cv;

import ai.djl.ndarray.NDList;
import ai.djl.translate.TranslatorContext;

public class DefaultImageTranslator extends ImageTranslator<NDList> {

    public DefaultImageTranslator(BaseBuilder<?> builder) {
        super(builder);
    }

    @Override
    public NDList processOutput(TranslatorContext ctx, NDList list) {
        list.detach();
        return list;
    }

    class Builder extends ImageTranslator.BaseBuilder<Builder> {

        @Override
        protected Builder self() {
            return this;
        }

        public DefaultImageTranslator build() {
            return new DefaultImageTranslator(this);
        }
    }
}