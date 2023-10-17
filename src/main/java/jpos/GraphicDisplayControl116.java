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
// GraphicDisplayControl116
//
// Interface definining all new capabilities, properties and methods
// that are specific to Graphic Display for release 1.16.
//
// Modification history
// ------------------------------------------------------------------
// 2023-Sep-28 JavaPOS Release 1.16                                MC
//
/////////////////////////////////////////////////////////////////////

package jpos;

import jpos.events.*;

public interface GraphicDisplayControl116 extends BaseControl
{
    // Capabilities
    public String getCapAssociatedHardTotalsDevice() throws JposException;
    public boolean getCapBrightness() throws JposException;
    public boolean getCapCompareFirmwareVersion() throws JposException;
    public boolean getCapImageType() throws JposException;
    public int getCapPowerReporting() throws JposException;
    public boolean getCapStatisticsReporting() throws JposException;
    public int getCapStorage() throws JposException;
    public boolean getCapUpdateFirmware() throws JposException;
    public boolean getCapUpdateStatistics() throws JposException;
    public boolean getCapURLBack() throws JposException;
    public boolean getCapURLForward() throws JposException;
    public boolean getCapVideoType() throws JposException;
    public boolean getCapVolume() throws JposException;

    // Properties
    public int getBrightness() throws JposException;
    public void setBrightness(int var1) throws JposException;
    public int getDisplayMode() throws JposException;
    public void setDisplayMode(int var1) throws JposException;
    public String getImageType() throws JposException;
    public void setImageType(String var1) throws JposException;
    public String getImageTypeList() throws JposException;
    public int getLoadStatus() throws JposException;
    public int getOutputID() throws JposException;
    public int getPowerNotify() throws JposException;
    public void setPowerNotify(int var1) throws JposException;
    public int getPowerState() throws JposException;
    public int getStorage() throws JposException;
    public void setStorage(int var1) throws JposException;
    public String getURL() throws JposException;
    public String getVideoType() throws JposException;
    public void setVideoType(String var1) throws JposException;
    public String getVideoTypeList() throws JposException;
    public int getVolume() throws JposException;
    public void setVolume(int var1) throws JposException;

    // Methods
    public void cancelURLLoading() throws JposException;
    public void clearOutput() throws JposException;
    public void compareFirmwareVersion(String var1, int[] var2) throws JposException;
    public void goURLBack() throws JposException;
    public void goURLForward() throws JposException;
    public void loadImage(String fileName) throws JposException;
    public void loadURL(String url) throws JposException;
    public void playVideo(String fileName, boolean loop) throws JposException;
    public void resetStatistics(String var1) throws JposException;
    public void retrieveStatistics(String[] var1) throws JposException;
    public void stopVideo() throws JposException;
    public void updateFirmware(String var1) throws JposException;
    public void updateStatistics(String var1) throws JposException;
    public void updateURLPage() throws JposException;

    // Event listener methods
    public void    addDirectIOListener(DirectIOListener l);
    public void    removeDirectIOListener(DirectIOListener l);
    public void    addErrorListener(ErrorListener l);
    public void    removeErrorListener(ErrorListener l);
    public void    addOutputCompleteListener(OutputCompleteListener l);
    public void    removeOutputCompleteListener(OutputCompleteListener l);
    public void    addStatusUpdateListener(StatusUpdateListener l);
    public void    removeStatusUpdateListener(StatusUpdateListener l);
}