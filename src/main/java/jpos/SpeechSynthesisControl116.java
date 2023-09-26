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

import jpos.events.*;

public interface SpeechSynthesisControl116 extends BaseControl {
    public boolean getCapCompareFirmwareVersion() throws JposException;

    public int getCapPowerReporting() throws JposException;

    public boolean getCapStatisticsReporting() throws JposException;

    public boolean getCapUpdateFirmware() throws JposException;

    public boolean getCapUpdateStatistics() throws JposException;

    public int getOutputID() throws JposException;

    public int getPowerNotify() throws JposException;

    public void setPowerNotify(int var1) throws JposException;

    public int getPowerState() throws JposException;

    public void clearOutput() throws JposException;

    public void compareFirmwareVersion(String var1, int[] var2) throws JposException;

    public void resetStatistics(String var1) throws JposException;

    public void retrieveStatistics(String[] var1) throws JposException;

    public void updateFirmware(String var1) throws JposException;

    public void updateStatistics(String var1) throws JposException;

    public boolean getCapLanguage() throws JposException;

    public boolean getCapPitch() throws JposException;

    public boolean getCapSpeed() throws JposException;

    public boolean getCapVoice() throws JposException;

    public boolean getCapVolume() throws JposException;

    public String getLanguage() throws JposException;

    public void setLanguage(String var1) throws JposException;

    public String getLanguageList() throws JposException;

    public String getOutputIDList() throws JposException;

    public int getPitch() throws JposException;

    public void setPitch(int var1) throws JposException;

    public int getSpeed() throws JposException;

    public void setSpeed(int var1) throws JposException;

    public String getVoice() throws JposException;

    public void setVoice(String var1) throws JposException;

    public String getVoiceList() throws JposException;

    public int getVolume() throws JposException;

    public void setVolume(int var1) throws JposException;

    public void speak(String text) throws JposException;

    public void speakImmediate(String text) throws JposException;

    public void stopCurrentSpeaking() throws JposException;

    public void stopSpeaking(int outputID) throws JposException;

    public void    addDirectIOListener(DirectIOListener l);
    public void    removeDirectIOListener(DirectIOListener l);
    public void    addErrorListener(ErrorListener l);
    public void    removeErrorListener(ErrorListener l);
    public void    addOutputCompleteListener(OutputCompleteListener l);
    public void    removeOutputCompleteListener(OutputCompleteListener l);
    public void    addStatusUpdateListener(StatusUpdateListener l);
    public void    removeStatusUpdateListener(StatusUpdateListener l);
}
