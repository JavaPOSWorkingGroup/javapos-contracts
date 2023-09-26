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

public interface SoundPlayerService116 extends BaseService, JposServiceInstance {
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

    public String getCapAssociatedHardTotalsDevice() throws JposException;

    public boolean getCapMultiPlay() throws JposException;

    public String getCapSoundTypeList() throws JposException;

    public int getCapStorage() throws JposException;

    public boolean getCapVolume() throws JposException;

    public String getDeviceSoundList() throws JposException;

    public String getOutputIDList() throws JposException;

    public int getStorage() throws JposException;

    public void setStorage(int var1) throws JposException;

    public int getVolume() throws JposException;

    public void setVolume(int var1) throws JposException;

    public void playSound(String fileName, boolean loop) throws JposException;

    public void stopSound(int outputID) throws JposException;
}
