/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.netbeans.modules.j2ee.jpa.verification;

import org.netbeans.api.java.source.CancellableTask;
import org.netbeans.api.java.source.CompilationInfo;
import org.netbeans.api.java.source.JavaSource.Phase;
import org.netbeans.api.java.source.JavaSource.Priority;
import org.netbeans.api.java.source.support.EditorAwareJavaSourceTaskFactory;
import org.openide.filesystems.FileObject;

/**
 * org.netbeans.modules.j2ee.jpa.verification.JPAProblemFinder
 * @author Tomasz.Slota@Sun.COM
 */
@org.openide.util.lookup.ServiceProvider(service=org.netbeans.api.java.source.JavaSourceTaskFactory.class)
public class JPAProblemFinderFactory extends EditorAwareJavaSourceTaskFactory {
    private FileObject file = null;
    
    public JPAProblemFinderFactory(){
        super(Phase.RESOLVED, Priority.BELOW_NORMAL);
    }
    
    public CancellableTask<CompilationInfo> createTask(FileObject file) {
        return new JPAProblemFinder.ProblemFinderCompInfo(file);
    }
}
