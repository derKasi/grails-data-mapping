/* Copyright (C) 2011 SpringSource
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.grails.datastore.mapping.engine.internal;

import org.grails.datastore.mapping.config.Property;
import org.grails.datastore.mapping.model.PersistentProperty;
import org.grails.datastore.mapping.model.PropertyMapping;

/**
 * Utility methods for mapping logic
 *
 * @author Graeme Rocher
 * @since 1.0
 */
public class MappingUtils {
    public static String getTargetKey(PersistentProperty property) {
        PropertyMapping<Property> mapping = property.getMapping();
        String targetName;

        if(mapping != null && mapping.getMappedForm() != null) {
            String tmp = mapping.getMappedForm().getTargetName();
            targetName =  tmp != null ? tmp : property.getName() ;
        }
        else {
            targetName = property.getName();
        }
        return targetName;
    }
}
