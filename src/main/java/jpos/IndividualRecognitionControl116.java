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

public interface IndividualRecognitionControl116 extends BaseControl {
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

    public String getCapIndividualList() throws JposException;

    public String getIndividualIDs() throws JposException;

    public String getIndividualRecognitionFilter() throws JposException;

    public void setIndividualRecognitionFilter(String var1) throws JposException;

    public String getIndividualRecognitionInformation() throws JposException;

    public void    addDataListener(DataListener l);
    public void    removeDataListener(DataListener l);
    public void    addDirectIOListener(DirectIOListener l);
    public void    removeDirectIOListener(DirectIOListener l);
    public void    addErrorListener(ErrorListener l);
    public void    removeErrorListener(ErrorListener l);
    public void    addStatusUpdateListener(StatusUpdateListener l);
    public void    removeStatusUpdateListener(StatusUpdateListener l);
}
