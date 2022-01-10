/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License
 * 2.0 and the Server Side Public License, v 1; you may not use this file except
 * in compliance with, at your election, the Elastic License 2.0 or the Server
 * Side Public License, v 1.
 */

package org.elasticsearch.plugins;

import org.elasticsearch.index.IndexSettings;
import org.elasticsearch.index.codec.CodecService;
import org.elasticsearch.index.mapper.MapperService;

import java.io.IOException;
import java.util.Optional;

public interface CodecServicePlugin {
    @FunctionalInterface
    interface CodecServiceFactory {
        CodecService newCodecService(MapperService mapperService) throws IOException;
    }

    Optional<CodecServiceFactory> getCodecServiceFactory(IndexSettings indexSettings);
}
