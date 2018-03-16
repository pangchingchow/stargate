/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package tsinghua.stargate.event;

import tsinghua.stargate.annotation.InterfaceAudience.Public;
import tsinghua.stargate.annotation.InterfaceStability.Evolving;

@Public
@Evolving
public abstract class AbstractEvent<TYPE extends Enum<TYPE>>
    implements Event<TYPE> {

  private final TYPE type;
  private final long timestamp;

  public AbstractEvent(TYPE type) {
    this.type = type;
    this.timestamp = -1L;
  }

  public AbstractEvent(TYPE type, long timestamp) {
    this.type = type;
    this.timestamp = timestamp;
  }

  public long getTimestamp() {
    return this.timestamp;
  }

  public TYPE getType() {
    return this.type;
  }

  public String toString() {
    return "EventType: " + this.getType();
  }
}