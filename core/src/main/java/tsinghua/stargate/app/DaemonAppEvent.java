/*
 * Copyright 2017 The Tsinghua University
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package tsinghua.stargate.app;

import tsinghua.stargate.event.AbstractEvent;
import tsinghua.stargate.rpc.message.entity.ApplicationId;

public class DaemonAppEvent extends AbstractEvent<DaemonAppEventType> {

  private final ApplicationId appId;

  public DaemonAppEvent(ApplicationId appId, DaemonAppEventType type) {
    super(type);
    this.appId = appId;
  }

  public ApplicationId getApplicationId() {
    return this.appId;
  }
}
