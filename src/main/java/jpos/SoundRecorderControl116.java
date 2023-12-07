//////////////////////////////////////////////////////////////////////
//
// The JavaPOS library source code is now under the CPL license, which 
// is an OSS Apache-like license. The complete license is located at:
//    http://www.ibm.com/developerworks/library/os-cpl.html
//
//////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////
//
// This software is provided "AS IS".  The JavaPOS working group (including
// each of the Corporate members, contributors and individuals)  MAKES NO
// REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE,
// EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED
// WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
// NON-INFRINGEMENT. The JavaPOS working group shall not be liable for
// any damages suffered as a result of using, modifying or distributing this
// software or its derivatives.Permission to use, copy, modify, and distribute
// the software and its documentation for any purpose is hereby granted.
//
// SoundRecorderControl116
//
// Interface definining all new capabilities, properties and methods
// that are specific to Sound Recorder for release 1.16.
//
// Modification history
// ------------------------------------------------------------------
// 2023-Sep-28 JavaPOS Release 1.16                                MC
//
/////////////////////////////////////////////////////////////////////

package jpos;

import jpos.events.*;

public interface SoundRecorderControl116 extends BaseControl
{
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

    public void compareFirmwareVersion(String firmwareFileName, int[] result) throws JposException;

    public void resetStatistics(String statisticsBuffer) throws JposException;

    public void retrieveStatistics(String[] statisticsBuffer) throws JposException;

    public void updateFirmware(String var1) throws JposException;

    public void updateStatistics(String var1) throws JposException;

    public String getCapAssociatedHardTotalsDevice() throws JposException;

    public boolean getCapChannel() throws JposException;

    public boolean getCapRecordingLevel() throws JposException;

    public boolean getCapSamplingRate() throws JposException;

    public boolean getCapSoundType() throws JposException;

    public int getCapStorage() throws JposException;

    public String getChannel() throws JposException;

    public void setChannel(String var1) throws JposException;

    public String getChannelList() throws JposException;

    public int getRecordingLevel() throws JposException;

    public void setRecordingLevel(int var1) throws JposException;

    public int getRemainingRecordingTimeInSec() throws JposException;

    public String getSamplingRate() throws JposException;

    public void setSamplingRate(String var1) throws JposException;

    public String getSamplingRateList() throws JposException;

    public byte[] getSoundData() throws JposException;

    public String getSoundType() throws JposException;

    public void setSoundType(String var1) throws JposException;

    public String getSoundTypeList() throws JposException;

    public int getStorage() throws JposException;

    public void setStorage(int var1) throws JposException;

    public void startRecording(String fileName, boolean overwrite, int recordingTime) throws JposException;

    public void stopRecording() throws JposException;

    public void    addDataListener(DataListener l);
    public void    removeDataListener(DataListener l);
    public void    addDirectIOListener(DirectIOListener l);
    public void    removeDirectIOListener(DirectIOListener l);
    public void    addErrorListener(ErrorListener l);
    public void    removeErrorListener(ErrorListener l);
    public void    addStatusUpdateListener(StatusUpdateListener l);
    public void    removeStatusUpdateListener(StatusUpdateListener l);
}
