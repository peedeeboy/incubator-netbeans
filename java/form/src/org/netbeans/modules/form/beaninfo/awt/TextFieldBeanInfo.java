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

package org.netbeans.modules.form.beaninfo.awt;

import java.beans.*;
import java.awt.TextField;

/** A BeanInfo for java.awt.TextField.
*
* @author Ales Novak
*/
public class TextFieldBeanInfo extends ComponentBeanInfo.Support {

    public TextFieldBeanInfo() {
        super("textfield", java.awt.TextField.class); // NOI18N
    }

    @Override
    public BeanInfo[] getAdditionalBeanInfo() {
        return new BeanInfo[] { new TextComponentBeanInfo(), new ComponentBeanInfo() };
    }

    /** @return Propertydescriptors */
    @Override
    public PropertyDescriptor[] createPDs() throws IntrospectionException {
        return new PropertyDescriptor[] {
            new PropertyDescriptor("columns", TextField.class), // NOI18N
            new PropertyDescriptor("echoChar", TextField.class), // NOI18N
        };
    }
}
