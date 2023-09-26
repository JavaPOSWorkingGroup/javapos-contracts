/*
 * Copyright 2023 Martin Conrad
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package jpos;

/**
 * All constants extracted from OPOS header OposSpch.h
 */
public interface SpeechSynthesisConst {
    // StatusUpdateEvent

    public static final int SPCH_SUE_START_SPEAK =  11;
    public static final int SPCH_SUE_STOP_SPEAK  =  12;
}
