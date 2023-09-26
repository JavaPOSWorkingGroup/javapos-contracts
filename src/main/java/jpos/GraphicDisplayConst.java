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
 * All constants extracted from OPOS header OposGdsp.h
 */
public interface GraphicDisplayConst {
    // CapStorage, Storage

    public static final int GDSP_CST_HOST_ONLY       = 1;
    public static final int GDSP_CST_HARDTOTALS_ONLY = 2;
    public static final int GDSP_CST_ALL             = 3;
    public static final int GDSP_ST_HOST             = 1;
    public static final int GDSP_ST_HARDTOTALS       = 2;
    public static final int GDSP_ST_HOST_HARDTOTALS  = 3;

    // DisplayMode

    public static final int GDSP_DMODE_HIDDEN        = 1;
    public static final int GDSP_DMODE_IMAGE_FIT     = 2;
    public static final int GDSP_DMODE_IMAGE_FILL    = 3;
    public static final int GDSP_DMODE_IMAGE_CENTER  = 4;
    public static final int GDSP_DMODE_VIDEO_NORMAL  = 5;
    public static final int GDSP_DMODE_VIDEO_FULL    = 6;
    public static final int GDSP_DMODE_WEB           = 7;

    // LoadStatus

    public static final int GDSP_LSTATUS_START       = 1;
    public static final int GDSP_LSTATUS_FINISH      = 2;
    public static final int GDSP_LSTATUS_CANCEL      = 3;

    // StatusUpdateEvent

    public static final int GDSP_SUE_START_IMAGE_LOAD    = 11;
    public static final int GDSP_SUE_END_IMAGE_LOAD      = 12;
    public static final int GDSP_SUE_START_LOAD_WEBPAGE  = 21;
    public static final int GDSP_SUE_FINISH_LOAD_WEBPAGE = 22;
    public static final int GDSP_SUE_CANCEL_LOAD_WEBPAGE = 23;
    public static final int GDSP_SUE_START_PLAY_VIDEO    = 31;
    public static final int GDSP_SUE_STOP_PLAY_VIDEO     = 32;

    // ResultCodeExtended

    public static final int OPOS_EGDSP_NOROOM        = 201; // (Several)
}
