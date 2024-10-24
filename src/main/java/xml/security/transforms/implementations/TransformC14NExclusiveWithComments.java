/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.regexbyte.pos.utils.generateSignature.xml.security.transforms.implementations;

import  com.regexbyte.pos.utils.generateSignature.xml.security.c14n.implementations.Canonicalizer20010315Excl;
import  com.regexbyte.pos.utils.generateSignature.xml.security.c14n.implementations.Canonicalizer20010315ExclWithComments;
import  com.regexbyte.pos.utils.generateSignature.xml.security.transforms.Transforms;

/**
 * Implements the <CODE>http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments</CODE>
 * transform.
 *
 */
public class TransformC14NExclusiveWithComments extends TransformC14NExclusive {

    /**
     * {@inheritDoc}
     */
    @Override
    protected String engineGetURI() {
        return Transforms.TRANSFORM_C14N_EXCL_WITH_COMMENTS;
    }

    @Override
    protected Canonicalizer20010315Excl getCanonicalizer() {
        return new Canonicalizer20010315ExclWithComments();
    }

}
