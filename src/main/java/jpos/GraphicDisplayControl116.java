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

public interface GraphicDisplayControl116 extends BaseControl {
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

    public int getBrightness() throws JposException;

    public void setBrightness(int var1) throws JposException;

    public String getCapAssociatedHardTotalsDevice() throws JposException;

    public boolean getCapBrightness() throws JposException;

    public boolean getCapImageType() throws JposException;

    public int getCapStorage() throws JposException;

    public boolean getCapURLBack() throws JposException;

    public boolean getCapURLForward() throws JposException;

    public boolean getCapVideoType() throws JposException;

    public boolean getCapVolume() throws JposException;

    public int getDisplayMode() throws JposException;

    public void setDisplayMode(int var1) throws JposException;

    public String getImageType() throws JposException;

    public void setImageType(String var1) throws JposException;

    public String getImageTypeList() throws JposException;

    public int getLoadStatus() throws JposException;

    public int getStorage() throws JposException;

    public void setStorage(int var1) throws JposException;

    public int getURL() throws JposException;

    public String getVideoType() throws JposException;

    public void setVideoType(String var1) throws JposException;

    public String getVideoTypeList() throws JposException;

    public int getVolume() throws JposException;

    public void setVolume(int var1) throws JposException;

    public void cancelURLLoading() throws JposException;

    public void goURLBack() throws JposException;

    public void goURLForward() throws JposException;

    public void loadImage(String fileName) throws JposException;

    public void loadURL(String url) throws JposException;

    public void playVideo(String fileName, boolean loop) throws JposException;

    public void stopVideo() throws JposException;

    public void updateURLPage() throws JposException;

    public void    addDirectIOListener(DirectIOListener l);
    public void    removeDirectIOListener(DirectIOListener l);
    public void    addErrorListener(ErrorListener l);
    public void    removeErrorListener(ErrorListener l);
    public void    addOutputCompleteListener(OutputCompleteListener l);
    public void    removeOutputCompleteListener(OutputCompleteListener l);
    public void    addStatusUpdateListener(StatusUpdateListener l);
    public void    removeStatusUpdateListener(StatusUpdateListener l);
}
