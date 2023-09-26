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

package jpos.services;

import jpos.JposException;
import jpos.loader.JposServiceInstance;

public interface VoiceRecognitionService116 extends BaseService, JposServiceInstance {
    public boolean getAutoDisable() throws JposException;

    public void setAutoDisable(boolean var1) throws JposException;

    public boolean getCapCompareFirmwareVersion() throws JposException;

    public int getCapPowerReporting() throws JposException;

    public boolean getCapStatisticsReporting() throws JposException;

    public boolean getCapUpdateFirmware() throws JposException;

    public boolean getCapUpdateStatistics() throws JposException;

    public int getDataCount() throws JposException;

    public boolean getDataEventEnabled() throws JposException;

    public void setDataEventEnabled(boolean var1) throws JposException;

    public int getPowerNotify() throws JposException;

    public void setPowerNotify(int var1) throws JposException;

    public int getPowerState() throws JposException;

    public void clearInput() throws JposException;

    public void clearInputProperties() throws JposException;

    public void compareFirmwareVersion(String var1, int[] var2) throws JposException;

    public void resetStatistics(String var1) throws JposException;

    public void retrieveStatistics(String[] var1) throws JposException;

    public void updateFirmware(String var1) throws JposException;

    public void updateStatistics(String var1) throws JposException;

    public boolean getCapLanguage() throws JposException;

    public String getHearingDataPattern() throws JposException;

    public String getHearingDataWord() throws JposException;

    public String getHearingDataWordList() throws JposException;

    public int getHearingResult() throws JposException;

    public int getHearingStatus() throws JposException;

    public String getLanguageList() throws JposException;

    public void startHearingFree(String language) throws JposException;

    public void startHearingSentence(String language, String wordList, String patternList) throws JposException;

    public void startHearingWord(String language, String wordList) throws JposException;

    public void startHearingYesNo(String language) throws JposException;

    public void stopHearing() throws JposException;
}
