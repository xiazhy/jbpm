/**
 * Copyright 2011 JBoss Inc
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
package org.jbpm.test.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.jbpm.test.TaskServerType;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface HumanTaskSupport {

	String[] users() default {};
	String[] groups() default {};
	String persistenceUnit();
	TaskServerType type() default TaskServerType.MINA_ASYNC; 
	
	String host() default "localhost";
	int port() default 9123;
}