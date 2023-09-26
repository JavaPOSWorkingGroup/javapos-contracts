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
 * All constants extracted from OPOS header OposVcap.h
 */
public interface VideoCaptureConst {
    // CapStorage, Storage

    public static final int VCAP_CST_HOST_ONLY       = 1;
    public static final int VCAP_CST_HARDTOTALS_ONLY = 2;
    public static final int VCAP_CST_ALL             = 3;
    public static final int VCAP_ST_HOST             = 1;
    public static final int VCAP_ST_HARDTOTALS       = 2;
    public static final int VCAP_ST_HOST_HARDTOTALS  = 3;

    // VideoCaptureMode

    public static final int VCAP_VCMODE_PHOTO        = 1;
    public static final int VCAP_VCMODE_VIDEO        = 2;

    // StatusUpdateEvent

    public static final int VCAP_SUE_START_PHOTO            = 11;
    public static final int VCAP_SUE_END_PHOTO              = 12;
    public static final int VCAP_SUE_START_VIDEO            = 21;
    public static final int VCAP_SUE_STOP_VIDEO             = 22;

    // ResultCodeExtended

    public static final int OPOS_EVCAP_NOROOM        = 201; // (Several)
}
