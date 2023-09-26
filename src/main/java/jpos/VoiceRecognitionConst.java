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
 * All constants extracted from OPOS header OposVrcg.h
 */
public interface VoiceRecognitionConst {
    // HearingResult

    public static final int VRCG_HRESULT_FREE                   = 11;
    public static final int VRCG_HRESULT_SENTENCE               = 21;
    public static final int VRCG_HRESULT_WORD                   = 31;
    public static final int VRCG_HRESULT_YESNO_YES              = 41;
    public static final int VRCG_HRESULT_YESNO_NO               = 42;
    public static final int VRCG_HRESULT_YESNO_CANCEL           = 43;

    // HearingStatus

    public static final int VRCG_HSTATUS_NONE                   =  0;
    public static final int VRCG_HSTATUS_FREE                   = 10;
    public static final int VRCG_HSTATUS_SENTENCE               = 20;
    public static final int VRCG_HSTATUS_WORD                   = 30;
    public static final int VRCG_HSTATUS_YESNO                  = 40;

    // StatusUpdateEvent

    public static final int VRCG_SUE_STOP_HEARING               =  0;
    public static final int VRCG_SUE_START_HEARING_FREE         = 10;
    public static final int VRCG_SUE_START_HEARING_SENTENCE     = 20;
    public static final int VRCG_SUE_START_HEARING_WORD         = 30;
    public static final int VRCG_SUE_START_HEARING_YESNO        = 40;
}
